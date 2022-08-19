package org.example;

import org.hibernate.Session;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner in = new Scanner(System.in, "UTF-8");
        Session session = HibernameSession.getSessionFactory().openSession();
        Category cat = new Category();
        System.out.println("Enter category name: ");
        String catName = in.nextLine();
        cat.setName(catName);
        session.save(cat);
        session.close();


    }
}