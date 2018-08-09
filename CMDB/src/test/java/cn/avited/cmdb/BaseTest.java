package cn.avited.cmdb;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName BaseTest
 * @Description 用来配置spring和junit整合，junit启动加载springIOC容器
 * @Author xulei
 * @Date 2018/8/8 15:51
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
//通知junit spring的配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
