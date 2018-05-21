## 1.实验内容
搭建springJDBC环境，并进行测试。
## 2.效果图
#### JUnit测试结果
![image](https://note.youdao.com/yws/public/resource/123b8fe93561268dac41e5ef37355808/xmlnote/7FEEDAA5AB64432689C697C0DB123B97/233)
## 3.测试代码
    /**
     * 
     */
    package com.demo.dao;
    
    import java.util.List;
    
    import org.springframework.jdbc.core.BeanPropertyRowMapper;
    import org.springframework.jdbc.core.JdbcTemplate;
    
    import com.demo.bean.User;
    
    /**
     * @author ASUS
     *
     */
    public class UserDaoImpl implements IUserDao {
    
    	private JdbcTemplate jdbcTemplate;
    	
    	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    		this.jdbcTemplate = jdbcTemplate;
    	}
    	/* (non-Javadoc)
    	 * @see com.demo.dao.IUserDao#getCountUser()
    	 */
    	@Override
    	public long getCountUser() {
    		String sql="select count(*) from member";
    	      Long count=jdbcTemplate.queryForObject(sql, Long.class);
    	      System.out.println(count);
    	      return count;
    	}
    
    	/* (non-Javadoc)
    	 * @see com.demo.dao.IUserDao#addUser(com.demo.bean.User)
    	 */
    	@Override
    	public void addUser(User u) {
    		String sql="insert into member(user_name,user_pwd) values(?,?)";
    		jdbcTemplate.update(sql,u.getUserName(),u.getUserPwd());
    
    	}
    
    	/* (non-Javadoc)
    	 * @see com.demo.dao.IUserDao#getUserById(int)
    	 */
    	@Override
    	public User getUserById(int ID) {
    		// TODO Auto-generated method stub
    		return null;
    
    	}
    	@Override
    	public List<User> loadUsers() {
    		String sql="select rownum as id,user_name,user_pwd from member";
    		List<User> userList =  jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
    		return userList;
    	}
    
    }

