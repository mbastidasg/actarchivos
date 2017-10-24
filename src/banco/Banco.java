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
public class Banco {
    private String nombrebanco;
private ArrayList <admini> admins;
private ArrayList <cuenta> cuentas;
private ArrayList <cliente> clientes;

    public Banco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
        this.admins = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.cuentas= new ArrayList<>();
    }


   
  
    
}
