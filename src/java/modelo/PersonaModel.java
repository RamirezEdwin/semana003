/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Personas;

/**
 *
 * @author Mauricio
 */
public class PersonaModel {
    
    public Personas consulta(){
        
       Personas p= new Personas (1,"Juan Perez");
       return p;
    }
    
    
    
}
