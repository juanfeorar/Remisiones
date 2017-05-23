package com.remisiones.rest.seguridad;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.r.remisiones.dao.seguridad.RolDaoImpl;
import com.remisiones.dominio.seguridad.Rol;


/**
 * <b><p>Capa SERVICIOS Rest: es la que interactua con el cliente es como la capa VISTA <p></b> 
 * Esta clase es la encargada de interactuar con el cliente para todas las 
 * transaciones de ROL de usuario, luego envía y recibe los datos a la capa DAO 
 * con la clase {@link com.remisiones.dao.seguridad.RolDaoImpl}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 01/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */
@RestController
@RequestMapping("seguridad/roles")
public class RolController {

	@Resource
	private RolDaoImpl objRolDao;
	private final Logger log = Logger.getLogger(RolController.class);


	/**
	 * <p>Método POST para REGISTRAR que recibe los datos del cliente en un objeto 
	 * JSON y los convierte en objeto Rol para enviarselos a DAO. 
	 * La url por POST sería /Remisiones/seguridad/roles</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param objRol objeto tipo Rol
	 * @return boolean true si se creó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean grabarRol(@RequestBody Rol objRol){

		try {
			objRolDao.grabarRol(objRol);
			log.info("Datos en ROL almacenados con éxito '" + objRol.getNombreRol() + " " 
					+ objRol.getDescripcionRol() + "'" + HttpStatus.OK);
			return true;
		} catch (Exception e) {
			log.error("Al guardar en la tabla seg_rol " 
					+ e.getMessage());
			return false;
		}
	}

	/**
	 * <p>Método PUT para ACTUALIZAR que recibe los datos del cliente en un objeto 
	 * JSON y los convierte en objeto Rol para enviarselos a DAO. 
	 * La url por PUT sería /Remisiones/seguridad/roles</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param rol objeto tipo Rol
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean actualizarRol(@RequestBody Rol objRol){
		try {
			objRolDao.actualizaRol(objRol);
			log.info("Actualización ROL con éxto: ID " + objRol.getId_rol() 
			+ " nombre: " + objRol.getNombreRol());
			return true;
		} catch (Exception e) {
			log.error("Al actualizar en la tabla seg_rol "+ e.getMessage());
			return false;
		}
	}

	/**
	 * <p>Método GET para CONSULTAR TODOS que envía los datos al cliente en un objeto 
	 * JSON, luego de recibirlos desde el DAO como un objeto Rol. 
	 * La url por GET sería /Remisiones/seguridad/roles</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * @return List<Rol> Lista de Roles en caso contrario retona null
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Rol> consultarRol() {

		try {
			log.info("Consulta ROL con éxito"+HttpStatus.INTERNAL_SERVER_ERROR);
			return objRolDao.ListaRols();
		} catch (Exception e) {
			log.error("Al consultar tabla seg_rol " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * <p>Método GET para CONSULTAR 1 registro, recibe el ID desde el cliente y lo 
	 * envía al DAO. La url por GET sería /Remisiones/seguridad/roles/ID_ROL</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * @return List<Rol> Lista de Rol en caso contrario retona null
	 */
	@RequestMapping(value = "/{id_rol}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Rol> consultarRolId(@PathVariable int id_rol) {

		try {
			log.info("Consulta ROL con éxito ID " + id_rol);
			return objRolDao.consultaRolId(id_rol);
		} catch (Exception e) {
			log.error("Al consultar tabla seg_rol " + e.getMessage());
			return null;
		}
	}

	/**
	 * <p>Método DELETE para ELIMINAR ROL que recibe el ID desde el cliente y lo 
	 * envía a DAO. La url por DELETE sería /Remisiones/seguridad/roles/ID_ROL</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param int id_rol
	 * @return boolean true si se eliminó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(value = "/{id_rol}", method = RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean eliminarRol(@PathVariable int id_rol){
		try {
			objRolDao.eliminaRol(id_rol);
			log.info("ROL ELIMINADO con éxto: ID " + id_rol);
			return true;
		} catch (Exception e) {
			log.error("Al ELIMINAR en la tabla seg_rol "+ e.getMessage());
			return false;
		}
	}
}
