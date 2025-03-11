/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user;

/**
 *
 * @author Admin
 */
public class User {
    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public static void main(String[] args) {
       User user = new User("001", "user@example.com");
        System.out.println("Current Email: " + user.getEmail());

        // Cập nhật email
        user.updateEmail("newuser@example.com");
        System.out.println("Updated Email: " + user.getEmail());
    }
}