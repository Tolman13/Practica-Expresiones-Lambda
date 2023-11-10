/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estacion2
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      List <String> auto= new ArrayList<>();
      auto.add("corolla");
      auto.add("voyage");
      auto.add("amarok");
      auto.add("camaro");
      Transformador instancia = lista -> {
            List<String> resultado = new ArrayList<>();
            lista.forEach(cadena -> resultado.add(cadena.toUpperCase()));
            return resultado;
        };

        List<String> vehiculo = instancia.convertirAMayusculas(auto);

        // Imprimiendo el resultado
        System.out.println("Lista Original: " + auto);
        System.out.println("Lista Transformada: " + vehiculo);
    
}
}
