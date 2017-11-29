package com.chengjf.admin.security;

import com.google.common.collect.Lists;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by jeff on 2017/11/29.
 */
@Repository
public class UserRepository {
    public User findByUsername(final String username) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String encode = encoder.encode(username);
        LocalDate date = LocalDate.of(2017,2,1);
        User user = User.builder().id(username).username(username).password(encode).email("1@2.com").lastPasswordResetDate(
                Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())
        ).roles(
                Lists.newArrayList("root")
        ).build();

        return user;
    }

    public User insert(User userToAdd) {

        return userToAdd;
    }
}
