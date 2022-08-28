/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.maiteCabrera.Interface;

import com.porfolio.maiteCabrera.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    
    //Guardar una objeto de tipo Persona
    public void savePersona(Persona persona);
    
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    
    //Buscar una persona por ID.
    public Persona findPersona(Long id);
    
    
}
