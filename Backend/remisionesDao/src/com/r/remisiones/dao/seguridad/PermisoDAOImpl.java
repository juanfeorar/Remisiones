package com.r.remisiones.dao.seguridad;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.remisiones.dominio.seguridad.Permiso;

/**
 * <b><p>Capa DAO de conexión a la fuente de datos <p></b> 
 * Esta clase transa con la base de datos en la tabla seg_permisos toda la información 
 * de PERMISOS. Entrega la información al cotrollador {@link com.remisiones.rest.seguridad.PermisoController}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 21/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */
@Service
public class PermisoDAOImpl implements IPermisoDAO {

	private JdbcTemplate jdbcTemplate;

	/**
	 * Constructor para inicializar el JdbcTemplate, que a su vez se conecta 
	 * dataSource, el cual esta configurado en el archivo XML de BEANS
	 * @param jdbcTemplate
	 */
	public PermisoDAOImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Método para grabar o registrar Permiso en la base de datos.
	 * 
	 * @param permiso objeto tipo Permiso
	 * @return boolean true si se creó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean grabarPermiso(Permiso permiso) throws Exception {
		String sql = "INSERT INTO seg_permisos (nombre_permiso, descripcion_permiso) VALUES (?,?);";
		try {
			jdbcTemplate.update(sql, permiso.getNombrPermisos(), permiso.getDescripcionPermisos());
			return true;
		} catch (Exception e) {
			throw e;
		}
	}


	/**
	 * Método para actualizar un registro Permiso en la base de datos.
	 * 
	 * @param permiso objeto tipo Permiso
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean actualizaPermiso(Permiso permiso) throws Exception {
		String sql = "UPDATE seg_permisos SET nombre_permiso=?, "
				+ "descripcion_permiso=? WHERE id_permisos =?;";
		try {
			jdbcTemplate.update(sql, permiso.getNombrPermisos(), 
					permiso.getDescripcionPermisos(), permiso.getIdPermisos());
			return true;
		} catch (Exception e) {
			throw e;
		}
	}


	/**
	 * Método para eliminar un registro Permiso en la base de datos.
	 * 
	 * @param int id del Permiso
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean eliminaPermiso(int id) throws Exception {
		String sql = "UPDATE seg_permisos SET activo=0 WHERE id_permisos =" +id;
		try {
			jdbcTemplate.update(sql);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}


	@Override
	public List<Permiso> listaPermisos() throws Exception {
		String sql = "SELECT id_permisos, nombre_permiso, descripcion_permiso, "
				+ "creado, actualizado, activo FROM seg_permisos WHERE activo = 1;";
		try {
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Permiso.class));
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Permiso> consultaPermisoId(int id) throws Exception {
		String sql = "SELECT id_permisos, nombre_permiso, descripcion_permiso, "
				+ "creado, actualizado, activo FROM seg_permisos "
				+ "WHERE activo = 1 AND id_permisos =" +id;
		try {
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Permiso.class));
		} catch (Exception e) {
			throw e;
		}
	}

}
