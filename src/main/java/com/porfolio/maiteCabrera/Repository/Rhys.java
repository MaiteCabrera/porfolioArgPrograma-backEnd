
package com.porfolio.maiteCabrera.Repository;

import com.porfolio.maiteCabrera.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Rhys extends JpaRepository<hys, Integer>{
    Optional<hys> findByNombre(String nombre);  //mencionamos metodos no desarrolamos 
    public boolean existsByNombre(String nombre);
}