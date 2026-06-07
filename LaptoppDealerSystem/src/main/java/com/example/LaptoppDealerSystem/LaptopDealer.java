package com.example.LaptoppDealerSystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LaptopDealer {
    private final Laptop laptop;
    public LaptopDealer(@Qualifier("dellLaptop") Laptop laptop){
        this.laptop=laptop;

    }

    public void sellLaptop() {

        System.out.println("Customer selected Dell");

        laptop.specifications();

        System.out.println("Laptop Sold");
    }

}
