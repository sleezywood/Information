/*
Book.java
All information and methods involving Books
Sudhanya Golla
Created July 16th, 2024
Last Modified July 16th, 2024
*/

// Java setup
public class Book {
    
    // Define all properties within class Book
    private String title;
    private String author;
    private int pages;
    private int libraryCodeNum;

    // Set up constructor to initialize all values
    // Assign values to each property
    public Book(String title, String author, int pages, int libraryCodeNum)
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.libraryCodeNum = libraryCodeNum;
    }

    // Set and replace ISBN of book
    public void setLibraryCodeNum(int num)
    {
        int length = String.valueOf(num).length();

        // Validate whether inputted ISBN is valid
        if (length < 5)
        {
            System.out.println("Code is too short");
        }
        else
        {
            System.out.println("Code successfully changed.");
            this.libraryCodeNum = num;
        }
    }

    // Output whether book is long or short
    public void isLong()
    {
        // Determine whether book is long or short
        if (this.pages > 300)
        {
            System.out.println("Book " + this.title + " is long");
        }
        else
        {
            System.out.println("Book " + this.title + " is short");
        }
    }

    // Output which book is longer in comparison to the other
    public void comparePageLength(Book b)
    {
        // Determine which book is longer
        if (this.pages > b.pages)
        {
            System.out.println(this.author + " has a longer book than " + b.author + ".");
        }
        else if (b.pages > this.pages)
        {
            System.out.println(b.author + " has a longer book than " + this.author + ".");
        }
        else
        {
            System.out.println("Both authors have written books of the same length.");
        }
    }

    // Print information of book
    public void printInfo()
    {
        System.out.println("The book's title is " + this.title + ", its author is " + this.author + ", it has " + this.pages + " pages, and its ISBN is " + this.libraryCodeNum);
    }
}