package co.com.samtel.cargue.service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.service.IExecutePersistTable;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigCalificacionCarteraClienteCsv;
import co.com.samtel.entity.manual.csv.BigDesendeudeseCsv;
import co.com.samtel.entity.manual.csv.BigGeoReferenciarProspectoCsv;
import co.com.samtel.entity.manual.csv.BigIndicadoresCsv;
import co.com.samtel.entity.manual.csv.BigInfoFinancieraCsv;
import co.com.samtel.entity.manual.csv.BigMetasFuerzaComercialCsv;
import co.com.samtel.entity.manual.csv.BigMetasOficinaCsv;
import co.com.samtel.entity.manual.csv.BigPropectosCsv;

@Stateless(name = "executePersistTable")
public class ExecutePersistTable implements IExecutePersistTable {

	@EJB(beanName = "bigDesendeudeseMapper")
	private IStrategyMapper<BigDesendeudeseCsv> strategyMapperBigDesendeudese;

	@EJB(beanName = "bigCalificacionCarteraClienteMapper")
	private IStrategyMapper<BigCalificacionCarteraClienteCsv> strategyMapperBigCalificacionCarteraCliente;

	@EJB(beanName = "bigIndicadoresMapper")
	private IStrategyMapper<BigIndicadoresCsv> strategyMapperBigIndicadores;

	@EJB(beanName = "bigProspectosMapper")
	private IStrategyMapper<BigPropectosCsv> strategyMapperBigProspectos;

	@EJB(beanName = "bigMetasFCMapper")
	private IStrategyMapper<BigMetasFuerzaComercialCsv> strategyMapperBigMetasFuerzaComercial;

	@EJB(beanName = "bigMetasOficinaMapper")
	private IStrategyMapper<BigMetasOficinaCsv> strategyMapperBigMetasOficina;

	@EJB(beanName = "bigInfoFinancieraMapper")
	private IStrategyMapper<BigInfoFinancieraCsv> strategyMapperBigInfoFinanciera;

	@EJB(beanName = "bigGeorreferenciarProspectoMapper")
	private IStrategyMapper<BigGeoReferenciarProspectoCsv> strategyMapperBigGeoreferenciarProspecto;

	@Override
	public Boolean executeProcess(String url, TypeFile typeFile, String delimiter) throws MapperException {
		Boolean respuesta = Boolean.TRUE;

		strategyMapperBigMetasOficina.setUrl(url);
		respuesta = strategyMapperBigMetasOficina.executeUpload(delimiter);

		System.out.println(respuesta);
		return respuesta;
	}

}
