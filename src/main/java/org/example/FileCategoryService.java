package org.example;

public class FileCategoryService implements ICategoryService {

    @Override
    public void AddCategory(Category category) {
        System.out.println("Збереження категорії у файл!");
    }
}
