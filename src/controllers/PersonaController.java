package controllers;

import models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas){
        for(int i = 0; i < personas.length - 1; i++){
            int may = i;
            for(int j = i + 1; j < personas.length; j++){
                if(personas[j].compareCodigoDireccion(personas[may])){   
                    may = j;
                }
            }
    
            if(i != may){
                Persona aux = personas[may];
                personas[may] = personas[i];
                personas[i] = aux;
            }
        }
    }
    

    public Persona findByCodigoDireccion(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length - 1;
    
        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
    
            if (personas[centro].equalsByCodigoDireccion(codigo)) {
                return personas[centro];
            }
    
            if (personas[centro].getDireccion().getCodigo() < codigo) {
                alto = centro - 1;
            } 
            else {
                bajo = centro + 1;
            }
        }
    
        return null;
    }
    
}
