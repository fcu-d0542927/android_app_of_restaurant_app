package com.example.user.restaurant_app;

public class OrderItem {
    private int order_image;
    private String order_name;

    public int getOrder_image() {
        return order_image;
    }

    public void setOrder_image(int order_image) {
        this.order_image = order_image;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }



    public OrderItem(String order_name, int order_image) {
        this.order_image = order_image;
        this.order_name = order_name;
    }
}
