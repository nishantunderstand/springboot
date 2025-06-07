package com.spring.boot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RedisTests {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void testGetUserFromRedis() {
		// Get the value for key "user"
		Object userValue = redisTemplate.opsForValue().get("user");

		// Print the value
		System.out.println("Value from Redis for key 'user': " + userValue);

		// Assert that the value is not null (optional)
		assertNotNull(userValue, "Value for key 'user' should not be null");
	}
}
