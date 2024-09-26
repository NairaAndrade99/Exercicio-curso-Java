import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
       Scanner sc = new Scanner(System.in);

       System.out.println("Informe os dois numeros para soma: ");
       int numUm = sc.nextInt ();
       int numDois = sc.nextInt ();

       int soma = numUm + numDois;

       System.out.println("Soma = " + soma);

        
    }
}
