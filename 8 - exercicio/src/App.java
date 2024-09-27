import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o valor para saber se ele é par ou impar: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("É par !");
        }else {
            System.out.println("É impar !");
        }

        
    }
}
