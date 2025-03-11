/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.user;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    private User user;

    @BeforeClass
    public static void setUpClass() {
        // Có thể sử dụng để thiết lập tài nguyên chung nếu cần
    }

    @AfterClass
    public static void tearDownClass() {
        // Có thể sử dụng để giải phóng tài nguyên chung nếu cần
    }

    @Before
    public void setUp() {
        user = new User("001", "user@example.com");
    }

    @After
    public void tearDown() {
        // Có thể sử dụng để giải phóng tài nguyên sau mỗi test case nếu cần
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        String expectedEmail = "user@example.com";
        String result = user.getEmail();
        assertEquals(expectedEmail, result);
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        String newEmail = "newemail@example.com";
        user.setEmail(newEmail);
        assertEquals(newEmail, user.getEmail());
    }

    /**
     * Test of updateEmail method, of class User.
     */
    @Test
    public void testUpdateEmail() {
        String updatedEmail = "updated@example.com";
        user.updateEmail(updatedEmail);
        assertEquals(updatedEmail, user.getEmail());
    }

    /**
     * Test of main method, of class User.
     */
    @Test
    public void testMain() {
        String[] args = null;
        User.main(args);
        // Không có xác nhận cụ thể, chỉ kiểm tra xem phương thức có chạy mà không lỗi
    }
}