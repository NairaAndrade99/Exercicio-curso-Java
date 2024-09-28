import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner (System.in);

       float x = sc.nextFloat();
       float y = sc.nextFloat();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0){
                System.out.println("Pimeiro");
            }else if (x < 0 && y > 0){
                System.out.println("Segundo");
            }else if (x < 0 && y < 0){
                System.out.println("Terceiro");
            }else {
                System.out.println("Quarto");
            }
            
            x = sc.nextFloat();
            y = sc.nextFloat();

        }
            
           

            

        
            
    }
}
