package prac4.task3;

import java.util.ArrayList;
import java.util.Scanner;

enum Category {
    ELECTRONICS("Electronics"),
    CLOTHING("Clothes"),
    BOOKS("Books");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Product {
    private String name;
    private double price;
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, price: %.2f, cathegory: %s",
                name, price, category.getName());
    }
}

class Cart {
    private ArrayList<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Added to cart: " + product.getName());
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Cart:");
            for (Product item : items) {
                System.out.println(item);
            }
        }
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty. You cannot buy.");
            return;
        }
        double total = 0;
        System.out.println("Buy:");
        for (Product item : items) {
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.printf("Amount: %.2f%n", total);
        items.clear();
        System.out.println("Cart paid.");
    }
}

class OnlineStore {
    private ArrayList<Product> products;
    private Cart cart;
    private boolean isAuthenticated;

    public OnlineStore() {
        products = new ArrayList<>();
        cart = new Cart();
        isAuthenticated = false;
        products.add(new Product("Smartphone", 599.99, Category.ELECTRONICS));
        products.add(new Product("T-shirt", 19.99, Category.CLOTHING));
        products.add(new Product("Java book", 29.99, Category.BOOKS));
        products.add(new Product("Laptop", 999.99, Category.ELECTRONICS));
    }

    public boolean authenticate(String login, String password) {
        if ("user".equals(login) && "pass".equals(password)) {
            isAuthenticated = true;
            System.out.println("Welcome to shop!");
            return true;
        } else {
            System.out.println("Wrong password or login!");
            return false;
        }
    }

    public void displayCategories() {
        if (!isAuthenticated) {
            System.out.println("Please enter to the system.");
            return;
        }
        System.out.println("Products categories:");
        for (Category category : Category.values()) {
            System.out.println(category.getName());
        }
    }

    public void displayProductsByCategory(String categoryName) {
        if (!isAuthenticated) {
            System.out.println("Please enter to the system.");
            return;
        }
        boolean found = false;
        for (Category category : Category.values()) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                found = true;
                System.out.println("Products in category " + category.getName() + ":");
                for (Product product : products) {
                    if (product.getCategory() == category) {
                        System.out.println(product);
                    }
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Category doesn't exist.");
        }
    }

    public void addToCart(String productName) {
        if (!isAuthenticated) {
            System.out.println("Please enter to the system.");
            return;
        }
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.addProduct(product);
                return;
            }
        }
        System.out.println("Product doesn't exist.");
    }

    public void viewCart() {
        if (!isAuthenticated) {
            System.out.println("Please enter to the system.");
            return;
        }
        cart.displayCart();
    }

    public void checkout() {
        if (!isAuthenticated) {
            System.out.println("Please enter to the system.");
            return;
        }
        cart.checkout();
    }
}

