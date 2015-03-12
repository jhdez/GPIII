// Jorge Hdez.
// 06/03/2013

public class Circulo extends Point{
  private double radio;
  
  public Circulo(double x, double y, double radio){ 
      super(x,y); //recoge las var. x e y
      this.radio=radio;
  }
  
  
  // Metodos
  public void desplazarCentro(double dx, double dy){
    super.deplace(dx,dy);
  }
  
  public void cambiarRadio(double r){
    radio=r;
  }
  
  public Point devolverCentro(){
    return new Point(super.getX(),super.getY());
  }
  
  public void imprime(){
    super.imprime();
    System.out.println("radio: "+radio);
  }
}
      