package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu m olarak giriniz: ");
        double boy=input.nextDouble();
        System.out.println("Lütfen bkilonuzu kg olarak giriniz: ");
        int kilo=input.nextInt();
        double index=kilo/(boy*boy);
        System.out.println("Vucüt Kitle İndeksiniz: "+index);
    }
}
