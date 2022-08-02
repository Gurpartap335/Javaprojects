package Student;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student first name : ");
        this.firstName = s.nextLine();

        System.out.println("Enter student last name : ");
        this.lastName = s.nextLine();

        System.out.println("1 - Freshman \n2 - Sophmore\n3 - Junior\n4 - Senior");
        System.out.println("Enter student class level : ");
        this.gradeYear = s.nextInt();

        setStudentId();
        System.out.println(this.firstName + " " + this.lastName + " " + this.gradeYear + " " + studentID );
    }

    // Generate ID // static? static members belong to the class instead of a specific instance. it means that only one instance of a static field exists.
    private void setStudentId(){
        // Grade level + id
        id++;
        this.studentID = id + gradeYear;
    }


    // Enroll in courses
    public void enroll() {
        do {
            System.out.println("Enter course to enroll : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }while (1 != 0);

        System.out.println("Enrolled in:" + courses);
        System.out.println("Tuition balance : " + tuitionBalance);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is : " + tuitionBalance);
    }

    // pay tuition
    public void payTuition(){
        System.out.println("Enter your payment : ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        viewBalance();
    }

    // show status
    public void showInfo() {
        System.out.println("Name :" + firstName);
        System.out.println("courses enrolled :" + courses);
        System.out.println("Balance :" + tuitionBalance);
    }



}
/*
firstname
lastname
string id
subject
year
 */

/*
    private String firstName;
    private String lastName;
    private int idLength = 5;
    private String ID;

    private int balance;
    private int courses;
    private char gradeLevel;


    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // for student ID.
        this.ID = Id();
        System.out.println(this.ID);
    }

    // generating student id randomly
    // student id should have a 5-digit unique ID with the first number being their grade level.

     private String Id(){
        String abc = "abcdefghjklmnopqrstuvwxyz123456789";
        char[] generatedID = new char[idLength];
        for (int i = 0; i < idLength; i++) {
            if (i == 0) {
                System.out.println("Enter your grade level");
                char c = s.next().charAt(0);
                generatedID[0] = c;
                i++;
            }
            int rand = (int)(Math.random() * abc.length());
            generatedID[i] = abc.charAt(rand);
        }
        return String.valueOf(generatedID);
    }

    void numberOFStudents(){

    }
 */