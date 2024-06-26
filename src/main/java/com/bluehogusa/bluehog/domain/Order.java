package com.bluehogusa.bluehog.domain;

import java.util.List;

public class Order {
    private String id;
    private String status;
    private List<OrderItem> OrderItems;
    private User user;

    public Order() {
    }

    public Order(String status, User user, List<OrderItem> OrderItems) {
        this.status = status;
        this.OrderItems = OrderItems;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public List<OrderItem> getOrderItems() {
        return OrderItems;
    }

    public User getUser() {
        return user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderItems(List<OrderItem> OrderItems) {
        this.OrderItems = OrderItems;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        String result = "Order{" +
                "status='" + status + '\'' +
                ", OrderItems=" + OrderItems +
                ", user=" + user +
                '}';
        return result;
    }

}
