package com.example.com;
public class EmailNotifier implements Notifier
{
	public void send(String message) 
	{
        System.out.println("Sending Email : " + message);
    }
}