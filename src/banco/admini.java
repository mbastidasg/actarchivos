/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class admini extends Persona{
    private ArrayList <cliente> clientes;
   
    
    public admini(String nombre) {
        super(nombre);
        this.clientes = new ArrayList <>();
      
    }
    
}
