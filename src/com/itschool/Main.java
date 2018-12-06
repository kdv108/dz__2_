package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Example_1();
        Example_2();
        Example_3();
        Example_4();
        Example_5();
        Example_6();
        Example_7();
        Example_8();
        Example_9();
        Example_10();
    }
    private static void Example_1(){
        double znam, chislit;

        System.out.println("Программа вычисляет частное двух чисел.");
        System.out.println("Введите числитель:");
        Scanner in = new Scanner(System.in);
        chislit = in.nextDouble();
        System.out.println("Введите знаменатель:");
        znam = in.nextDouble();

        if (znam == 0){
            System.out.println("Ошибка! Деление на 0 невозможно.");
        }
        else {
            System.out.println("Частное чисел "+chislit+" и "+znam+" равно: "+ chislit/znam);
        }
    }
    private static void Example_2(){
        int otvet = 1794;
        int x;

        Scanner in = new Scanner(System.in);
        System.out.println("Программа проверяет знание даты основания города Одессы.");
        System.out.println("Введите год в котором был основан город Одесса?");
        x = in.nextInt();

        if (x == otvet){
            System.out.println("Совершенно верно!");
        }
        else {
            System.out.println("Ваш ответ неверный! Одесса была основана в "+otvet+" году.");
        }
    }
    private static void Example_3(){
        double pokypka;
        double skidka3 = 0.03;
        double skidka5 = 0.05;
        double symma3 = 500;
        double symma5 = 1000;

        Scanner in = new Scanner(System.in);
        System.out.println("Программа расчета суммы покупки со скидкой.");
        System.out.println("Введите сумму покупки:");
        pokypka = in.nextDouble();

        if (pokypka > symma5){
            pokypka = pokypka - pokypka * skidka5;
            System.out.println("Вам предоставляеться скидка 5%, стоимость вашей покупки со скидкой составляет: "+pokypka);
        }
        else if (pokypka > symma3){
            pokypka = pokypka - pokypka * skidka3;
            System.out.println("Вам предоставляеться скидка 3%, стоимость вашей покупки со скидкой составляет: "+pokypka);
        }
        else {
            System.out.println("Скидка Вам не предоставляется.");
        }
    }
    private static void Example_4(){
        int chislo;
        int d = 2;

        System.out.println("Программа определения четности полученного числа.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        chislo = in.nextInt();

        if ((chislo % d) == 0){
            System.out.println("Введенное число "+chislo+" - четное.");
        }
        else {
            System.out.println("Введенное число "+chislo+" - нечетное.");
        }
    }
    private static void Example_5(){
        int chislo3;
        int d3 = 3;

        System.out.println("Программа определяет делится ли введенное число на 3.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        chislo3 = in.nextInt();

        if ((chislo3 % d3) == 0){
            System.out.println("Введенное число "+chislo3+" делиться на 3 нацело.");
        }
        else {
            System.out.println("Введенное число "+chislo3+" нацело на 3 не делится.");
        }
    }
    private static void Example_6(){
        double tarif = 20.00;
        int min;
        int day;
        double skidka20 = 0.2;

        System.out.println("Программа вычисляет стоимость телефонного разговора.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длительность телефонного разговора (целых минут):");
        min = in.nextInt();
        System.out.println("Введите день телефонного разговора (1-понедельник ... 7-воскресенье):");
        day = in.nextInt();

        if((day == 6) || (day == 7)){
            System.out.println("Предоставляется скидка 20% , стоимость данного разговора: "+(min * (tarif - tarif * skidka20)));
        }
        else {
            System.out.println("Стоимость данного разговора: "+(min * tarif));
        }
    }
    private static void Example_7(){
        double number;
        double first, second, third;

        System.out.println("Программа определяет какая цифра в заданом 3-ех значном числе больше.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трехзнаяное целое число:");
        number = in.nextDouble();
        first = number / 100 % 10;
        second = number / 10 % 10;
        third = number / 1 % 10;
        first = Math.floor(first);
        second = Math.floor(second);
        third = Math.floor(third);
        if((first < second) & (first < third)){
            System.out.println("Вторая или последняя цифра больше.");
        }else if (second < third){
            System.out.println("Первая или последняя цифра больше.");
        } else System.out.println("Первая или вторая цифра больше.");
    }
    private static void Example_8(){
        double N;
        double num1, num2, num3;
        double kvadrat, kybS;

        System.out.println("Программа определяет равен ли квадрат трехзначного числа сумме кубов его цифр");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число:");
        N = in.nextDouble();
        num1 = N / 100 % 10;
        num2 = N / 10 % 10;
        num3 = N / 1 % 10;
        num1 = Math.floor(num1);
        num2 = Math.floor(num2);
        num3 = Math.floor(num3);
        kvadrat = Math.pow(N, 2);
        kybS = Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3);
        if (kvadrat == kybS){
            System.out.println("Квадрат числа "+N+" равен сумме кубов его цифр!");
        } else System.out.println("Сумма кубов цифр числа "+N+" НЕ равна его квадрату.");
    }
    private static void Example_9(){
        double y = 6;
        double x = 4;
        double nY = y*1;
        double nX = x*1;

        System.out.println("Программа присваивает удвоенное произведение чисен x и y большему из них числу, и половину суммы меньшему:");
        x = (nX < nY) ? ((nX + nY) / 2) : ((nY * nX) * 2);
        y = (nY < nX) ? ((nX + nY) / 2) : ((nY * nX) * 2);
        System.out.println("Начальные значения: х = "+nX+", у = "+nY);
        System.out.println("После проверки значения стали : х = "+x+", у = "+y);
    }
    private static void Example_10(){
        double b, a, x ;

        System.out.println("Программа решает уравнение аx³ + bx = 0 , при произвольных а,b.");
        Scanner in = new Scanner(System.in);
        System.out.println("Упростим уравнение до вида x = √(-b/a), \n\n Введите переменную a:");
        a = in.nextDouble();
        System.out.println("Введите переменную b:");
        b = in.nextDouble();

        if (a != 0){
            if((-b/a) >= 0 ){
                if((-b/a) == 0) {
                    x = 0;
                    System.out.println("При заданных значениях а и b  x = "+x);
                } else {
                    x = Math.sqrt((-b/a));
                    System.out.println("При заданных значениях а и b  x = "+x);
                }
            } else System.out.println("При заданных значениях а и b  x не имеет решения. ");
        } else System.out.println("Уравнение не имеет решения так как а = 0.");
    }

}
