package com.example.com;
public abstract class NotifierDecorator implements Notifier
{
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) 
    {
        this.notifier = notifier;
    }
}