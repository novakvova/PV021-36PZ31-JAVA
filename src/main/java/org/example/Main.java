package org.example;

import org.hibernate.Session;

import java.io.PrintStream;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner in = new Scanner(System.in, "UTF-8");

        //Add(in);
        //Показати усі продукти
//        Session session = HibernameSession.getSessionFactory().openSession();
//        Product p = session.get(Product.class, 1);
//        System.out.println(p.getId() +"\t"+p.getName()+"\t"+p.getCategory().getName());
        //Змінити продукт
        //Видалити продукт

    }

    static void Add(Scanner in)
    {
        Session session = HibernameSession.getSessionFactory().openSession();
        List<Category> categoryList = session.createQuery("from Category",Category.class).list();
        System.out.println("Оберіть категорію: ");
        for (Category item : categoryList) {
            System.out.println(item.getId() + ". "+ item.getName());
        }
        int category_id = Integer.parseInt(in.nextLine());
        System.out.print("Назва продукта: ");
        String name = in.nextLine();
        System.out.print("Ціна продукта: ");
        double price = Double.parseDouble(in.nextLine());
        Product p = new Product();
        Category c =  new Category();
        c.setId(category_id);
        p.setCategory(c);
        p.setName(name);
        p.setPrice(price);
        session.save(p);
        session.close();
    }



}