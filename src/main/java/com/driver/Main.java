package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Try setting a value to name directly (will result in error)
        // obj.name = "John"; // This will cause an error because name is private

        // Try setting a value to name using setter method
        obj.setName("John");

        // Try printing the value of name directly (will result in error)
        // System.out.println(obj.name); // This will cause an error because name is private

        // Print the value of name using getter method
        System.out.println(obj.getName());
    }
}