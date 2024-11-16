import java.util.Scanner;

import static javax.management.Query.or;
import java.util.Random;

public class Dowhile {
    public static void main(String[] args){
        /*int sum=0;

        for (int i = 1; i<=100; i++) {
            sum+=i;
            System.out.println(sum);
        }
        System.out.println(sum);*/
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("введите число");

        int fac=1;
        int number=scanner.nextInt();

        for (int y = 1; y <= number; y ++) {
            fac *= y;
        }
        System.out.println(fac);*/
        /*for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.println( i + " число четное");
            }
            else {
                System.out.println(i + "число нечетное");
            }    }*/
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число");
        while (!scanner.hasNextInt()) {
            System.out.println("ошибка введите корректное число");
            scanner.next();
            System.out.println("Попробуйте снова");

        }
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int sum= number1+number2;
        System.out.println("summa " + sum);*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите вещ. числа");

        while (!scanner.hasNextDouble()) {
            System.out.println("ошибка введите ккоректное число");
            scanner.next();
            System.out.println("попробуйте снова");

        }
        double sex1 = scanner.nextDouble();
        double  sex2 = scanner.nextDouble();
        if (sex1 == sex2) {
            System.out.println(" эти числа равны");
        }
        else {
            System.out.println("числа не равны между собой");
        }*/
       /* Scanner scanner =  new Scanner(System.in);
        System.out.println("введите  дествительные числа");

        while (!scanner.hasNextDouble()) {
            System.out.println("ошибка введите корректное число");
            scanner.next();
            System.out.println(("попробуйте снова"));

        }
        double her1 = scanner.nextDouble();
        double her2 = scanner.nextDouble();
        if (her1 <= her2) {
            her1 = 0;
            System.out.println( her1+ " " + her2);
        }
        else {
            System.out.println(her1+ " " + her2);
        }*/
        /*Scanner scanner =  new Scanner(System.in);
        System.out.println("введите 3 действительных числа");

        while (!scanner.hasNextDouble()) {
            System.out.println(" ошибка введите корректные числа");
            scanner.next();
            System.out.println("попробуйте снова");

        }
        double pip1 = scanner.nextDouble();
        double pip2 = scanner.nextDouble();
        double pip3 = scanner.nextDouble();
        if (pip1 >=0) {
            double sex1= pip1 * pip1;
            System.out.println(sex1);

        }
        else {
            System.out.println(pip1);
        }
        if (pip2 >= 0) {
             double sex2 = pip2 * pip2;
            System.out.println(sex2);
                   }
        else {
            System.out.println(pip2);

        }
        if (pip3 >= 0) {
             double sex3 = pip3 * pip3;
            System.out.println(sex3);
        }
        else {
            System.out.println((pip3));
        }*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое положительное число");

        while (!scanner.hasNextInt()) {
            System.out.println("введите корректное число");
            scanner.next();
            System.out.println("попробуйте снова");

        }
        int eryk =  scanner.nextInt();
        int sum = 0;
        while (eryk > 0) {
            sum += eryk % 10;
            eryk /= 10;
        }
        System.out.println(sum);*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 действительных числа");

        while (!scanner.hasNextDouble()) {
            System.out.println(" ошибка: Введите корректное число");
            scanner.next();
            System.out.println("попробуйте снова");

        }
        double pidr1 = scanner.nextDouble();
        double pidr2 = scanner.nextDouble();
        double pidr3 = scanner.nextDouble();

        if (pidr1 < 3 && pidr1 > 1) {
            System.out.println(pidr1);
        }
        if (pidr2 < 3 && pidr2 > 1) {
            System.out.println(pidr2);
        }
        if (pidr3 < 3 && pidr3 > 1) {
            System.out.println(pidr3);
        }*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру");

        while (!scanner.hasNextInt()) {
            System.out.println("ошибка ыыедите ккоректную цифпу");
            scanner.next();
            System.out.println("попробуйте снова");

        }
        int k = scanner.nextInt();
        System.out.println(" 2 * " + k + " =" + k*2);
        System.out.println( " 3 * " + k + " =" + k*3);
        System.out.println(" 4 * " + k + " ="  + k*4);
        System.out.println(" 5 * " + k + " ="  + k*5);
        System.out.println(" 6 * " + k + " ="  + k*6);
        System.out.println( "7 * " + k + " =" + k*7);
        System.out.println(" 8 * " + k + " ="  + k*8);
        System.out.println(" 9 * " + k + " ="  + k*9);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите 3 положительных действ числа");

        while (!scanner.hasNextDouble()) {
            System.out.println("ошибка введите корректные числа");
            scanner.next();
            System.out.println("попробуйте снова");


        }
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        if ((x + y > z)) {
            System.out.println("треугольник с такими сторонами существует");
        }
        else {
            if ((x + z > y)) {
                System.out.println("треугольник с такими сторонами существует");
            }
            else {
                if ((z + y > x)) {
                    System.out.println("треугольник с такими сторонами существует");
                }
            }
        }
        if ((x+y < z) && (x + z <y) && (z + y < x)) {
            System.out.println("такого треуголника нет");
        }*/

//Создаем массив)))))))
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите длину массива");
        int length = scanner.nextInt();

        int[] array =  new int [length];

        System.out.println("введите элементы массива");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        /*Random random = new Random();

        for (int i =0; i < length; i++) {
            array[i] = random.nextInt(100);


        }*/

        for (int i = 0; i < length; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }








    }
}
