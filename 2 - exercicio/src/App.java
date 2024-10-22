import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*
        * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos. 
 
Fórmula da área: area = π . raio2 
 
Considere o valor de π = 3.14159 



        */

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o valor do raio do circulo: ");
        double raioCirculo = sc.nextDouble();

        double area = Math.PI * Math.pow(raioCirculo, 2);

        System.out.printf("Area = %.2f ", area);
        
    }
}
