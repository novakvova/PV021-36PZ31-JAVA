package org.example;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner in = new Scanner(System.in, "UTF-8");
        Category laptop=new Category();
        laptop.setId(12);

        System.out.println("id = "+laptop.getId());

        //ICategoryService categoryService = new FileCategoryService();
        ICategoryService categoryService = new DatabaseCategoryService();
        categoryService.AddCategory(laptop);
//        Category pc = new Category();
//        pc.setId(34);
//        System.out.println("id = "+ pc.getId());

        System.out.println("Count object = "+ Category.getCounter());

    }
}