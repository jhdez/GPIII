// Jorge Hdez.
// 06/03/2013

class Point{
  private double x,y;
  public Point (double x, double y){
    this.x=x;
    this.y=y;
  }
  public void deplace (double dx, double dy){
    x+=dx;
    y+=dy;
  }
  public void imprime (){
    System.out.println("Punto de coordenas " + x + " " + y);
  }
  public double getX(){
    return x; }
  public double getY(){
    return y; }
}


    
