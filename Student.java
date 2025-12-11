/*
Student.java
All information and methods involving Students
Sudhanya Golla
Created July 16th, 2024
Last Modified July 16th, 2024
*/

// Java setup
public class Student
{
    // Define all properties within class Student
    private String name;
    private int age;
    private int gradeLevel;
    private double gpa;
    private String computerPassword;

    // Set up constructor
    // Assign all values to each property
    public Student(String name, int age, int gradeLevel, double gpa, String computerPassword)
    {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.computerPassword = computerPassword;
    }

    // Output updated version of computer password
    public void setComputerPassword(String computerPassword)
    {
        // Validate if password can be changed
        if (computerPassword.length() >= 8)
        {
            System.out.println("Password successfully changed");
            this.computerPassword = computerPassword;
        }
        else
        {
            System.out.println("Password not long enough");
        }
    }

    // Set GPA of student
    public void setGPA(double gpa)
    {
        // Validate whether GPA can be changed
        if (gpa < 0 || gpa > 4)
        {
            System.out.println("GPA must be in between 0 and 4");
        }
        else
        {
            System.out.println("GPA successfully changed");
            this.gpa = gpa;
        }
    }

    // Output whether student is an honours student or not
    public void getHonors()
    {
        // Determine whether student's GPA makes them eligible for honor roll
        if (this.gpa > 3.5 && this.gpa <= 4)
        {
            System.out.println("Student " + this.name + " is an honors student");
        }
        else
        {
            System.out.println("Student " + this.name + " not eligible for honor roll");
        }
    }

    // Promote student based on new grade level
    public void promote(int newGradeLevel)
    {
        // Validate grade level inputted
        if (newGradeLevel <= 12 && newGradeLevel > 0)
        {
            System.out.println("Student's grade successfully updated");
            this.gradeLevel = newGradeLevel;
        }
        else
        {
            System.out.println("Inputted grade is invalid");
        }
    }

    // Output which student has the higher GPA
    public void compareGPA(Student name2)
    {
        // Determine which student has a high GPA
        if (this.gpa > name2.gpa)
        {
            System.out.println(name + " has a higher GPA.");
        }
        else if (name2.gpa > this.gpa)
        {
            System.out.println(name2.name + " has a higher GPA.");
        }
        else
        {
            System.out.println("Both students have the same GPA");
        }
    }

    // Output student's information
    public void printInfo()
    {
        System.out.println("Student's name is " + name + ", their age is " + age + ", they are in grade " + gradeLevel + ", and their GPA is " + gpa + ".");
    }
}
