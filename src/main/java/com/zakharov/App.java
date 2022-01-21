package com.zakharov;

public class App {
    public static void main(String[] args) {
        Son son = new Son("Alex",20);
        Mom mom = new Mom("Olga", 40);

        System.out.println(son.say()+mom.getName());
    }
}
