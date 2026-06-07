package com.example.LaptoppDealerSystem;
import org.springframework.stereotype.Component;
@Component
public class DellLaptop implements  Laptop{
    @Override
    public void specifications() {

        System.out.println("Dell i7 | 16GB RAM | 512GB SSD");
    }

}
