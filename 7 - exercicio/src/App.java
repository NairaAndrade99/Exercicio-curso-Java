import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe o numero para descobrir se é negativo ou positivo : ");
        int num = sc.nextInt();

        if (num <= 0) {
             System.out.println("Negativo !");
        } else {
              System.out.println("Positivo !");
        }


    }
}
