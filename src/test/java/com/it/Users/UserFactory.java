package com.it.Users;

import com.it.Common.Constants;
import com.it.Utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
   static ResourceBundle user = ResourceBundle.getBundle("user");

    public static User getValidUser() {
        return  new User(user.getString("username"),user.getString("password"),user.getString("email"));
    }
    public static User getRandomUser() {
        return  new User(Utils.String.getRandom(10), Constants.PASSWORD,Utils.String.getRandom(6)+"@gmail.com");
    }
    public static List<User> getRandomUsers(int count) {
        return Stream.generate(UserFactory::getRandomUser).limit(count).collect(Collectors.toList());
    }
}
