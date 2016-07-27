package com.raintype;

import com.raintype.domain.UserVO;
import com.raintype.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CouponBackofficeApplication.class)
@WebAppConfiguration
public class CouponBackofficeApplicationTests {
	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory sqlSession;

	@Autowired
	private UserMapper mapper;


	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnection() throws Exception{
		System.out.println(ds);

		Connection con = ds.getConnection();
		System.out.println(con);

		con.close();
	}

	@Test
	public void testSqlSession() throws Exception {
		System.out.println(sqlSession);
	}

	@Test
	public void testLogin()throws Exception{
		String userid = "raintype";
		String userpw = "test12";

		UserVO vo = mapper.login(userid, userpw);

		System.out.println(vo);
	}

}
