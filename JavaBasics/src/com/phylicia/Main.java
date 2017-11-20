/* Created By: Phylicia Campbell
   Last Date Updated: 16 November 2017
   Filename: Java Basics
   Description: Learning Java and practicing with switch statements, objects, loops, and classes.
   Creating a student database.
 */

package com.phylicia;
import java.util.Scanner;



public class Main{

    public static Scanner userInput = new Scanner(System.in);
    public static student newStudent = new student();



    // view student personal information
    static void viewStudent(student stud) {
        //ask user for student id
        //search database for student id
        //return student id, first name, last name, address, email, phone number, emergency contact
        //if user wants to view all student, user will enter 1
        //return all students information

        System.out.println("===================== Student Record ================");
        System.out.println("ID NO: " + stud.getId());
        System.out.println("First Name: " + stud.getFirstName());
        System.out.println("Last Name: " + stud.getLastName());
        System.out.println("Address: " + stud.getAddress());
        System.out.println("E-mail: " + stud.getEmail());
        System.out.println("Phone Number: " + stud.getPhone());
        System.out.println("Emergency Contact: " + stud.getEmContact());
        System.out.println("======================================================");

        menu(stud); //returns back to main menu
    }


    //view students grades based on id or all student grades
    static void printGrade(student stud){
        //ask user for id number
        //search for student grade record based on id
        //return grades to user



        menu(stud); //returns back to main menu
    }

    //add new grade for student in database
    static void addGrade(student stud){
        //ask the user for student id
        //ask the user to enter grade
        //add grade to database for student based on id number

        menu(stud); //returns back to main menu
    }


    //add new student to display reading user input from the keyboard
    static void addStudent(student stud) {
            //ask the user for student first, last, address, email, phone number, parents name
            //generate id number for student
            //assign id number to student
            //add student to database

            Scanner userInput = new Scanner(System.in);
            String first, last, addr, em, emCon, pn;
            int idNumber;


            System.out.println("Enter Student First Name:");
            first = userInput.nextLine();

            System.out.println("Enter Student Last Name:");
            last = userInput.nextLine();

            System.out.println("Enter Student Address:");
            addr = userInput.nextLine();

            System.out.println("Enter Student E-mail address:");
            em = userInput.nextLine();

            System.out.println("Enter Student Phone Number:");
            pn = userInput.nextLine();

            System.out.println("Enter Student Emergency Contact");
            emCon = userInput.nextLine();


            //generate random id number
            idNumber = (int)(Math.random() * 50 + 1);

            //set data to object
            stud.setFirstName(first);
            stud.setLastName(last);
            stud.setAddress(addr);
            stud.setEmail(em);
            stud.setPhone(pn);
            stud.setEmContact(emCon);
            stud.setId(idNumber);


            System.out.println(stud.getFirstName() + "has been added");
            System.out.println("");



            menu(stud); //returns back to main menu
    }




    // Menu for database
    static void menu(student stud){


        System.out.println("*********************************************************************************");
        System.out.println("                       Dr. Michael M Krop Senior High                            ");
        System.out.println("*********************************************************************************");
        System.out.println("*********************************************************************************");
        System.out.println("* 1.) View Student                                                              *");
        System.out.println("* 2.) Add New Student                                                           *");
        System.out.println("* 3.) Add Grades                                                                *");
        System.out.println("* 4.) Print Grades                                                              *");
        System.out.println("* 5.) Exit                                                                      *");
        System.out.println("*********************************************************************************");
        System.out.println("");


        int num = userInput.nextInt();

        switch (num) {
            case 1:
                viewStudent(stud);
                break;
            case 2:
                addStudent(stud);
                break;
            case 3:
                addGrade(stud);
                break;
            case 4:
                printGrade(stud);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Choose an option from the menu. Try again.");
                break;
        }

    }

    public static void main(String[] args)  {

        menu(newStudent); //runs the main menu for the user

    }


}


