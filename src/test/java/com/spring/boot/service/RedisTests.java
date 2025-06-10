package com.spring.boot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTests {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Test
	public void testGetUserFromRedis() {
		redisTemplate.opsForValue().set("email","gmail@gmail.com");
		Object salary = redisTemplate.opsForValue().get("salary");
		System.out.println("=== Started ====");
	}
}
