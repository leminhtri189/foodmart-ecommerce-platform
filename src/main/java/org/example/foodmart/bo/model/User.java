package org.example.foodmart.bo.model;

import org.example.foodmart.bo.enums.UserRole;

import java.util.Date;

public class User extends BaseModel {

    private String Email;
    private String HashedPassword;
    private String PhoneNumber;
    private String Avatar;
    private UserRole Role;

    public User() {}

    public User(String email, UserRole role, String avatar, String phoneNumber, String hashedPassword) {
        Email = email;
        Role = role;
        Avatar = avatar;
        PhoneNumber = phoneNumber;
        HashedPassword = hashedPassword;
    }

    public User(int id, Date createdAt, Date updatedAt, boolean idDeleted, String email, UserRole role, String avatar, String phoneNumber, String hashedPassword) {
        super(id, createdAt, updatedAt, idDeleted);
        Email = email;
        Role = role;
        Avatar = avatar;
        PhoneNumber = phoneNumber;
        HashedPassword = hashedPassword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public UserRole getRole() {
        return Role;
    }

    public void setRole(UserRole role) {
        Role = role;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getHashedPassword() {
        return HashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        HashedPassword = hashedPassword;
    }
}
