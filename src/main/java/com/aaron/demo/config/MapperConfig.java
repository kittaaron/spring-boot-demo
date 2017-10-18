package com.aaron.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kittaaron on 2017/10/18.
 * MapperConfig
 */
@Configuration
@MapperScan("com.aaron.demo.mapper")
public class MapperConfig {
}
