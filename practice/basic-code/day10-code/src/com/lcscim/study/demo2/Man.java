package com.lcscim.study.demo2;

public class Man extends Human {
    public static void main(String[] args) {
        new Man().show();
    }
    @Override
    public void sayHello() {
        System.out.println("我是Man");
    }
    public void method(Greetable greetable){
        greetable.method();
    }

    public void show(){
        method(new Greetable() {
            @Override
            public void method() {
                new Human().sayHello();
            }
        });
        method(()->new Human().sayHello());
        method(()->super.sayHello());
        method(super::sayHello);
    }
}
