package com.example.LaptoppDealerSystem;

import org.springframework.stereotype.Component;

@Component
public class HPLaptop  implements Laptop {
    @Override
    public void specifications() {

        System.out.println("HP Ryzen 7 | 16GB RAM | 1TB SSD");
    }
}
