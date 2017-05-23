package com.remisiones.rest.maestros;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.r.remisiones.dao.maestros.TerceroDAOImpl;
import com.remisiones.dominio.maestros.Tercero;


/**
 * <b><p>Capa SERVICIOS Rest: es la que interactua con el cliente es como la capa VISTA <p></b> 
 * Esta clase es la encargada de interactuar con el cliente para todas las 
 * transaciones de TERCERO, luego envía y recibe los datos a la capa DAO 
 * con la clase {@link com.remisiones.dao.maestros.TerceroDAOImpl}
 * @author: Juan Fernando Ordóñez juanfoerar@gmail.com
 * @version: 00.1 19/05/2017/A
 * @see <a href = "http://www.masmedellin.com" /> Trasportes Medellín Castilla S.A </a>
 */
@RestController
@RequestMapping("maestros/terceros")
public class TerceroController {

	@Resource
	private TerceroDAOImpl objTerceroDao;
	private final Logger log = Logger.getLogger(TerceroController.class);

	/**
	 * <p>Método POST para REGISTRAR que recibe los datos del cliente en un objeto 
	 * JSON y los convierte en objeto Tercero para enviarselos a DAO. 
	 * La url por POST sería /Remisiones/maestros/terceros</p>
	 * Utiliza log4j para administrar los logs de éxito y error
	 * 
	 * @param objTerceroDao objeto tipo Tercero
	 * @return boolean true si se creó con éxito, en otro caso devuelve false
	 */
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean grabarTercero(@RequestBody Tercero tercero) {
		try {
			objTerceroDao.grabarTercero(tercero);
			log.info("Datos en USUARIO almacenados con éxito: '" + tercero.getNombre() + ", cédula " 
					+ tercero.getCedula() + "'");
			return true;
		} catch (Exception e) {
			log.error("Al guardar en la tabla seg_usuario " 
					+ e.getMessage());
			return false;
		}
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tercero> listaTercero(){
		try {
			log.info("Consulta ROL con éxito"+HttpStatus.INTERNAL_SERVER_ERROR);
			return objTerceroDao.ListaTerceros();
		} catch (Exception e) {
			log.error("Al consultar tabla maestro_tercero " + e.getMessage());
			return null;
		}	
	}
}
