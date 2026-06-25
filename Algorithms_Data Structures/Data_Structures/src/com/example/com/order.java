package com.example.com;

class Order
{
    int orderId;
    String customerName;
    double totalPrice;

    Order(int id, String name, double price)
    {
        orderId = id;
        customerName = name;
        totalPrice = price;
    }
}