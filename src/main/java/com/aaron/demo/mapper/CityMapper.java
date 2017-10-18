package com.aaron.demo.mapper;

import com.aaron.demo.entity.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by kittaaron on 2017/10/18.
 * CityMapper
 */
public interface CityMapper {
    @Select("select * from city where id = #{id}")
    City findCityById(@Param("id") Long id);
}
