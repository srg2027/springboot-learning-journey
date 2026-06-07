package com.example.LaptoppDealerSystem;

import org.springframework.stereotype.Component;

@Component
public class LenovoLaptop  implements  Laptop {
    @Override
    public void specifications() {

        System.out.println("Lenovo i5 | 8GB RAM | 512GB SSD");
    }
}
