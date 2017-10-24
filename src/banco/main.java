/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class main {
   
    
    public static void main (String[] args){
        File directorio = new File ("directorio");
        File cuentas = new File ("directorio/cuenta");
        File clientes = new File ("directorio/clientes");
        File admins = new File ("directorio/admins");
        if (directorio.exists() && cuentas.exists() && admins.exists()){
            String archivos[] = directorio.list();
            for (String archivo : archivos) {
                System.out.println(archivo);
                
            }
        System.out.println(directorio.getAbsolutePath());
    }else{
    try{
        directorio.createNewFile();
        cuentas.createNewFile();
        clientes.createNewFile();
        admins.createNewFile();
    }catch(IOException ex) {
        ex.printStackTrace();
    }

        admini adm1 = new admini ("majomushi");
        cliente per1 = new cliente ("mariaapedraza:v", adm1.getNombre());
        cliente per2 = new cliente ("valeriadegalarza", adm1.getNombre());
        cliente per3 = new cliente ("linadenino", adm1.getNombre());
        cuenta cuen1 = new cuenta (1, 23, per1.getNombre(), adm1.getNombre());
        cuenta cuen2 = new cuenta (2, 24, per2.getNombre(), adm1.getNombre());
        cuenta cuen3 = new cuenta (3, 34, per3.getNombre(), adm1.getNombre());
        
                
    
    
}}}
