package com.spring.boot.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisService {
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@PostConstruct
	public void clearRedis() {
	    redisTemplate.getConnectionFactory().getConnection().flushAll();
	}

}
