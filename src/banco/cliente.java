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
public class cliente extends Persona {
     private admini admin;
     private ArrayList<cuenta> cuentas;
     public cliente (String nombre, String nombreAdmin) {
        super(nombre);
        this.cuentas= new ArrayList<>();
        this.admin  = new admini(nombreAdmin );
    }
}
