package org.example;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.example.Service.StudentService;
import org.example.entity.*;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    static StudentService studentService = new StudentService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to portal university ....");
        while (true) {
            System.out.println("1- signup..");
            System.out.println("2- login...");
            System.out.println("3- exit");
            System.out.println("please input your choice");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    //todo signup..
                    registerSignup();
                    break;
                case "2":
                    //todo login
                    break;
                case "3":
                    return;
            }
        }

    }

    public static void registerSignup() {

    }


}