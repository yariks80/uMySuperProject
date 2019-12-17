package com.it.Tests;

import com.it.Users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test1() {
        System.out.println(UserFactory.getRandomUser());
        System.out.println(UserFactory.getRandomUsers(20));
        app.login.login(validUser);
        Assert.assertEquals( app.dashboard.getEmailUser(), validUser.email);
    }
}
