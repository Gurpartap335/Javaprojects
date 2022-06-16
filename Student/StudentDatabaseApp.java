package Project1.Student;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.enroll();
        st1.payTuition();
        st1.showInfo();
        // Ask how many new users we want to add

        // create n number of new students

    }
}

/*
//        Scanner s = new Scanner(System.in);
//        System.out.println("1. Check number of students");
//        System.out.println("2. Add new Students ");
//        System.out.println("3. Courses");
//        System.out.println("4. Prices of courses");
//        System.out.println("5. See students information like name, id, courses ");
//        System.out.println("6. exit");
//        int option = s.nextInt();
//        do {
//            switch(option) {
//                case 1:
//
//            }
//        } while (option != 6);
 */