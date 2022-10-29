/*

 */
package com.porfolio.maiteCabrera.Repository;

import com.porfolio.maiteCabrera.Entity.Educacion;
import com.porfolio.maiteCabrera.Entity.Experiencia;
import com.porfolio.maiteCabrera.Entity.Project;
import com.porfolio.maiteCabrera.Entity.UploadedFile;
import com.porfolio.maiteCabrera.Entity.UsuarioInfo;
import com.porfolio.maiteCabrera.Entity.hys;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioInfoRepository extends JpaRepository<UsuarioInfo, Integer> {

    @Query("SELECT exp FROM UsuarioInfo us join us.experiencias exp WHERE us.idInfo = :id")
    List<Experiencia> findExperiencesByUsuario(@Param("id") Integer Id);

    @Query("SELECT edu FROM UsuarioInfo us join us.educations edu WHERE us.idInfo = :id")
    List<Educacion> findEducationsByUsuario(@Param("id") Integer Id);

    @Query("SELECT skl FROM UsuarioInfo us join us.skills skl WHERE us.idInfo = :id")
    List<hys> findSkillsByUsuario(@Param("id") Integer Id);

    @Query("SELECT prj FROM UsuarioInfo us join us.projects prj WHERE us.idInfo = :id")
    List<Project> findProjectsByUsuario(@Param("id") Integer Id);
    
    @Query("SELECT file FROM UsuarioInfo us join us.file file WHERE us.idInfo = :id")
    UploadedFile findUploadedFileByUsuario(@Param("id") Integer Id);



}
