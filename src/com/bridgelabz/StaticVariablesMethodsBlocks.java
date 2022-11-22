package com.bridgelabz;

public class StaticVariablesMethodsBlocks {
    static String name = "StaticVariable";//static variable
    static {//static block
        System.out.println("static block");
    }

    public static void main(String[] args) {//static method
        System.out.println(name);
        System.out.println("static method");
    }
}
