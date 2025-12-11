/*
Main.java
Object Oriented Programming Assignment #2
Sudhanya Golla
Created July 16th, 2024
Last Modified July 16th, 2024
*/

// Java setup
import java.util.*;

class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
        
        // Question 1 - Gather information from both students and compare their data
        // Gather information for Student 1
        System.out.println("Gather information for person 1");
        System.out.println("Enter new computer password: ");
        String computerPassword = in.nextLine();
        System.out.println("Enter name: ");
        String name = in.nextLine();
        System.out.println("Enter age: ");
        int age = in.nextInt();
        System.out.println("Enter grade level: ");
        int gradeLevel = in.nextInt();
        System.out.println("Enter GPA: ");
        double gpa = in.nextDouble();

        // Instantiate and call all methods within Student class
        // Output student 1's current information
        Student student1 = new Student(name, age, gradeLevel, gpa, computerPassword);
        student1.printInfo();

        // Reset any information to update profile
        System.out.println("\nChange any information as you desire");
        System.out.println("Enter new computer password: ");
        in.nextLine();
        computerPassword = in.nextLine();
        student1.setComputerPassword(computerPassword);
        System.out.println("Enter new GPA: ");
        gpa = in.nextDouble();
        student1.setGPA(gpa);
        System.out.println("Enter new grade level to update: ");
        gradeLevel = in.nextInt();
        student1.promote(gradeLevel);

        // Determine whether student finally achieved honours
        student1.getHonors();

        // Output updated information about student 1
        System.out.println("New student info: ");
        student1.printInfo();

        // Gather information for Person 2
        System.out.println("\nGather information for person 2");
        System.out.println("Enter new computer password: ");
        in.nextLine();
        computerPassword = in.nextLine();
        System.out.println("Enter name: ");
        name = in.nextLine();
        System.out.println("Enter age: ");
        age = in.nextInt();
        System.out.println("Enter grade level: ");
        gradeLevel = in.nextInt();
        System.out.println("Enter GPA: ");
        gpa = in.nextDouble();

        // Instantiate and call all methods within Student class
        // Output student 2's current information
        Student student2 = new Student(name, age, gradeLevel, gpa, computerPassword);
        student2.printInfo();

        // Reset information to updated information
        System.out.println("\nChange any information as you desire");
        System.out.println("Enter new computer password: ");
        in.nextLine();
        computerPassword = in.nextLine();
        student2.setComputerPassword(computerPassword);
        System.out.println("Enter new GPA: ");
        gpa = in.nextDouble();
        student2.setGPA(gpa);
        System.out.println("Enter new grade level to update: ");
        gradeLevel = in.nextInt();
        student2.promote(gradeLevel);
        
        // Determine whether student finally got into honour roll
        student2.getHonors();

        // Output student 2's updated information
        System.out.println("New student info: ");
        student2.printInfo();

        // Determine which student's GPA is higher
        System.out.println("");
        student2.compareGPA(student1);

        // Question 2 - Gather, output, and compare information about a book and its author
        // Gather information for Book 1
        System.out.println("\nGather information for book 1");
        System.out.println("Enter title of book: ");
        in.nextLine();
        String title = in.nextLine();
        System.out.println("Enter name of author");
        String author = in.nextLine();
        System.out.println("Enter number of pages in book: ");
        int pages = in.nextInt();
        System.out.println("Enter ISBN (library code number): ");
        int libraryCodeNum = in.nextInt();

        // Instantiate and call all methods within Book Class
        // Output book 1's current information
        Book book1 = new Book(title, author, pages, libraryCodeNum);
        book1.printInfo();

        // Reset any information to update to current version
        System.out.println("\nEnter information you want to reset");
        System.out.println("Reset ISBN: ");
        libraryCodeNum = in.nextInt();
        book1.setLibraryCodeNum(libraryCodeNum);

        // Determine whether book is long or not
        book1.isLong();

        // Output current information
        System.out.println("New information: ");
        book1.printInfo();

        // Gather information for Book 2
        System.out.println("\nGather information for book 2");
        System.out.println("Enter title of book: ");
        in.nextLine();
        title = in.nextLine();
        System.out.println("Enter name of author");
        author = in.nextLine();
        System.out.println("Enter number of pages in book: ");
        pages = in.nextInt();
        System.out.println("Enter ISBN (library code number): ");
        libraryCodeNum = in.nextInt();

        // Insantiate and call all methods within Book Class
        // Print current information about book 2
        Book book2 = new Book(title, author, pages, libraryCodeNum);
        book2.printInfo();

        // Reset any information to update to most current version
        System.out.println("\nEnter information you want to reset");
        System.out.println("Reset ISBN: ");
        libraryCodeNum = in.nextInt();
        book2.setLibraryCodeNum(libraryCodeNum);
        
        // Determine whether book 2 is long or not
        book2.isLong();

        // Output updated information about book 2
        System.out.println("New information: ");
        book2.printInfo();

        // Determine which book is longer
        System.out.println("");
        book2.comparePageLength(book1);

        // Question 3 - Print, compare, and output employee's information
        // Employee 1's information
        System.out.println("\nEnter employee 1's information");
        System.out.println("Enter the name of Employee: ");
        in.nextLine();
        String nameEmploy = in.nextLine();
        System.out.println("Enter employee's ID: ");
        int id = in.nextInt();
        System.out.println("Enter the salary of employee: ");
        double salary = in.nextDouble();
        System.out.println("Enter the name of employee's department: ");
        in.nextLine();
        String department = in.nextLine();

        // Insantiate and call all methods within Employee Class
        // Output all information about employee 1
        Employee employee1 = new Employee(nameEmploy, id, salary, department);
        employee1.printInfo();

        // Prompt and output tax paid by employee 1
        System.out.println("Enter tax employee has to pay (in decimal): ");
        double taxRate = in.nextDouble();
        System.out.println("Tax paid before a raise: ");
        employee1.determineTax(taxRate);

        // Calculate salary after a raise
        System.out.println("Enter the percentage you want to raise salary by (in decimal): ");
        double percentage = in.nextDouble();
        employee1.raiseSalary(percentage);

        // Output tax after raise
        System.out.println("Tax paid after a raise: ");
        employee1.determineTax(taxRate);

        // Reset information to update to current version
        System.out.println("\nEnter information you want to reset");
        System.out.println("Enter name of new department employee works under: ");
        in.nextLine();
        department = in.nextLine();
        employee1.setDepartment(department);

        // Output updated information of employee 1
        System.out.println("Updated information: ");
        employee1.printInfo();

        // Gather Employee 2's information
        System.out.println("\nEnter employee 2's information");
        System.out.println("Enter the name of Employee: ");
        nameEmploy = in.nextLine();
        System.out.println("Enter employee's ID: ");
        id = in.nextInt();
        System.out.println("Enter the salary of employee: ");
        salary = in.nextDouble();
        System.out.println("Enter the name of employee's department: ");
        in.nextLine();
        department = in.nextLine();

        // Insantiate and call all methods within Employee Class
        // Output all information about employee 2
        Employee employee2 = new Employee(nameEmploy, id, salary, department);
        employee2.printInfo();

        // Prompt and output tax paid by employee 2 before raise
        System.out.println("Enter tax employee has to pay (in decimal): ");
        taxRate = in.nextDouble();
        System.out.println("Tax before raise: ");
        employee2.determineTax(taxRate);

        // Calculate salary after a raise
        System.out.println("Enter the percentage you want to raise salary by (in decimal): ");
        percentage = in.nextDouble();
        employee2.raiseSalary(percentage);

        System.out.println("Tax after raise: ");
        employee2.determineTax(taxRate);

        // Reset information to update to current version
        System.out.println("\nEnter information you want to reset");
        System.out.println("Enter name of new department employee works under: ");
        in.nextLine();
        department = in.nextLine();
        employee2.setDepartment(department);

        // Enter most updated information
        System.out.println("Updated information: ");
        employee2.printInfo();

        // Determine which person has a higher salary
        System.out.println("");
        employee2.compareSalary(employee1);
    }
}