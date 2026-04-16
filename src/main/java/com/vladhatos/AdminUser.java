package com.vladhatos;

//Clasa AdminUser care mosteneste User si adauga permissionLevel

public class AdminUser extends User {

    private String permissionLevel;

    public AdminUser(String username, int age, String permissionLevel) {
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    @Override
    public String afiseazaDetalii() {
        return ("User: " + getUsername() + ", Age: " + getAge() + ", permissionLevel=" + permissionLevel);

    }
}

