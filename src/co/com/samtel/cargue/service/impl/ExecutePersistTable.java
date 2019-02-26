package co.com.samtel.cargue.service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.exception.UploadMapperExpetion;
import co.com.samtel.cargue.service.IExecutePersistTable;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigCalificacionCarteraClienteCsv;
import co.com.samtel.entity.manual.csv.BigCifinBureauCsv;
import co.com.samtel.entity.manual.csv.BigDesendeudeseCsv;
import co.com.samtel.entity.manual.csv.BigGeneraIcsCsv;
import co.com.samtel.entity.manual.csv.BigGeoReferenciarProspectoCsv;
import co.com.samtel.entity.manual.csv.BigIndicadoresCsv;
import co.com.samtel.entity.manual.csv.BigInfFinancieraCsv;
import co.com.samtel.entity.manual.csv.BigMetasFuerzaComercialCsv;
import co.com.samtel.entity.manual.csv.BigMetasOficinaCsv;
import co.com.samtel.entity.manual.csv.BigProductosCsv;
import co.com.samtel.entity.manual.csv.BigPropectosCsv;
import co.com.samtel.entity.manual.csv.BigSegurosCsv;

@Stateless(name = "executePersistTable")
public class ExecutePersistTable implements IExecutePersistTable {

	@EJB(beanName = "bigCalificacionCarteraClienteMapper")
	private IStrategyMapper<BigCalificacionCarteraClienteCsv> strategyMapperBigCalificacionCarteraCliente;

	@EJB(beanName = "bigDesendeudeseMapper")
	private IStrategyMapper<BigDesendeudeseCsv> strategyMapperBigDesendeudese;

	@EJB(beanName = "bigGeorreferenciarProspectoMapper")
	private IStrategyMapper<BigGeoReferenciarProspectoCsv> strategyMapperBigGeoreferenciarProspecto;
	
	@EJB(beanName = "bigMetasFCMapper")
	private IStrategyMapper<BigMetasFuerzaComercialCsv> strategyMapperBigMetasFuerzaComercial;

	@EJB(beanName = "bigMetasOficinaMapper")
	private IStrategyMapper<BigMetasOficinaCsv> strategyMapperBigMetasOficina;

	@EJB(beanName = "bigIndicadoresMapper")
	private IStrategyMapper<BigIndicadoresCsv> strategyMapperBigIndicadores;

	@EJB(beanName = "bigProspectosMapper")
	private IStrategyMapper<BigPropectosCsv> strategyMapperBigProspectos;
	
	@EJB(beanName = "bigCifinBureauMapper")
	private IStrategyMapper<BigCifinBureauCsv> strategyMapperBigCifinBureau;
	
	@EJB(beanName = "bigProductosMapper")
	private IStrategyMapper<BigProductosCsv> strategyMapperBigProductos;	
	
	@EJB(beanName = "bigSegurosMapper")
	private IStrategyMapper<BigSegurosCsv> strategyMapperBigSeguros;
	
	@EJB(beanName = "bigGeneraIcsMapper")
	private IStrategyMapper<BigGeneraIcsCsv> strategyMapperBigGeneraIcs;
	
	@EJB(beanName = "bigInfFinancieraMapper")
	private IStrategyMapper<BigInfFinancieraCsv> strategyMapperBigInfFinanciera;

	@Override
	public Boolean executeProcess(String url, TypeFile typeFile, String delimiter, String nameFile, Integer row)
			throws MapperException, UploadMapperExpetion {
		Boolean respuesta = process(nameFile, url, delimiter, row);
		System.out.println(respuesta);
		
		return respuesta;
	}

	/**
	 * Metodo que se encarga de seleccionar que proceso se debe realizar segun el
	 * nombre del archivo cargado.
	 * 
	 * @param nameFile
	 * @return
	 * @throws MapperException
	 * @throws UploadMapperExpetion
	 */
	public Boolean process(String nameFile, String url, String delimiter, Integer row)
			throws MapperException, UploadMapperExpetion {
		Boolean respuesta = Boolean.TRUE;
		switch (nameFile) {
		case "BIG_CALIFICACION_CARTERA_CLIENTE":
			strategyMapperBigCalificacionCarteraCliente.setUrl(url);
			strategyMapperBigCalificacionCarteraCliente.setRow(row);
			respuesta = strategyMapperBigCalificacionCarteraCliente.executeUpload(delimiter);
			break;
		case "BIG_DESENDEUDESE":
			strategyMapperBigDesendeudese.setUrl(url);
			strategyMapperBigDesendeudese.setRow(row);
			respuesta = strategyMapperBigDesendeudese.executeUpload(delimiter);
			break;
		case "BIG_GEOREFERENCIAR_PROSPECTO":
			strategyMapperBigGeoreferenciarProspecto.setUrl(url);
			strategyMapperBigGeoreferenciarProspecto.setRow(row);
			respuesta = strategyMapperBigGeoreferenciarProspecto.executeUpload(delimiter);
			break;
		case "BIG_METAS_FC":
			strategyMapperBigMetasFuerzaComercial.setUrl(url);
			strategyMapperBigMetasFuerzaComercial.setRow(row);
			respuesta = strategyMapperBigMetasFuerzaComercial.executeUpload(delimiter);
			break;
		case "BIG_METAS_OFICINA":
			strategyMapperBigMetasOficina.setUrl(url);
			strategyMapperBigMetasOficina.setRow(row);
			respuesta = strategyMapperBigMetasOficina.executeUpload(delimiter);
			break;
		case "BIG_INDICADORES":
			strategyMapperBigIndicadores.setUrl(url);
			strategyMapperBigIndicadores.setRow(row);
			respuesta = strategyMapperBigIndicadores.executeUpload(delimiter);
			break;
		case "BIG_PROSPECTOS":
			strategyMapperBigProspectos.setUrl(url);
			strategyMapperBigProspectos.setRow(row);
			respuesta = strategyMapperBigProspectos.executeUpload(delimiter);
			break;	
		case "BIG_SEGUROS":
			strategyMapperBigSeguros.setUrl(url);
			strategyMapperBigSeguros.setRow(row);
			respuesta = strategyMapperBigSeguros.executeUpload(delimiter);
			break;	
		case "BIG_PRODUCTOS":
			strategyMapperBigProductos.setUrl(url);
			strategyMapperBigProductos.setRow(row);
			respuesta = strategyMapperBigProductos.executeUpload(delimiter);
			break;	
		case "BIG_GENERA_ICS":
			strategyMapperBigGeneraIcs.setUrl(url);
			strategyMapperBigGeneraIcs.setRow(row);
			respuesta = strategyMapperBigGeneraIcs.executeUpload(delimiter);
			break;
		case "BIG_INF_FINANCIERA":
			strategyMapperBigInfFinanciera.setUrl(url);
			strategyMapperBigInfFinanciera.setRow(row);
			respuesta = strategyMapperBigInfFinanciera.executeUpload(delimiter);
			break;	
		case "BIG_CIFIN_BUREAU":
			strategyMapperBigCifinBureau.setUrl(url);
			strategyMapperBigCifinBureau.setRow(row);
			respuesta = strategyMapperBigCifinBureau.executeUpload(delimiter);
		default:
			break;
		}

		return respuesta;
	}

}
