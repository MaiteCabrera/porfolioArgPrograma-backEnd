/*
 revisado
 */
package com.porfolio.maiteCabrera.Security.Service;

import com.porfolio.maiteCabrera.Security.Entity.Rol;
import com.porfolio.maiteCabrera.Security.Enums.RolNombre;
import com.porfolio.maiteCabrera.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional /*sincroniza la base de datos, persistencia*/
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}