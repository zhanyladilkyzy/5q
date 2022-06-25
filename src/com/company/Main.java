package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//1. Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел
        System.out.println("1. Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = s.nextInt();
        System.out.println("Enter b:");
        int b = s.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

    //2. Напишите программу для вывода нечетных чисел от 1 до 20
        System.out.println("2. Напишите программу для вывода нечетных чисел от 1 до 20");
        for (int i = 1; i <= 20; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }

    //3. Напишите программу, чтобы поменять местами две переменные
        System.out.println("3. Напишите программу, чтобы поменять местами две переменные");
        System.out.println("Enter a:");
        a = s.nextInt();
        System.out.println("Enter b:");
        b = s.nextInt();
        // 17 5
        a = a + b; //22
        b = a - b; //17
        a = a - b; //5
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    //4. Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них
        System.out.println("4. Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них");
        System.out.println("Enter first number:");
        a = s.nextInt();
        System.out.println("Enter second number:");
        b = s.nextInt();
        System.out.println("Enter third number:");
        int c = s.nextInt();
        int max = 0;
        if(a > max) {
            max = a;
        }
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        System.out.println("max = " + max);

    //5. Напишите программу для проверки того, является ли число положительным или отрицательным
        System.out.println("5. Напишите программу для проверки того, является ли число положительным или отрицательным");
        System.out.println("Enter negative or positive number:");
        c = s.nextInt();
        if(c > 0) {
            System.out.println("Number " + c + " is positive") ;
        } else {
            System.out.println("Number " + c + " is negative");
        }

    //6. Напишите программу для замены всех символов 'a' на символы 'b'
        System.out.println("6. Напишите программу для замены всех символов 'a' на символы 'b'");
        System.out.println("Enter string with a and b symbols:");
        String abs = s.next();
        String abss = abs;

        System.out.println("abss = " + abs.replace('a', 'b'));

        char[] abc = abss.toCharArray();
        for (int i = 0; i < abss.length(); i++) {
            if (abc[i] == 'a'){
                abc[i] = 'b';
            }
            System.out.print(abc[i]);
        }
        System.out.println();
    //7. Напишите программу для суммирования значений массива
        System.out.println("7. Напишите программу для суммирования значений массива");
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < 10; i++)
        {
            //reading array elements from the user
            array[i] = s.nextInt();
            sum += array[i];
        }
        System.out.println("sum = " + sum);


    //8. Напишите программу для нахождения второго по величине числа из массива
        System.out.println("8. Напишите программу для нахождения второго по величине числа из массива");
        max = 0;
        int max2 = 0;
        // 12 45 74 75 78 46 5 6 11 4
        for(int i = 0; i < 10; i++)
        {
            if (array[i] > max) {
                max2 = max;
                max = array[i];
            }
        }
        System.out.println("max2 = " + max2);
    }
}
