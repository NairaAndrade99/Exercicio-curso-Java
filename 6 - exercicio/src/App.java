import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe os valores : ");
        
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

       float areaTriangulo = a * c / 2;
       float areaCirculo =  (float) Math.PI * (float) Math.pow(c, 2);
       float areaTrapezio = ((a + b ) * c )/2;
       float areaQuadrado = b * b;
       float areaRetangulo = a * b;

       System.out.println("Area do Triangulo = " + areaTriangulo);
       System.out.println("Area do circulo = " + areaCirculo);
       System.out.println("Area do trapezio = " + areaTrapezio);
       System.out.println("Area do quadrado = " + areaQuadrado);
       System.out.println("Area do retangulo = " + areaRetangulo);
       
        

         

    }
}
