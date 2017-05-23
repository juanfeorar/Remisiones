package com.remisiones.rest.seguridad;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.r.remisiones.dao.seguridad.PermisoDAOImpl;
import com.remisiones.dominio.seguridad.Permiso;


/**
 * <b><p>Capa SERVICIOS Rest: es la que interactua con el cliente es como la capa VISTA <p></b> 
 * Esta clase es la encargada de interactuar con el cliente para todas las 
 * transaciones de PERMISO, luego envía y recibe los datos a la capa DAO 
 * con la clase {@link com.remisiones.dao.seguridad.PermisoDAOImpl.java}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 17/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */
@RestController
@RequestMapping("seguridad/permisos")
public class PermisoController {

	@Resource
	private PermisoDAOImpl objPermisoDao;
	private final Logger log = Logger.getLogger(PermisoController.class);

	/**
	 * <p>Método POST para REGISTRAR que recibe los datos del cliente en un objeto 
	 * JSON y los convierte en objeto Permiso para enviarselos a DAO. 
	 * La url por POST sería /Remisiones/seguridad/permisos</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param objPermiso objeto tipo Permiso
	 * @return boolean true si se creó con éxito, en otro caso devuelve false
	 */

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean grabarPermiso(@RequestBody Permiso objPermiso) {
		try {
			objPermisoDao.grabarPermiso(objPermiso);
			log.info("Datos en PERMISO almacenados con éxito: '" 
					+ objPermiso.getNombrPermisos() + " descripción " 
					+ objPermiso.getDescripcionPermisos() + "'");
			return true;
		} catch (Exception e) {
			log.error("Al guardar en la tabla seg_permiso " 
					+ e.getMessage());
			return false;
		}

	}

	/**
	 * <p>Método PUT para ACTUALIZAR Permiso que recibe los datos del cliente en un objeto 
	 * JSON y los convierte en objeto Permiso para enviarselos a DAO. 
	 * La url por PUT sería /Remisiones/seguridad/permisos</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param objPermiso objeto tipo Permiso
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean actualizarPermiso(@RequestBody Permiso objPermiso) {
		try {
			objPermisoDao.actualizaPermiso(objPermiso);
			log.info("Datos en PERMISO actualizados con éxito: ID" 
					+ objPermiso.getIdPermisos());
			return true;
		} catch (Exception e) {
			log.error("Al actualizar en la tabla seg_permiso ID:" 
					+ objPermiso.getIdPermisos() + " " + e.getMessage());
			return false;
		}

	}

	/**
	 * <p>Método DELETE para ELIMINAR. Recibe el ID desde el cliente y lo 
	 * envía a DAO. La url por DELETE sería /Remisiones/seguridad/permisos/ID_Pemiso</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param int id_permiso
	 * @return boolean true si se eliminó con éxito, en otro caso devuelve false
	 */

	@RequestMapping(value = "/{id_permiso}", method = RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean eliminaPermiso(@PathVariable int id_permiso) {
		try {
			objPermisoDao.eliminaPermiso(id_permiso);
			log.info("ROL ELIMINADO con éxto: ID " + id_permiso);
			return true;
		} catch (Exception e) {
			log.error("Al ELIMINAR en la tabla seg_permiso "+ e.getMessage());
			return false;
		}

	}

	/**
	 * <p>Método GET para CONSULTAR TODOS. Se envía los datos al cliente en un objeto 
	 * JSON, luego de recibirlos desde el DAO como un objeto Permiso. 
	 * La url por GET sería /Remisiones/seguridad/permisos</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * @return List<Permiso> Lista de permisos en caso contrario retona null
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Permiso> listaRol() {
		try {
			log.info("Consulta ROL con éxito");
			return objPermisoDao.listaPermisos();
		} catch (Exception e) {
			log.error("Al consultar tabla seg_permiso " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * <p>Método GET para CONSULTAR 1 registro, recibe el ID desde el cliente y lo 
	 * envía al DAO. La url por GET sería /Remisiones/seguridad/permisos/ID_Pemiso</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * @return List<Permiso> Lista de permisos en caso contrario retona null
	 */
	
	@RequestMapping(value = "/{id_permiso}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Permiso> eliminaPermisos(@PathVariable int id_permiso) {
		try {
			log.info("Consulta PERMISO con éxito ID " + id_permiso);
			return objPermisoDao.consultaPermisoId(id_permiso);
		} catch (Exception e) {
			log.error("Al consultar tabla seg_permiso " + e.getMessage());
			return null;
		}
	}
}
