/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.maiteCabrera.Security.Entity;

import com.porfolio.maiteCabrera.Security.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Enumerated(EnumType.STRING) /*anotaishion define los valores que van a ingresar, de tipo string*/
    private RolNombre rolNombre;
    
    //Contructor 
    //no pongo el del ID porque se esta generando
    public Rol( RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Rol() {
    }
    
    //Getter & Setter 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
}
