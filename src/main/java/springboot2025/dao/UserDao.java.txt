package com.spring.boot.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.User;

@Repository
public class UserDao {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String USER_HASH_KEY = "USER12";
    private static final String USER_ID_COUNTER_KEY = "user:id:counter";

    // Save single user to Redis
    public User save(User user) {
        if (user.getUserId() == null) {
            long id = redisTemplate.opsForValue().increment(USER_ID_COUNTER_KEY);
            user.setUserId(id);
        }
        redisTemplate.opsForHash().put(USER_HASH_KEY, user.getUserId().toString(), user);
        return user;
    }

    // Save multiple users to Redis
    public List<User> saveAll(List<User> users) {
        for (User user : users) {
            long id = redisTemplate.opsForValue().increment(USER_ID_COUNTER_KEY);
            user.setUserId(id);
            redisTemplate.opsForHash().put(USER_HASH_KEY, String.valueOf(id), user);
        }
        return users;
    }
    
    

    // Get a user by ID
    public User get(Long userId) {
        return (User) redisTemplate.opsForHash().get(USER_HASH_KEY, userId.toString());
    }

    // Get all users
    public Map<Object, Object> findAll() {
        return redisTemplate.opsForHash().entries(USER_HASH_KEY);
    }

    // Delete a user by ID
    public void delete(Long userId) {
        redisTemplate.opsForHash().delete(USER_HASH_KEY, userId.toString());
    }
}
