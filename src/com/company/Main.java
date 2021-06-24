package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Введите параметры предполагаемого треугольника: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Сторона А: ");
	int a = scan.nextInt();
        System.out.println("Сторона В: ");
	int b = scan.nextInt();
        System.out.println("Сторона С: ");
	int c = scan.nextInt();

	if (a >= (b+c) || b>= (a+c) || c>= (a+b)) {
	    System.out.println("Такого треугольника не существует");}
	else {
        System.out.println("Такой треугольник существует");}
    }

    }

