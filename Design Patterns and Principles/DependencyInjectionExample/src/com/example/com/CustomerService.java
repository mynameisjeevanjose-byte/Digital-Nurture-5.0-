package com.example.com;
public class CustomerService
{
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) 
    {
        this.repository = repository;
    }

    public void getCustomer(int id)
    {
        String name = repository.findCustomerById(id);
        System.out.println("Customer Name : " + name);
    }
}