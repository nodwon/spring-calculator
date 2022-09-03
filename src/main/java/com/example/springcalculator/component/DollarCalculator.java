package com.example.springcalculator.component;

import com.example.springcalculator.ICalculator;

public class DollarCalculator implements ICalculator {
    private int price =1;
    private MarketApi marketApi;

    public DollarCalculator(MarketApi marketApi){
        this.marketApi =marketApi;
    }
    @Override
    public int sum(int x, int y) {
        x *=price;
        y*= price;
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        x *=price;
        y*= price;
        return x-y;
    }

    public void init() {
        this.price = marketApi.connect();
    }
}
