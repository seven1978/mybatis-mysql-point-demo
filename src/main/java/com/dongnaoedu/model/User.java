package com.dongnaoedu.model;

import com.dongnaoedu.vo.Location;

public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;

    private Location location;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", password=" + password
                + ", phone=" + phone + ", location=" + location + "]";
    }

}
