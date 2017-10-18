package com.aaron.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by kittaaron on 2017/10/18.
 * City
 */
@Data
public class City implements Serializable {
    private Long id;
    private String city_name;
    private Integer status;
    private Integer isopen;
    private Date create_time;
}
