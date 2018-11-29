package com.itschool;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	task_1();
	task_2();
	task_3();
	//task_4();


    }

    public static void task_1() {
        /*В массиве хранится информация о численности книг в каждом из 35
        разделов библиотеки. Выяснить, верно ли, что общее число книг в
        библиотеке есть шестизначное число.*/
        Random r = new Random();
        int[] arr = new int[35];
        int sum = 0;

        for (int i = 0; i < arr.length; i++ )
        {
            arr[i] = r.nextInt();
        }

        for (int a : arr) {
            System.out.println(a);
        }


        for (int i = 0; i < arr.length; i++ )
        {
            sum += arr[i];
        }

        System.out.println("Сумма : " +  sum);

        if ((sum > 99999) && (sum < 1000000))
            System.out.println("Общее число книг в библиотеке есть шестизначное число");
        else
            System.out.println("Общее число книг в библиотеке не есть шестизначное число");
    }

    public static void task_2(){
        /*
        В массиве хранится информация о баллах, полученных спортсменом-
        десятиборцем в каждом из десяти видов спорта. Для выхода в следующий
        этап соревнований общая сумма баллов должна превысить некоторое
        известное значение. Определить, вышел ли данный спортсмен в
        следующий этап соревнований.
         */
        int[] arr = new int[10];
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
            if (arr[i] < 0)
                arr[i] *= -1;
        }

        System.out.println("Баллы спортсмена: ");
        for (int a : arr) {
            System.out.println(a);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Сумма баллов спортсмена: " + sum);
        System.out.println("Введите порог пропуска в следующий этап -> ");
        int threshold = scan.nextInt();
        if (sum >= threshold)
            System.out.println("Спортсмен проходит в следующий этап");
        else
            System.out.println("Спортсмен не проходит в следующий этап");
    }

    public static void task_3(){
        /*
        Оценки, полученные спортсменом в соревнованиях по фигурному катанию
        (в баллах), хранятся в массиве из 18 элементов. В первых шести элементах
        записаны оценки по обязательной программе, с седьмого по
        двенадцатый — по короткой программе, в остальных — по произвольной
        программе. Выяснить, по какому виду программы спортсмен показал
        лучший результат.
         */
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[18];
        int maxPoint = arr[0];
        System.out.println("Дайте оценки по обязательной программе(1-6): ");
        for (int i = 0; i < 7; i++){
            System.out.print(i + ") ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Дайте оценки по короткой программе(7-12): ");
        for (int i = 7; i < 13; i++){
            System.out.print(i + ") ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Дайте оценки по произвольной программе(13-18): ");
        for (int i = 13; i < 19; i++){
            System.out.print(i + ") ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Введённые баллы: ");
        for (int i : arr){
            System.out.print(i + " ");
            if (maxPoint < i)
                maxPoint = i;
        }
        System.out.println("Лучший результат: " + maxPoint);
    }


        /*
    public static void task_4(){
        /*
        Написать программу определения в одномерном массиве вещественных
        чисел наибольшего количества последовательно расположенных
        положительных чисел.
         */
        Scanner scan = new Scanner(System.in);
        long maxS=0, curS=0;
        System.out.println("Задайте размер массиву: ");
        int n = scan.nextInt();
        float[] arr = new float[n];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < n; i++)
        {
        arr[i]=scan.nextFloat();
        System.out.print(" " + arr[i]);
        if (arr[i] > 0)
        curS++;
        else
        {
        if (curS > maxS)
        maxS = curS;
        curS=0;
        }
        }

        System.out.println("Максимальная последовательность положительных вещественнных чисел состоит из: " + maxS);


        }
        */
}
