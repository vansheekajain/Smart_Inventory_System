package com.inventory.controller;

import com.inventory.model.Order;

public class OrderController {

    public void placeOrder(Order order) {
        System.out.println("Order Placed: Product ID = " + order.getProductId() + 
                           ", Quantity = " + order.getQuantity());
    }
}
