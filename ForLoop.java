import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите число");

        while(!scanner.hasNextDouble()){
            System.out.println("Ошибка: введите корректное целое число");
            scanner.next();// удаляем некортекный ввод
            System.out.print("Попробуйте снова");
        }
        double number=scanner.nextDouble();
        double number2=scanner.nextDouble();
        if(number2>number){
            System.out.println("2>1");

        }
        else{
            if(number2==number){
                System.out.println("1=2");
            }
         else{
             System.out.println("2>1");
            }
        }


        }
    }

