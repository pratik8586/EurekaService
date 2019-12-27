package com.pratik.cloud.apigateway.service;

import com.pratik.cloud.apigateway.enitity.User;

/**
 * @author pgaikwad
 */
public interface UserService {
    User findByUsername(String username);
}
