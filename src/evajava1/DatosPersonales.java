/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import javax.swing.JOptionPane;//paquete para usar ventanas paso1

/**
 *
 * @author LAB01
 */
public class DatosPersonales 
{
 public static void main(String[] args)
 {
  String nombre;//paso 2 
  int edad;
  int incremento;
  nombre =(JOptionPane.showInputDialog("Ingrese su nombre"));//paso 3 el showInput datos de entarada por ventana
  edad = Integer.parseInt (JOptionPane.showInputDialog("Ingrese su edad"));
  incremento = edad+20;
  JOptionPane.showMessageDialog(null,"Bienvenido "+nombre+ "en 20 años su edad sera"+(incremento)+ "años");
  
  
  
 }   
}
