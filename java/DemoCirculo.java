import java.util.Scanner;

public class DemoCirculo{

  public static void main(String[] args){
  
    double dx,dy,radio;
    
    Circulo a = new Circulo (0.1,0,2);
    Scanner teclado = new Scanner (System.in);
    
    System.out.println("¿Cuanto quieres desplazar x?");
    dx = teclado.nextDouble();
    
    System.out.println("¿Cuanto quieres desplazar y?");
    dy = teclado.nextDouble();
    
    a.desplazarCentro(dx,dy);
    System.out.println("¿Cuanto quieres q mida el radio?");
    radio = teclado.nextDouble();
    a.cambiarRadio(radio);
    
    a.imprime();
   /* 
    Circulo a = new Circulo (0.1,0,2);
    a.imprime();
    a.desplazarCentro(2,4);
    a.imprime();
    a.cambiarRadio(8);
    a.imprime();
    */
    }
}