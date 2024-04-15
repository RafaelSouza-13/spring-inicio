package com.rafa.aula.services;

import com.rafa.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        double fare = shippingService.shipment(order);
        if(order.getBasic() < 100){
            return order.getBasic() + fare;
        }else if(order.getBasic() <= 200){
            return (order.getBasic() * 0.8) + fare;
        }
        return (order.getBasic() * 0.9) + fare;
    }
}
