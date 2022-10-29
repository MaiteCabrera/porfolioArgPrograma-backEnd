
package com.porfolio.maiteCabrera.Service;

import com.porfolio.maiteCabrera.Entity.Project;
import java.util.List;

public interface IProjectService {

    public List<Project> listaProyectosUsuario(Integer id);

    public Project buscarProyecto(Integer id);

    public Project guardarProyecto(Integer id, Project prj);

    public void eliminarProyecto(Integer id);

    public Project editarProyecto(Integer id, Project prj);
}
