package com.example.com;

public class SearchDemo
{

    static int linearSearch(Product2[] products, String key)
    {

        for (int i = 0; i < products.length; i++)
        {
            if (products[i].productName.equalsIgnoreCase(key))
                return i;
        }
        return -1;
    }

    static int binarySearch(Product2[] products, String key)
    {

        int low = 0;
        int high = products.length - 1;

        while (low <= high)
        {

            int mid = (low + high) / 2;

            int result =
                    products[mid].productName.compareToIgnoreCase(key);

            if (result == 0)
                return mid;
            else if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args)
    {

        Product2[] products = 
        	{
                new Product2(1, "Book", "Study"),
                new Product2(2, "Laptop", "Electronics"),
                new Product2(3, "Mobile", "Electronics")
        };

        int pos = linearSearch(products, "Laptop");
        System.out.println("Linear Search Position = " + pos);
    }
}