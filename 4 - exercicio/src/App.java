import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o id do funcionario: ");
        int id = sc.nextInt();

        System.out.println("Informe o numero de horas trabalhadas: ");
        int horaTraba = sc.nextInt();

        System.out.println("Informe o valor por hora: ");
        double valorHora = sc.nextDouble();

        double salario = horaTraba * valorHora;

        System.out.println("\n--------------------------");
        System.out.printf(" Id: %d ", id);
        System.out.printf(" \n Salario R$ %.2f", salario);
        System.out.println(" \n ---------------------------");
    }
}
