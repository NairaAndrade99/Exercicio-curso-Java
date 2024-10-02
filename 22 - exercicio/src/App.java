import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);

        System.out.println(" Fatorial ");

        System.out.print("Informe o numero: ");
        int num = sc.nextInt();

       
      
        for (int i = 0; i < num; i++) {

                if ( num == 0 || num == 1){
                    System.out.println(" 1 ");

                }else {
                     num = num * (num - i);
                }
        }
        
        System.out.println(num);
    }
}
