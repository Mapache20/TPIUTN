
package com.mycompanymartin.piutn.logica;

import javax.persistence.Entity;

@Entity
public class Cliente extends Persona {
    
    public String razon_Social ;
    public int cuil;

    public Cliente(){
        
    }

    public Cliente(String razon_Social, int cuil, long id, String nombre, String apellido, int dni, String domicilio, int telefono) {
        super(id, nombre, apellido, dni, domicilio, telefono);
        this.razon_Social = razon_Social;
        this.cuil = cuil;
    }

    public String getRazon_Social() {
        return razon_Social;
    }

    public void setRazon_Social(String razon_Social) {
        this.razon_Social = razon_Social;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
    
    


    
}
