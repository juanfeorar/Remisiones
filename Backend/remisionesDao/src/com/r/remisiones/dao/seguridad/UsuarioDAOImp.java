package com.r.remisiones.dao.seguridad;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.remisiones.dominio.seguridad.Usuario;

/**
 * <b><p>Capa DAO de conexión a la fuente de datos <p></b> 
 * Esta clase transa con la base de datos en la tabla seg_usuario toda la información 
 * de usuario. Entrega la información al cotrollador {@link com.remisiones.rest.seguridad.UsuarioController}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 17/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */
@Repository
public class UsuarioDAOImp implements IUsuarioDao{

	private JdbcTemplate jdbcTemplate;
	/**
	 * Constructor para inicializar el JdbcTemplate, que a su vez se conecta 
	 * dataSource, el cual esta configurado en el archivo XML de BEANS
	 * @param jdbcTemplate
	 */
	public UsuarioDAOImp(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Método para grabar o registrar Usuario en la base de datos.
	 * 
	 * @param usuario objeto tipo Usuario
	 * @return boolean true si se creó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean grabarUsuario(Usuario usuario) throws Exception{
		String sql = "INSERT INTO seg_usuario(usuario, nombre_usuario, cedula_usuario, "
				+ "telefono_usuario, contrasenia_usuario) VALUES (?,?,?,?,?)";
		try {
			jdbcTemplate.update(sql, usuario.getUsuario(), usuario.getNombreUsuario(), 
					usuario.getCedulaUsuario(), usuario.getTelefonoUsuario(), 
					usuario.getContraseniaUsuario());
			return true;
		} catch (Exception e) {
			throw e;
		}
	}


	/**
	 * Método para actualizar un registro Usuario en la base de datos.
	 * 
	 * @param usuario objeto tipo Usuario
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean actualizaUsuario(Usuario usuario) throws Exception{
		String sql = "UPDATE seg_usuario SET usuario=?, nombre_usuario=?, "
				+ "cedula_usuario=?, telefono_usuario=?, contrasenia_usuario=? "
				+ "WHERE id_usuario=?";
		try {
			jdbcTemplate.update(sql, usuario.getUsuario(), usuario.getNombreUsuario(), 
					usuario.getCedulaUsuario(), usuario.getTelefonoUsuario(), 
					usuario.getContraseniaUsuario(), usuario.getIdUsuario());
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Método para eliminar un registro Usuario en la base de datos.
	 * 
	 * @param int id del Usuario
	 * @return boolean true si se actualizó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean eliminaUsuario(int id) throws Exception{
		String sql = "UPDATE seg_usuario SET activo = 0 WHERE id_usuario="+id;
		try {
			jdbcTemplate.update(sql);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Método para consula todos los registros Usuario en la base de datos.
	 * 
	 * @return List<Usuario> Lista de Usuarios en caso contrario retona error
	 * @throws Exception retorna el error
	 */
	@Override
	public List<Usuario> listaUsuarios() throws Exception{
		String sql = "SELECT id_usuario, usuario, nombre_usuario, cedula_usuario, "
				+ "telefono_usuario, contrasenia_usuario, creado, actualizado, "
				+ "activo FROM seg_usuario WHERE activo = 1;";
		try {
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Usuario.class));
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Método para consula un solo registro Usuario por ID en la base de datos.
	 * 
	 * @param int id del Usuario
	 * @return List<Usuario> el Usuario en caso contrario retona error
	 * @throws Exception retorna el error
	 */
	@Override
	public List<Usuario> consultaUsuarioId(int id) throws Exception{
		String sql = "SELECT id_usuario, usuario, nombre_usuario, cedula_usuario, "
				+ "telefono_usuario, contrasenia_usuario, creado, actualizado, "
				+ "activo FROM seg_usuario WHERE activo = 1 AND id_usuario = "+id;
		try {
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Usuario.class));
		} catch (Exception e) {
			throw e;
		}
	}



}
