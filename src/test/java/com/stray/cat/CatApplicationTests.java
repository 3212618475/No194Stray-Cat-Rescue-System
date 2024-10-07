package com.stray.cat;

import com.stray.cat.dao.UserMapper;
import com.stray.cat.notification.EmailService;
import com.stray.cat.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class CatApplicationTests {

    @Autowired
    EmailService emailService;



}
