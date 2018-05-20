/**
 * 
 */
package edu.fjnu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import edu.fjnu.bean.Member;

/**
 * @author ASUS
 *
 */
@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	@Override
	public void addUser(Member member) {
		String sql= "insert into member(user_name,user_pass,user_address,user_mail,user_phone,user_sex) values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql,member.getUserName(),member.getUserPass(),member.getUserAddress(),member.getUserMail(),member.getUserPhone(),member.getUserSex());
	}

	@Override
	public List<Member> loadAllUsers() {
		String sql="select rownum as user_id,m.* from member m";
		List<Member> memberList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Member>(Member.class));
		return memberList;
	}

	@Override
	public Member findUserById(Long userId) {
		String sql= "select * from (select rownum as user_id,m.* from member m) a where a.user_id=?";
		Member member = jdbcTemplate.queryForObject(sql, new Object[]{userId} ,new BeanPropertyRowMapper<Member>(Member.class));
		return member;
	}

	@Override
	public void updateUser(Member member) {
		String sql="update member set user_name=?,user_address=?,user_phone=?,user_mail=?,user_sex=?,user_pass=? where rownum=?";
		jdbcTemplate.update(sql,member.getUserName(),member.getUserAddress(),member.getUserPhone(),member.getUserMail(),member.getUserSex(),member.getUserPass(),member.getUserId());
		
	}

	@Override
	public Long findIdByName(String userName) {
		String sql= "select rownum as user_id,m.* from member m where user_name=?";
		
		Member member = jdbcTemplate.queryForObject(sql, new Object[]{userName} ,new BeanPropertyRowMapper<Member>(Member.class));
		return member.getUserId();
	}

	@Override
	public void delete(Long userId) {
		String sql = "delete from member where rownum=?";
		jdbcTemplate.update(sql,userId);
		
	}

}
