package com.example.com;

public class ExcelFactory extends DocumentFactory
{
    public Document createDocument()
    {
        return new ExcelDocument();
    }
}