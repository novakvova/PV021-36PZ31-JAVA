package org.example;

import lombok.Data;

@Data
public class Category {

    private int id;
    private static int counter=0;

    //default
    public Category() {
        counter++;
    }
    //parameter
    public Category(int id)
    {
        this.setId(id);
    }

    public Category(Category category) {

    }

   public static int getCounter() { return counter; }
    //private int id;
    //public int id;
}
