package com.rc.dl.test;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.rc.dl.bean.FItem;
import com.rc.dl.bean.Post;
import com.rc.dl.bean.User;
import com.rc.dl.common.Constant;
import com.rc.dl.dao.IFItemDao;
import com.rc.dl.dao.IPostDao;
import com.rc.dl.dao.IUserDao;
import com.rc.dl.service.IFItemService;
import com.rc.dl.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration({ "classpath*:config/applicationContext-common.xml",
		"classpath*:config/applicationContext-beans.xml"})
// 指定Spring的配置文件 /为classpath下
@Transactional //对所有的测试方法都使用事务，并在测试完成后回滚事务
public class TestService extends
		AbstractTransactionalJUnit4SpringContextTests {
	// @Autowired
	// private ApplicationContext appplicationContext;
	// //自动注入applicationContext，这样就可以使用appli*.getBean("beanName")
	// @Resource //会自动注入 default by type
	// private IUserDao userDao;
	// @Resource
	// private IUserService userService;

	@Resource
	// 会自动注入 default by type
	private IFItemDao fitemDao;
	@Resource
	private IUserDao userDao;
	@Resource
	private IPostDao postDao;
	
	
	
	
	@Resource
	private IFItemService fitemService;

	// @Resource
	// private IFItemService fitemService;

	@Before
	// 在每个测试用例方法之前都会执行
	public void init() {
	}

	@After
	// 在每个测试用例执行完之后执行
	public void destory() {
	}

	@Test
	@Transactional
	// 使用该注释会使用事务，而且在测试完成之后会回滚事务，也就是说在该方法中做出的一切操作都不会对数据库中的数据产生任何影响
	@Rollback(false) //这里设置为false，就让事务不回滚
	public void testAdd() {
		// Assert.assertNotNull(userDao);
		// Assert.assertNotNull(userService);
		Assert.assertNotNull(postDao);
//		Assert.assertNotNull(fitemService);

//		fitemDao.doUpdatePV(19, 19);
//		fitemService.clickToUpPV(19, 19);
//		System.out.println(fitemDao.findAll(null).get(0).getPv());
//		User user = new User();
//		user.setId(1);
//		user.setUserName("linys");
//		user.setPassword("linys");
//		userDao.doCreate(user);
		
		//add
//		FItem item = new FItem();
//		item.setName("fashion item 4");
//		item.setPv(20);
//		fitemDao.doCreate(item);
		Post p = new Post();
		p.setTitle("title1");
		p.setUserId(1);
		p.setContent("contetn");
		postDao.doCreate(p);

	}

	public void testTest() {

	}
}
