package com.company.polymorphism;

public class MethodOverloadingByChangingReturnType {
    static int add(int a, int b) {
        return a + b;
    }

//    static double add(int a, int b) {
//        return a + b;
//    }

    public static void main(String[] args) {
        System.out.println(MethodOverloadingByChangingReturnType.add(11,11));
    }

}
