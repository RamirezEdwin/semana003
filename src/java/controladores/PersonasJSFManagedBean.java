/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import modelo.PersonaModel;

/**
 *
 * @author Mauricio
 */
@Named(value = "personasB")
@SessionScoped
public class PersonasJSFManagedBean implements Serializable {

    private   PersonaModel personaModel;
    public PersonasJSFManagedBean() {
    }

    public PersonaModel getPersonaModel() {
        return personaModel;
    }

    }
    
    
    
    
    
    
