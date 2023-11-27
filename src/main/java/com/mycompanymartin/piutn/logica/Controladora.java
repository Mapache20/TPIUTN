

package com.mycompanymartin.piutn.logica;

import com.mycompanymartin.piutn.persistencia.ControladoraPersistencia;
import java.util.ArrayList;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearPersona(Persona per) {
        
        controlPersis.crearPersona(per);
    }
    
    public void eliminarPersona(long id) {
        
        controlPersis.elimarPersona(id);
    }
    
    public void editarPersona(Persona per) {
        
        controlPersis.editarPersona(per);
    }
    
    public Persona traerPersona(long id) {
        
        return controlPersis.traerPersona(id);
    }
    
    public ArrayList<Persona> traerListaPersonas() {
        
        return controlPersis.traerListaPersonas();
    }
    
}
