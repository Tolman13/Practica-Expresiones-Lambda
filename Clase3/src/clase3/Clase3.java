/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estacion2
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> cadenas= new ArrayList<>();
        cadenas.add("rodrigo");
        cadenas.add("daniel");
        cadenas.add("franco");
        
       /* numeros.stream().forEach((numero) -> System.out.println(numero));*/
       
        cadenas.stream().forEach((cadena)->System.out.println(cadena.toUpperCase()));
    }
    
}
