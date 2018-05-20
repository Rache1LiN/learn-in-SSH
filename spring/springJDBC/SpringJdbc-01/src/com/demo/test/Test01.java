/**
 * 
 */
package com.demo.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.bean.User;
import com.demo.dao.IUserDao;
import com.demo.service.UserService;

/**
 * @author ASUS
 *
 */
public class Test01 {

	@Test
	public void test() {
		//数据库连接池
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@10.143.184.22:1521:orcl");
		dataSource.setUsername("homework");
		dataSource.setPassword("abc123");
		//实例化JDBCTemplete对象
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		//数据源注入到JdbcTemplate
		jdbcTemplate.setDataSource(dataSource);
		String sql="select count(*) from member";
		Long count=jdbcTemplate.queryForObject(sql, Long.class);
		System.out.println(count);
	}
	@Test
	public void test2() {
		//获取Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		//IUserDao userDao=(IUserDao)context.getBean("userDao");
		UserService userService=(UserService)context.getBean("userService");
		List<User> userList=userService.loadUsers();
		System.out.println("用户表："+userList);
	}
	@Test
	public void test3() {
		//获取Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		//IUserDao userDao=(IUserDao)context.getBean("userDao");
		UserService userService=(UserService)context.getBean("userService");
		long count=userService.getCountUser();
		System.out.println("用户总数"+count);
	}
	@Test
	public void test4() {
		//获取Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		//IUserDao userDao=(IUserDao)context.getBean("userDao");
		UserService userService=(UserService)context.getBean("userService");
		userService.addUser(new User("zhangsa","333"));
		System.out.println("添加成功");
	}



}
