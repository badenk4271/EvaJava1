/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB01
 */
public class Nomina 
{
 public static void main(String[] args) 
 {
     int sueldo=0;
     int horas=0;
     int total_valor=0;
     
     horas=Integer.parseInt (JOptionPane.showInputDialog("Ingrese horas que trabajo"));
     total_valor = Integer.parseInt (JOptionPane.showInputDialog("ingrese valor por horas"));
     sueldo = horas*total_valor;
     JOptionPane.showMessageDialog(null,"Su sueldo por horas trabajadas es "+sueldo);  
     
      
     
 }   
}
