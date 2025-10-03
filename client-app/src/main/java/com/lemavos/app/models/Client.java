package com.app.models;
public class Client {

    private String name;
    private String email;
    private String phone;
    private String password;

    public Client(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public void info() {
        System.out.println("\nClient Information:");
        System.out.println("  Name: " + this.name);
        System.out.println("  Email: " + this.email);
        System.out.println("  Phone: " + this.phone);
    }

    // Getters
    public String getName() {
     return name; 
    }
    public String getEmail() { 
        return email; 
    }
    public String getPhone() { 
        return phone; 
    }
    public String getPassword() { 
        return password; 
    }
}