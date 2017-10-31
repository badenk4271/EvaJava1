/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import java.util.Scanner;// (paso 1)


/**
 *
 * @author LAB01
 */
public class Rectangulo 
{
  public static void main(String[] args) //(paso 2 declarar variables)
  {
      float area, base, altura;
      Scanner sc=new Scanner(System.in);//Paso 3
      System.out.println("Ingrese la base del rectangulo");//paso4
      base = sc.nextFloat();//leo y guardo los datos de entrada 
      System.out.println("Ingrese la altura del rectangulo");
      altura = sc.nextFloat();
      
      area= base*altura; //paso 5
      System.out.println("El  area del rectangulo es:"+area+" mts2");
  } 
    
    
    
}
