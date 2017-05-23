package com.remisiones.rest.seguridad;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.r.remisiones.dao.seguridad.UsuarioDAOImp;
import com.remisiones.dominio.seguridad.Usuario;

/**
 * <b><p>Capa SERVICIOS Rest: es la que interactua con el cliente es como la capa VISTA <p></b> 
 * Esta clase es la encargada de interactuar con el cliente para todas las 
 * transaciones de USUARIO, luego envía y recibe los datos a la capa DAO 
 * con la clase {@link com.remisiones.dao.seguridad.UsuarioDAOImp}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 17/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */

@RestController
@RequestMapping("seguridad/usuarios")
public class UsuarioController {

	@Resource
	private UsuarioDAOImp objUsuarioDao;
	private final Logger log = Logger.getLogger(UsuarioController.class);

	/**
	 * <p>Método POST para REGISTRAR que recibe los datos del cliente en un objeto 
	 * JSON y los convierte en objeto Usuario para enviarselos a DAO. 
	 * La url por POST sería /Remisiones/seguridad/usuarios</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param objUsuario objeto tipo Usuario
	 * @return boolean true si se creó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean grabarUsuario(@RequestBody Usuario objUsuario){

		try {
			objUsuarioDao.grabarUsuario(objUsuario);
			log.info("Datos en USUARIO almacenados con éxito: '" + objUsuario.getNombreUsuario() + " usuario " 
					+ objUsuario.getUsuario() + "'");
			return true;
		} catch (Exception e) {
			log.error("Al guardar en la tabla seg_usuario " 
					+ e.getMessage());
			return false;
		}
	}

	/**
	 * <p>Método PUT para ACTUALIZAR que recibe los datos del cliente en un objeto 
	 * JSON y los convierte en objeto Usuario para enviarselos a DAO. 
	 * La url por PUT sería /Remisiones/seguridad/usuarios</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param objUsuario objeto tipo Usuario
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean actualizarUsuario(@RequestBody Usuario objUsuario){

		try {
			objUsuarioDao.actualizaUsuario(objUsuario);
			log.info("Datos en USUARIO actualizados con éxito: ID'" + objUsuario.getIdUsuario());
			return true;
		} catch (Exception e) {
			log.error("Al actualizar en la tabla seg_usuario ID " + objUsuario.getIdUsuario()
			+ e.getMessage());
			return false;
		}
	}

	/**
	 * <p>Método DELETE para ELIMINAR USUARIO que recibe el ID desde el cliente y lo 
	 * envía a DAO. La url por DELETE sería /Remisiones/seguridad/usuarios/ID_usuario</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param int id_rol
	 * @return boolean true si se eliminó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(value = "/{id_user}", method = RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean eliminarUsuario(@PathVariable int id_user){

		try {
			objUsuarioDao.eliminaUsuario(id_user);
			log.info("Datos en USUARIO eliminados con éxito: ID'" + id_user);
			return true;
		} catch (Exception e) {
			log.error("Al ELIMINAR en la tabla seg_usuario ID " + id_user);
			return false;
		}
	}
	
	/**
	 * <p>Método GET para CONSULTAR TODOS que envía los datos al cliente en un objeto 
	 * JSON, luego de recibirlos desde el DAO como un objeto Usuario. 
	 * La url por GET sería /Remisiones/seguridad/usuarios</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * @return List<Usuario> Lista de Usuarios, en caso contrario retona null
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> listaUsuarios() {
		try {
			log.info("Consulta USUARIOS con éxito "+ new ResponseEntity<>("mensaje", HttpStatus.FORBIDDEN));
			return objUsuarioDao.listaUsuarios();
		} catch (Exception e) {
			log.error("Al CONSULTAR tabla seg_usuario " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * <p>Método GET para CONSULTAR 1 registro, que envía los datos al cliente en un objeto 
	 * JSON, luego de recibirlos desde el DAO como un objeto Usuario. 
	 * La url por GET sería /Remisiones/seguridad/usuarios/ID_usuario</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * @return List<Usuario> con el Usuario, en caso contrario retona null
	 */
	@RequestMapping(value = "/{id_user}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> consultaUsuarioId(@PathVariable int id_user) {
		try {
			log.info("Consulta USUARIO con éxito ID: "+id_user);
			return objUsuarioDao.consultaUsuarioId(id_user);
		} catch (Exception e) {
			log.error("Al CONSULTAR tabla seg_usuario" + e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "test")
	public String test(){
		return "Hola";
	}
}
