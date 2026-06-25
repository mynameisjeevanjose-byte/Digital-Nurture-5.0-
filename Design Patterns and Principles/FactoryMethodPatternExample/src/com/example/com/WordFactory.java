package com.example.com;

public class WordFactory extends DocumentFactory
{
    public Document createDocument()
    {
        return new WordDocument();
    }
}