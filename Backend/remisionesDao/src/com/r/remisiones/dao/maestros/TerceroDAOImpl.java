package com.r.remisiones.dao.maestros;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.remisiones.dominio.maestros.Tercero;
import com.remisiones.dominio.seguridad.Rol;

/**
 * <b><p>Capa DAO de conexión a la fuente de datos <p></b> 
 * Esta clase transa con la base de datos en la tabla seg_tercero toda la información 
 * de tercero. Entrega la información al cotrollador {@link com.remisiones.rest.seguridad.TerceroController}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 19/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */
@Repository
public class TerceroDAOImpl implements ITerceroDAO{

	private JdbcTemplate jdbcTemplate;

	/**
	 * Constructor para inicializar el JdbcTemplate, que a su vez se conecta 
	 * dataSource, el cual esta configurado en el archivo XML de BEANS
	 * @param jdbcTemplate
	 */
	public TerceroDAOImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Método para grabar o registrar Tercero en la base de datos.
	 * 
	 * @param tercero objeto tipo Tercero
	 * @return boolean true si se creó con éxito, en otro caso devuelve el error
	 * @throws Exception retorna el error
	 */
	@Override
	public boolean grabarTercero(Tercero tercero) throws Exception{
		String sql = "INSERT INTO maestro_tercero (ter_nombre, ter_celular, "
				+ "ter_correo, ter_cedula) VALUES(?,?,?,?);";
		try {
			jdbcTemplate.update(sql, tercero.getNombre(), tercero.getCelular(), 
					tercero.getCorreo(), tercero.getCedula());
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public boolean actualizaTercero(Tercero tercero) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaTercero(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Tercero> ListaTerceros() throws Exception {
		String sql = "SELECT id_tercero, ter_nombre nombre, ter_celular celular, "
				+ "ter_correo correo, ter_cedula cedula, ter_creado creado, "
				+ "ter_update actualizado, ter_activo activo FROM maestro_tercero "
				+ "WHERE ter_activo = 1";
		try {
			return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Tercero.class));
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Tercero> consultaTerceroId(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}




}
