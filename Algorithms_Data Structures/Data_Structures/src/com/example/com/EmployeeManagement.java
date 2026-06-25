package com.example.com;
class Employee
{
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id, String name,String position, double salary)
    {
        this.employeeId = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

public class EmployeeManagement
{
    static Employee[] emp = new Employee[100];
    static int count = 0;

    static void add(Employee e)
    {
        emp[count++] = e;
    }

    static void search(int id) 
    {
        for (int i = 0; i < count; i++)
        {
            if (emp[i].employeeId == id)
            {
                System.out.println(emp[i].name);
                return;
            }
        }

        System.out.println("Not Found");
    }

    static void traverse()
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(emp[i].employeeId +" " + emp[i].name);
        }
    }

    static void delete(int id)
    {
        for (int i = 0; i < count; i++) 
        {
            if (emp[i].employeeId == id)
            {
                for (int j = i; j < count - 1; j++)
                {
                    emp[j] = emp[j + 1];
                }

                count--;
                break;
            }
        }
    }

    public static void main(String[] args)
    {

        add(new Employee(1, "John", "Manager", 50000));
        add(new Employee(2, "David", "Developer", 40000));

        traverse();

        search(2);

        delete(1);

        System.out.println("After Deletion");

        traverse();
    }
}
