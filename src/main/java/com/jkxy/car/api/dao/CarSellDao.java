package com.jkxy.car.api.dao;

import com.jkxy.car.api.pojo.CarSell;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CarSellDao {

    @Insert("insert into carsell (carId,amount,tradeDate) values (#{carId},#{amount},#{tradeDate})")
    void insertCarSell(CarSell carSell);
}
