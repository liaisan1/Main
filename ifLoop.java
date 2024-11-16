import java.util.Scanner;

public class ifLoop {
    public static void main(String[] args){
        /*int a=5;
        String result=(a>0)?" положительное чтсло":" отрицательное";
        System.out.println(result);*/
        // напишите прогу которая запрашивает у пользователя целое число и определяет является ли оно четным или нечетныь
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите число");
        // Проверяем ввод пока не получим число
        while(!scanner.hasNextInt()) {

            System.out.println("Ошибка: введите корректное целое число");
            scanner.next();// удаляем некортекный ввод
            System.out.print("Попробуйте снова");
        }
        int number =scanner.nextInt();
        if(number %2==0){
            System.out.println("число четное");

        }
        else{
            System.out.println("Число нечетное");
        }


        }
    }

