package com.formvalidation.serversideformvalidation.model;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {

    @NotBlank(message = "Email Address cannot be empty!!")
    @Size(min = 6,max = 35,message = "Enter correct Email")
    private String userEmail;
    @AssertTrue
    private boolean agreed;
    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }



    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$",message = "Password must contain - at least 8 characters\n- must contain at least 1 uppercase letter, 1 lowercase letter, and 1 number\n- Can contain special characters")
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
