/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Estudiante
 */
public class cuenta  {
   private int id;
   private double credito;
   private cliente cliente1;

    public cuenta(int id, double credito, String nombre, String nombreadmin) {
        this.id = id;
        this.credito = credito;
        this.cliente1= new cliente(nombre, nombreadmin);
    }
   
   
    
    
    
}
