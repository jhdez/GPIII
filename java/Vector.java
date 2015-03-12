//Jorge Hdez
//Manipulacion de vectores

import java.util.Scanner;

public class Vector{
  
    public double components[];
    
    //Constructores
    public Vector(int n){
      int i;
      for(i=0;i<n;i++)
	components[i]=0;
    }
    
    public Vector(int n, double x){
      int i;
      for(i=0;i<n;i++)
	components[i]=x;
    }
    
    public Vector(double[] v){
      int n = v.length;
      int i;
      for(i=0;i<n;i++)
	components[i] = v[i];
    }
    
    //Metodos
    public double productoEscalar(Vector v2){
      int i;
      double prod=0;
      if (this.components.length==v2.components.length){
	for(i=0;i<v2.components.length;i++)
	  prod= prod + this.components[i]*v2.components[i];
      }
      return prod;
    }
    
    public static Vector suma(Vector v1, Vector v2){
      
     // int n = v1.length;
      Vector sum= new Vector(v1.components.length);
      if (v1.components.length==v2.components.length){
	for(int i=0;i<v1.components.length;i++)
	  sum.components[i]= v1.components[i] + v2.components[i];
	return sum;
      }
      else return null;
    }
    
    public void imprimir(double[] v){
      int i;
     // int n = v.length;
      System.out.print("Vector:");
      for(i=0;i<v.length;i++)
	System.out.print(" "+v[i]);
    }
      
    
    
    
    
    /*  
    
    main
  
    Vector v = new Vector(5);
    Vector v2 = new Vector(5);
    
    v.productoEscalar(v2)
    Vector.suma(v1,v2);
    */
    }