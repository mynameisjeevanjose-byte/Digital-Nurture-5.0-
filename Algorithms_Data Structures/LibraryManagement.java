package com.example.com;

class Book
{
    int bookId;
    String title;
    String author;

    Book(int id, String title, String author)
    {
        this.bookId = id;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagement
{
    static int linearSearch(Book[] books, String key)
    {
        for (int i = 0; i < books.length; i++)
        {
            if (books[i].title.equalsIgnoreCase(key))
                return i;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        Book[] books =
        	{
        			new Book(1, "Java", "James"),
        			new Book(2, "DSA", "Mark"),
        			new Book(3, "Python", "Ross")
        };
        int pos = linearSearch(books, "DSA");
        System.out.println("Found at Index = " + pos);
    }
}