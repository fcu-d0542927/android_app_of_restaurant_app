package com.example.user.restaurant_app;

public class OrderItem {
    int order_image;
    String order_name;

    public OrderItem(String order_name, int order_image) {
        this.order_image = order_image;
        this.order_name = order_name;
    }
}
