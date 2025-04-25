package controllers;

import models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas){
        for(int i=0;i<personas.length-1;i++){
            int may=i+1;
            for(int j=i+1;i<personas.length;i++){
                if(personas[j].compareCodigoDireccion(personas[i])){   
                    may=j;
                }
            }

            if(i!=may){
                Persona aux=personas[may];
                personas[may]=personas[i];
                personas[i]=aux;
            }
        }
    }

    public Persona findByCodigoDireccion(Persona[] personas, int codigo){
        int bajo=0;
        int alto=personas.length-1;
        
        while(alto>=bajo){
            int centro=(alto+bajo)/2;

            if(personas[centro].equalsByCodigoDireccion(codigo)){
                return personas[centro];
            }

            if(personas[centro].compareCodigoDireccion(codigo)){
                alto=centro-1;
            }
            
        }
        return null;
    }
}
