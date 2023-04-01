package com.formvalidation.serversideformvalidation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {

    @NotBlank(message = "UserEmail cannot be empty!!")
    @Size(min = 4,max = 35,message = "Enter correct Email")
    private String userEmail;
    @NotBlank(message = "Password cannot be empty!!")
    @Size(min = 4,max = 12,message = "Enter correct Email")
    private String userPassword;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
