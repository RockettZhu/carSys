package com.jkxy.car.api.pojo;

import java.sql.Timestamp;

public class CarSell {

    private int id;
    private int amount;
    private int carId;
    private Timestamp tradeDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Timestamp getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Timestamp tradeDate) {
        this.tradeDate = tradeDate;
    }

    @Override
    public String toString() {
        return "CarSell{" +
                "id=" + id +
                ", carId='" + carId + '\'' +
                ", amount='" + amount + '\'' +
                ", tradeDate='" + tradeDate + '\'' +
                '}';
    }
}
