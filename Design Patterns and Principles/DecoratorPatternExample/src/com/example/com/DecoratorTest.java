package com.example.com;
public class DecoratorTest 
{
    public static void main(String[] args) 
    {
        Notifier email = new EmailNotifier();

        System.out.println("Email Notification");
        email.send("Order Confirmed");

        System.out.println();

     
        Notifier emailSMS =new SMSNotifierDecorator(new EmailNotifier());

        System.out.println("Email + SMS Notification");
        emailSMS.send("Order Confirmed");

        System.out.println();

        Notifier all =new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));

        System.out.println("Email + SMS + Slack Notification");
        all.send("Order Confirmed");
    }
}