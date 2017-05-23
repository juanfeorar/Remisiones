package com.r.remisiones.dao.seguridad;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.remisiones.dominio.seguridad.Rol;

/**
 * <b><p>Capa DAO de conexión a la fuente de datos <p></b> 
 * Esta clase transa con la base de datos en la tabla seg_rol toda la información 
 * del Rol de usuario. Entrega la ifnormación al cotrollador {@link com.remisiones.rest.seguridad.RolController}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 01/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */
@Repository
public class RolDaoImpl implements IRolDao{

	private JdbcTemplate jdbcTemplate;


	/**
	 * Constructor para inicializar el JdbcTemplate, que a su vez se conecta 
	 * dataSource, el cual esta configurado en el archivo XML de BEANS
	 * @param jdbcTemplate
	 */
	public RolDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}


	/**
	 * Método para grabar o registrar Rol en la base de datos.
	 * 
	 * @param rol objeto tipo Rol
	 * @return boolean true si se creó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean grabarRol(Rol rol) throws Exception {
		String sql =  "INSERT INTO seg_rol(nombre_rol, descripcion_rol) "
				+ "VALUES(?,?);";
		try {
			jdbcTemplate.update(sql,rol.getNombreRol(),rol.getDescripcionRol());
			return true;
		}catch (Exception e){
			throw e;
		}
	}

	/**
	 * Método para actualizar un registro Rol en la base de datos.
	 * 
	 * @param rol objeto tipo Rol
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean actualizaRol(Rol rol) throws Exception {
		String sql = "UPDATE seg_rol SET nombre_rol=?, descripcion_rol=? WHERE id_rol=?;";
		try {
			jdbcTemplate.update(sql,rol.getNombreRol(), rol.getDescripcionRol(),rol.getId_rol());
			return true;
		}catch (Exception e){
			throw e;
		}
	}


	/**
	 * Método para eliminar un registro Rol en la base de datos.
	 * 
	 * @param int id del Rol
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean eliminaRol(int id) throws Exception {
		String sql = "UPDATE seg_rol SET activo=0 WHERE id_rol="+id;
		try {
			jdbcTemplate.update(sql);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Método para consultar todos los registros Rol en la base de datos.
	 * 
	 * @param rol objeto tipo Rol
	 * @return List<Rol> Lista de Roles en caso contrario retona error
	 * @throws Exception retorna el error
	 */
	@Override
	public List<Rol> ListaRols() throws Exception {
		String sql =  "SELECT id_rol,nombre_rol,descripcion_rol, creado, actualizado, "
				+ "activo FROM seg_rol WHERE activo = 1;";
		try {
			return  jdbcTemplate.query(sql,new BeanPropertyRowMapper(Rol.class));
		} catch (Exception e) {
			throw e;
		}

	}

	/**
	 * Método para consultar un solo registro Rol por ID en la base de datos.
	 * 
	 * @param int id del Rol
	 * @return List<Rol> el Roles en caso contrario retona error
	 * @throws Exception retorna el error
	 */
	@Override
	public List<Rol> consultaRolId(int id) throws Exception {
		String sql =  "SELECT id_rol,nombre_rol,descripcion_rol, creado AS creado, "
				+ "actualizado, activo FROM seg_rol WHERE activo = 1 AND "
				+ "id_rol = "+id;
		try {
			return  jdbcTemplate.query(sql,new BeanPropertyRowMapper(Rol.class));
		} catch (Exception e) {
			throw e;
		}
	}

}
