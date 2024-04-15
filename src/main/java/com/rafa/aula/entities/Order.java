package com.rafa.aula.entities;

public class Order {
    private int code;
    private double basic;
    private double discount;

    public  Order(int code, double basic){
        this.code = code;
        this.basic = basic;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
