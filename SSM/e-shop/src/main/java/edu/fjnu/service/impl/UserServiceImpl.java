/**
 * 
 */
package edu.fjnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fjnu.bean.User;
import edu.fjnu.bean.User;
import edu.fjnu.mapper.UserMapper;
import edu.fjnu.mapper.UserMapper;
import edu.fjnu.mapper.UserMapper;
import edu.fjnu.mapper.UserMapper;
import edu.fjnu.service.UserService;
import edu.fjnu.util.DBUtil;

/**
 * @author ASUS
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	
	@Override
	public int insertUser(User user) {
		SqlSession session = DBUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            int index=mapper.insertUser(user);
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public int updateUser(User user) {
		SqlSession session = DBUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            int index=mapper.updateUser(user);
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public int deleteUser(String userName) {
		SqlSession session=DBUtil.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            int index=mapper.deleteUser(userName); 
            session.commit(); 
            return index;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback(); 
            return -1;
        }finally{
            session.close();
        }
	}
	@Override
	public User selectUserByName(String userName) {
		SqlSession session=DBUtil.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
        User user= mapper.selectUserByName(userName);
        session.commit();
        	return user;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	@Override
	public List<User> selectAllUser() {
		SqlSession session=DBUtil.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        List<User> userList= new ArrayList<User>();
        try {
        userList =mapper.selectAllUser();
        session.commit();
        return userList;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return null;
        }finally{
            session.close();
        }
	}
	
	
}
