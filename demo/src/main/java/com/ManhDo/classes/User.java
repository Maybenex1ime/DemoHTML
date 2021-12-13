package com.ManhDo.classes;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull(message = "is required")
    private String username;

    @NotNull(message = "is required")
    @Size(min = 3, message = "too short")
    private String password;

    @NotNull(message = "is required")
    private String confirm;

    public User(){

    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setConfirm(String confirm){
        this.confirm = confirm;
    }

    public String getConfirm(){
        return confirm;
    }

    public boolean Validate(){
        return password.equals(confirm);
    }
}
