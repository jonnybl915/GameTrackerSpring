package com.theironyard.services;

import com.theironyard.entities.User;

/**
 * Created by zach on 3/9/16.
 */
public interface UserRepository {
    User findFirstByName(String userName);
}
