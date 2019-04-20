package com.lcscim.study.demo2;

public class User {
    private String name;
    private int money;

    public User() {
<<<<<<< HEAD
=======

>>>>>>> d973c74dd4a420e642408113ff26761ccf921961
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

<<<<<<< HEAD
=======
    public void show() {
        System.out.println("用户名：" + name + ",余额为：" + money);
    }

>>>>>>> d973c74dd4a420e642408113ff26761ccf921961
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
<<<<<<< HEAD

    public void show() {
        System.out.println("用户名:" + name + " , 余额为:" + money + "元");
    }
=======
>>>>>>> d973c74dd4a420e642408113ff26761ccf921961
}
