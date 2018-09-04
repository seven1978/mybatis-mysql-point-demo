package com.dongnaoedu;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dongnaoedu.model.User;
import com.dongnaoedu.service.UserService;
import com.dongnaoedu.vo.Location;

/**
 * 单元测试
 * 
 * @author 动脑学院.Tony老师
 * @see 专注在职IT人员能力提升，咨询顾问QQ: 2048209527
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisDemoApplication.class)
public class MybatisDemoApplicationTests {

    @Before
    public void say() {
        System.out.println("测试之前记得配置数据库...note[need init database]...");
    }

    @Autowired
    UserService userService;

    // insert 
    @Test
    public void insertTest() {
        User user = new User();
        user.setUserId((int) (System.currentTimeMillis() / 1000));
        user.setUserName("Tony");
        user.setPhone("10086");
        user.setPassword("12345");
        user.setLocation(new Location("9", "10"));
        userService.addUser(user);
    }

    // query
    @Test
    public void selectTest() {
        List<User> findAllUser = userService.findAllUser(1, 10);
        for (User user : findAllUser) {
            System.out.println(user);
        }
    }
}
