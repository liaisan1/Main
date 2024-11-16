import java.util.Scanner;

public class urok {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите число от 0 до 100");

        while (!scanner.hasNextInt()) {
            System.out.println("ошибка ввведите число от 0 до 100)");
            scanner.next();
            System.out.println("попрробуйте снова");

        }
        int number = scanner.nextInt();
        if (0 <= number & number <= 59) {
            System.out.println("неудовл");
            if (60 <= number & number <= 74) {
                System.out.println("удовл");
                if (75 <= number & number <= 89) {
                    System.out.println("ok");
                    if (90 <= number & number <= 100) {
                        System.out.println("super");

                    }
                }

            }*/

        /*Scanner scanner =  new Scanner(System.in);
        System.out.println("введите число т 1 до 5");
        int k = scanner.nextInt();

        switch (k) {
            case 1:
                System.out.println(" loh");
                break;
            case 2:
                System.out.println("неудовл");
                break;
            case 3:
                System.out.println("удовлетв");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("ошибка");
                break;




        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("ввдите час, то есть число от 0 до 23");

        int hours = scanner.nextInt();
        switch (hours) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("good night");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("guten morgen");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("guten day");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                System.out.println("good abend");
                break;
            default:
                System.out.println("oшибка");
                break;

        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите действ число");
        double x = scanner.nextDouble();

        System.out.println("введите номер действия: 1 – возвести число в квадрат; 2 – извлечь корень квадратный; 3 – вычислить синус; 4 – косинус");

        int y = scanner.nextInt();
        switch (y) {
            case 1:
                System.out.println(x*x);
                break;
            case 2:
                System.out.println(Math.sqrt(x));
                break;
            case 3:
                System.out.println(Math.sin(x));
                break;
            case 4:
                System.out.println(Math.cos(x));
                break;
            default:
                System.out.println("ошибка");
                break;

        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите букву от a до f");
        String x = scanner.nextLine();
        switch (x){
            case "a" :
                System.out.println("A");
                break;
            case "b" :
                System.out.println("B");
                break;
            case "c" :
                System.out.println("C");
                break;
            case "d" :
                System.out.println("D");
                break;
            case "e" :
                System.out.println("E");
                break;
            case "f" :
                System.out.println("F");
                break;
            default:
                System.out.println("ошибка");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите месяц от 1 до 12");
        int x = scanner.nextInt();
        int sex = 12 - x;
        System.out.println(sex + " месяцев осталось");*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину прямоугольника");
        int m = scanner.nextInt();
        System.out.println("введите ширину прямоугольника");
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("1".repeat(n));

        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println(" введите целые чиса а и в и действительное число z");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double z = scanner.nextDouble();
        int x = a%b;
        if (x ==0) {
            System.out.println(z*x);
        }
        else {
                System.out.println(z/x);
            }*/

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("введите длину массива");
        int length = scanner.nextInt();

        int[] array =  new int [length];

        System.out.println("введите элементы массива");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < length; i++) {
            if ((array[i] > array[i-1]) && (array[i] > array[i+1])) {
                if (array[i] % 2 == 0) {
                    System.out.println(array[i] + " - локальный максимум");
                } else {
                    System.out.println(" нет локального максимума");
                }
            }
            else {
                    System.out.println("ошибка");
                }


        }*/

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("введите длину последовательности");
        int len = scanner.nextInt();

        int[] massiv = new int[len];

        System.out.println("введите элементы массива");
        for( int i = 0; i < len; i++) {
            massiv[i] = scanner.nextInt();
        }

        int k = 0;
        int sum = 0;

        for( int i = 0; i < len; i++) {
            if ((massiv[i] % 5 == 0) && (massiv[i] % 7 !=0)) {
                k += 1;
                sum += massiv[i];
            }
        }
        System.out.println("количество " + k + " summa " + sum);*/



    }
}

