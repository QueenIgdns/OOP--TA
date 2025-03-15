/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorPH_OOP;

/**
 *
 * @author jrssc
 */
public class AdminUser extends AbstractUser {
    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}
