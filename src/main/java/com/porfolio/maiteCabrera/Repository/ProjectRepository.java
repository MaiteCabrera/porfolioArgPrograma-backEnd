/*
Interfaz del proyecto
 */
package com.porfolio.maiteCabrera.Repository;

import com.porfolio.maiteCabrera.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    
}