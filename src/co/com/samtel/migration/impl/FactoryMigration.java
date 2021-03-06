package co.com.samtel.migration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import co.com.samtel.dao.bussines.ILogActivadorDao;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.service.IParametrosService;

@Stateless(name = "factoryMigration")
public class FactoryMigration implements IFactoryMigration {

	// Objeto para la consulta de tablas listas para migrar
	@EJB(beanName = "logActivadorDao")
	ILogActivadorDao logActivadorDao;

	List<LogActivador> tablesToMigrate;

	private TypeMigration typeMigration;

	@EJB(beanName = "bigRecorridosMigrate")
	IGenerateMigration bigRecorridosMigrate;

	@EJB(beanName = "bigRecuperaCarteraCastigadaMigrate")
	IGenerateMigration bigRecuperaCarteraCastigadaMigrate;

	@EJB(beanName = "bigClienteProductoMigrate")
	IGenerateMigration bigClienteProductoMigrate;

	@EJB(beanName = "bigActividadEconomicaInternaMigrate")
	IGenerateMigration bigActividadEconomicaInternaMigrate;

	@EJB(beanName = "bigCiudadesMigrate")
	IGenerateMigration bigCiudadesMigrate;

	@EJB(beanName = "bigTipoIdentClientesMigrate")
	IGenerateMigration bigTipoIdentClientesMigrate;

	@EJB(beanName = "bigCodigosAbogadoMigrate")
	IGenerateMigration bigCodigosAbogadoMigrate;

	@EJB(beanName = "bigTipoTransaccionMigrate")
	IGenerateMigration bigTipoTransaccionMigrate;

	@EJB(beanName = "bigBarriosMigrate")
	IGenerateMigration bigBarriosMigrate;

	@EJB(beanName = "bigEstadoCarpetasMigrate")
	IGenerateMigration bigEstadoCarpetasMigrate;

	@EJB(beanName = "bigActivosMigrate")
	IGenerateMigration bigActivosMigrate;

	@EJB(beanName = "bigSubproductosMigrate")
	IGenerateMigration bigSubproductosMigrate;

	@EJB(beanName = "bigSubsegmentoClienteMigrate")
	IGenerateMigration bigSubsegmentoClienteMigrate;

	@EJB(beanName = "bigOficinaMigrate")
	IGenerateMigration bigOficinaMigrate;

	@EJB(beanName = "bigActivoConsolidadoMigrate")
	IGenerateMigration bigActivoConsolidadoMigrate;

	@EJB(beanName = "bigCupoRotativoMigrate")
	IGenerateMigration bigCupoRotativoMigrate;

	@EJB(beanName = "bigClientesMigrate")
	IGenerateMigration bigClientesMigrate;

	@EJB(beanName = "bigDireccionMigrate")
	IGenerateMigration bigDireccionMigrate;

	@EJB(beanName = "bigCredipremiumMigrate")
	IGenerateMigration bigCredipremiumMigrate;

	@EJB(beanName = "bigLocalidadMigrate")
	IGenerateMigration bigLocalidadMigrate;

	@EJB(beanName = "bigEstGeneralListaMigrate")
	IGenerateMigration bigEstGeneralListaMigrate;

	@EJB(beanName = "bigPasivosCdtMigrate")
	IGenerateMigration bigPasivosCdtMigrate;

	@EJB(beanName = "bigPasivosAhMigrate")
	IGenerateMigration bigPasivosAhMigrate;

	@EJB(beanName = "bigPasivosConsolidadoMigrate")
	IGenerateMigration bigPasivosConsolidadoMigrate;

	@EJB(beanName = "bigActualizaDatosMigrate")
	IGenerateMigration bigActualizaDatosMigrate;

	@EJB(beanName = "facadeClientesEstado")
	IGenerateMigration bigClienteEstadosMigrate;

	@EJB(beanName = "bigNotaInternaMigrate")
	IGenerateMigration bigNotaInternaMigrate;

	@EJB(beanName = "bigInfoAdicionalClientesMigrate")
	IGenerateMigration bigInfoAdicionalClientesMigrate;

	@EJB(beanName = "bigConsCentralesMigrate")
	IGenerateMigration bigConsCentralesMigrate;

	@EJB(beanName = "bigEjecutivoMigrate")
	IGenerateMigration bigEjecutivoMigrate;

	@EJB(beanName = "bigRangoMoraMigrate")
	IGenerateMigration bigRangoMoraMigrate;

	@EJB(beanName = "bigCalificacionCarteraMigrate")
	IGenerateMigration bigCalificacionCarteraMigrate;

	@EJB(beanName = "bigCanalesMigrate")
	IGenerateMigration bigCanalesMigrate;

	@EJB
	IParametrosService parametrosService;

	private Long numeroRegistros;

	@PostConstruct
	public void init() {
		setNumeroRegistros(parametrosService.getNumRecordsToProcess());
	}

