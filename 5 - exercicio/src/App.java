import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantas pecas deseja registrar ? ");
        int num = sc.nextInt();

         int [] id = new int[num ]; 
         int [] numPeca = new int[num];
         double [] valorUni = new double[num];
         double pagar = 0;

         for (int i = 0; i < numPeca.length; i++){
                System.out.println("Informe o id da peca " + i);
                id[i] = sc.nextInt();    
                System.out.println("Numero de peca " + i);
                numPeca[i] = sc.nextInt();
                System.out.println("Valor unitario de peca " + i);
                valorUni [i] = sc.nextDouble();
         }

         for (int i = 0;i < numPeca.length; i++){
              pagar += numPeca[i] * valorUni[i];
             
         }
         System.out.printf("Valor a pagar R$ %.2f ", pagar);
         
    }
}
