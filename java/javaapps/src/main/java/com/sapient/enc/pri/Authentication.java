package com.sapient.enc.pri;

public class Authentication {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //
    public boolean login() {
        //access the private method
        return auth();
    }
    private boolean auth(){
        if (this.username == "admin" && this.password == "admin") return true;
        return false;
    }
}
