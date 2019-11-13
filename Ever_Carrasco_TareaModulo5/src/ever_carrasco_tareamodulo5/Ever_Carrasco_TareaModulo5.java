/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ever_carrasco_tareamodulo5;

import Helpers.Circulo;
import Helpers.Cuadrado;
import Helpers.Linea;
import Helpers.Triangulo;

/**
 *
 * @author Ever 
 */
public class Ever_Carrasco_TareaModulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo cr= new Circulo();
        Linea ln = new Linea();
        Triangulo tg= new Triangulo();
        Cuadrado cd= new Cuadrado();
     
        
      System.out.println("-------");  
      cr.Calcular();
      cr.imprimir();
      System.out.println("");
      ln.Dibujar();
      ln.imprimir();
      System.out.println("");
      tg.Calcular();
      tg.imprimir();
      System.out.println("");
      cd.Calcular();
      cd.imprimir();
      
        
        
    }
    
}
