package com.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;




@Configuration
public class RedisConfig {
	
	
	@Bean
	public RedisConnectionFactory connectionFactory() {
		return new LettuceConnectionFactory();
	}
	
	@Bean
	public RedisTemplate redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
		// Connection Factory
		redisTemplate.setConnectionFactory(factory);
		// Key Serilaizer
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		// Value Serilaizer
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		
		return redisTemplate;		
	}
}
