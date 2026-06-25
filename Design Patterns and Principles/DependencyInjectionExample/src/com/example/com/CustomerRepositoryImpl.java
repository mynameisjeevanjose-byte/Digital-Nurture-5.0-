package com.example.com;
public class CustomerRepositoryImpl implements CustomerRepository
{

    public String findCustomerById(int id)
    {
        if(id == 101)
        {
            return "Rahul";
        }
        else if(id == 102) 
        {
            return "Anjali";
        }
        else 
        {
            return "Customer Not Found";
        }
    }
}