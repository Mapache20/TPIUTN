
package com.mycompanymartin.piutn.persistencia;

import com.mycompanymartin.piutn.logica.Persona;
import com.mycompanymartin.piutn.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {
    
    PersonaJpaController perJpa = new PersonaJpaController();

    public void crearPersona(Persona per) {
       perJpa.create(per);
    }

    public void elimarPersona(long id) {
        try {
            perJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPersona(Persona per) {
        try {
            perJpa.edit(per);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Persona traerPersona(long id) {
      return perJpa.findPersona(id);
    }

    public ArrayList<Persona> traerListaPersonas() {
        
       List<Persona>lista = perJpa.findPersonaEntities();
       ArrayList<Persona>listaPersonas = new ArrayList<Persona>(lista);
       return listaPersonas;
    }
}