	@Override
	public IFactoryMigration setMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration;
		return this;
	}

	/**
	 * Metodo con el cual construyo la lista de ejbs con la cual el proceso iniciara
	 * a crear el proceso
	 */
	@Override
	public List<IGenerateMigration> build() {
		List<IGenerateMigration> listEjb = new ArrayList<>();
		findTableActive();
		if (getTablesToMigrate() != null) {
			for (LogActivador item : getTablesToMigrate()) {
				if (item.getNombreTabla() != null) {
					IGenerateMigration aux = findEjb(item);
					if (aux != null) {
						// Seteo el log de as400 que me indica que la tabla debe ser migrada
						aux.setLogActivador(item);
						aux.numRecordsSourceAndDestination();
						aux.setNumRecBlock(numeroRegistros);
						aux.setTypeOrder("ASC");
						aux.setDeleteRecords("Y");
						try {
							aux.validateData("Y");
						} catch (ControlledExeption e) {
							System.err.println(".:: Validacion incorrecta con la tabla " + aux.getTableToMigrate().getNameSql() + "::.");
						}
						listEjb.add(aux);
					}
				}
			}
		}

		listEjb.stream().parallel().forEach(item -> System.out.println(item.getRegistrosOrigen()));

		return listEjb;
	}

	/**
	 * Encuentro las tablas que se deben migrar
	 */
	public void findTableActive() {
		setTablesToMigrate(logActivadorDao.findLogActive());
	}

	/**
	 * Metodo con el cual encuentro el EJB que corresponde a la su tabla
	 * 
	 * @param item
	 * @return
	 */
	public IGenerateMigration findEjb(LogActivador item) {
		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CIUDADES.getNameAs())) {
			return bigCiudadesMigrate;
		}		

//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_RECOGIDOS.getNameAs())) {
//			return bigRecorridosMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_RECUPERA_CARTERA_CASTIGADA.getNameAs())) {
//			return bigRecuperaCarteraCastigadaMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_ACTIVIDAD_ECONOMICA_INTERNA.getNameAs())) {
//			return bigActividadEconomicaInternaMigrate;
//		} 
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_TIPO_IDENT_CLIENTES.getNameAs())) {
//			return bigTipoIdentClientesMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CODIGOS_ABOGADO.getNameAs())) {
//			return bigCodigosAbogadoMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_ESTADOS_CARPETAS.getNameAs())) {
//			return bigEstadoCarpetasMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_SUBSEGMENTO_CLIENTE.getNameAs())) {
//			return bigSubsegmentoClienteMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_SUBPRODUCTOS.getNameAs())) {
//			return bigSubproductosMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_OFICINA.getNameAs())) {
//			return bigOficinaMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_ACTIVO_CONSOLIDADO.getNameAs())) {
//			return bigActivoConsolidadoMigrate;
//		}		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CUPO_ROTATIVO.getNameAs())) {
//			return bigCupoRotativoMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CLIENTES.getNameAs())) {
//			return bigClientesMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_LOCALIDAD.getNameAs())) {
//			return bigLocalidadMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_PASIVOS_CDT.getNameAs())) {
//			return bigPasivosCdtMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_PASIVOS_AH.getNameAs())) {
//			return bigPasivosAhMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_EST_GENERAL_LISTA.getNameAs())) {
//			return bigEstGeneralListaMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_TIPO_TRANSACCION.getNameAs())) {
//			return bigTipoTransaccionMigrate;
//		}

		
		
		
		
		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CLIENTE_ESTADOS.getNameAs())) {
//			return bigClienteEstadosMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_PASIVOS_CONSOLIDADO.getNameAs())) {
//			return bigPasivosConsolidadoMigrate;
//		}

		
		
		
		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_BARRIOS.getNameAs())) {
//			return bigBarriosMigrate;
//		}		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_DIRECCION.getNameAs())) {
//			return bigDireccionMigrate;
//		}		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_ACTIVOS.getNameAs())) {
//			return bigActivosMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_NOTA_INTERNA.getNameAs())) {
//			return bigNotaInternaMigrate;
//		}		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_INFO_ADICIONAL_CLIENTE.getNameAs())) {
//			return bigInfoAdicionalClientesMigrate;
//		}		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_ACTUALIZA_DATOS.getNameAs())) {
//			return bigActualizaDatosMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CONS_CENTRALES.getNameAs())) {
//			return bigConsCentralesMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_EJECUTIVO.getNameAs())) {
//			return bigEjecutivoMigrate;
//		}	
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_RANGO_MORA.getNameAs())) {
//			return bigRangoMoraMigrate;
//		}	
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CALIFICACION_CARTERA.getNameAs())) {
//			return bigCalificacionCarteraMigrate;
//		}			
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CANALES.getNameAs())) {
//			return bigCanalesMigrate;
//		}	
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CREDIPREMIUM.getNameAs())) {
//			return bigCredipremiumMigrate;
//		}
//		
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CLIENTE_PRODUCTO.getNameAs())) {
//			return bigClienteProductoMigrate;
//		}

		return null;
	}

	public TypeMigration getTypeMigration() {
		return typeMigration;
	}

	public void setTypeMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration;
	}

	public List<LogActivador> getTablesToMigrate() {
		return tablesToMigrate;
	}

	public void setTablesToMigrate(List<LogActivador> tablesToMigrate) {
		this.tablesToMigrate = tablesToMigrate;
	}

	public Long getNumeroRegistros() {
		return numeroRegistros;
	}

	public void setNumeroRegistros(Long numeroRegistros) {
		this.numeroRegistros = numeroRegistros;
	}

}
