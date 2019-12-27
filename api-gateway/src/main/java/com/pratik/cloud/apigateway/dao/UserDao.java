package com.pratik.cloud.apigateway.dao;

/**
 * @author pgaikwad
 */
import com.pratik.cloud.apigateway.enitity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
}