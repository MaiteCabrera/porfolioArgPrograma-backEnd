/*

 */
package com.porfolio.maiteCabrera.Repository;

import com.porfolio.maiteCabrera.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer> {
}