package com.aletonda.portfolio.Interface;

import com.aletonda.portfolio.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer Personas
    public List<Persona> getPersona();
    
    //Guardar Persona
    public void savePersona(Persona persona);
    
    //Eliminar Persona x id
    public void deletePersona(Long id);
    
    //Buscar Persona x id
    public Persona findPersona(Long id);
}