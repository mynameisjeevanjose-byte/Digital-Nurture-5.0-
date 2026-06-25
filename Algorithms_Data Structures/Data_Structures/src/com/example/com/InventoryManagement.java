package com.example.com;

import java.util.HashMap;

public class InventoryManagement
{

    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void addProduct(Product p)
    {
        inventory.put(p.productId, p);
    }

    public static void updateProduct(int id, int qty)
    {
        if (inventory.containsKey(id))
        {
            inventory.get(id).quantity = qty;
        }
    }

    public static void deleteProduct(int id) {
        inventory.remove(id);
    }

    public static void display()
    {
        for (Product p : inventory.values())
        {
            System.out.println(p);
        }
    }

    public static void main(String[] args)
    {

        addProduct(new Product(101, "Laptop", 10, 50000));
        addProduct(new Product(102, "Mouse", 20, 500));
        updateProduct(101, 15);
        display();
        deleteProduct(102);
        System.out.println("\nAfter Deletion:");
        display();
    }
}