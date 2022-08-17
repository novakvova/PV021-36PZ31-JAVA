package org.example;

public class DatabaseCategoryService implements ICategoryService {
    @Override
    public void AddCategory(Category category) {
        System.out.println("Додати категорію в БД!");
    }
}
