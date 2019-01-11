package co.com.samtel.migration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

import co.com.samtel.dao.bussines.ILogActivadorDao;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IGenerateMigration;

@Stateless(name = "factoryMigration")
public class FactoryMigration implements IFactoryMigration {

	// Objeto para la consulta de tablas listas para migrar
	@Inject
	ILogActivadorDao logActivadorDao;

	List<LogActivador> tablesToMigrate;

	private TypeMigration typeMigration;

	@EJB(beanName = "bigRecorridosMigrate")
	IGenerateMigration bigRecorridosMigrate;

	@EJB(beanName = "bigRecuperaCarteraCastigadaMigrate")
	IGenerateMigration bigRecuperaCarteraCastigadaMigrate;

	/*
	 * @EJB(beanName="bigClienteProductoMigrate") IGenerateMigration
	 * bigClienteProductoMigrate;
	 */

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
//	
//	@EJB(beanName="bigActivosMigrate")
//	IGenerateMigration bigActivosMigrate;

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
	
	@EJB(beanName = "bigParametrosConsolidadosMigrate")
	IGenerateMigration bigParametrosConsolidadosMigrate;
	
	@EJB(beanName = "bigPasivosCdtMigrate")
	IGenerateMigration bigPasivosCdtMigrate;
	
	@EJB(beanName = "bigPasivosAhMigrate")
	IGenerateMigration bigPasivosAhMigrate;
	
	@EJB(beanName = "bigPasivosConsolidadoMigrate")
	IGenerateMigration bigPasivosConsolidadoMigrate;
	
	@Override
	public IFactoryMigration setMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration;
		return this;
	}

	@Override
	public List<IGenerateMigration> build() {
		List<IGenerateMigration> listEjb = new ArrayList<>();
		findTableActive();
		if (getTablesToMigrate() != null) {
			for (LogActivador item : getTablesToMigrate()) {
				if (item.getNombreTabla() != null) {
					IGenerateMigration aux = findEjb(item);
					if (aux != null) {
						aux.setLogActivador(item);
						listEjb.add(aux);
						
					}	
				}
			}
		}

		// listEjb.add(bigRecorridosMigrate);
		// listEjb.add(bigRecuperaCarteraCastigadaMigrate);
		// listEjb.add(bigClienteProductoMigrate);
		// listEjb.add(bigActividadEconomicaInternaMigrate);
		// listEjb.add(bigCiudadesMigrate);
		// listEjb.add(bigActivosMigrate);
		// listEjb.add(bigTipoIdentClientesMigrate);
		// listEjb.add(bigCodigosAbogadoMigrate);
		// listEjb.add(bigTipoTransaccionMigrate);
		// listEjb.add(bigBarriosMigrate);
		// listEjb.add(bigEstadoCarpetasMigrate);
		// listEjb.add(bigSubproductosMigrate);
		// listEjb.add(bigSubsegmentoClienteMigrate);
		// listEjb.add(bigOficinaMigrate);
		// listEjb.add(bigActivoConsolidadoMigrate);
		// listEjb.add(bigCupoRotativoMigrate);
		// listEjb.add(bigClientesMigrate);
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
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_RECOGIDOS.getNameAs())) {
//			return bigRecorridosMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_RECUPERA_CARTERA_CASTIGADA.getNameAs())) {
//			return bigRecuperaCarteraCastigadaMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_ACTIVIDAD_ECONOMICA_INTERNA.getNameAs())) {
//			return bigActividadEconomicaInternaMigrate;
//		} 
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_CIUDADES.getNameAs())) {
//			return bigCiudadesMigrate;
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
//		return bigLocalidadMigrate;
//	}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_PASIVOS_CDT.getNameAs())) {
//			return bigPasivosCdtMigrate;
////		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_PASIVOS_AH.getNameAs())) {
//			return bigPasivosAhMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_PARAMETROS_CONSOLIDADOS.getNameAs())) {
//			return bigParametrosConsolidadosMigrate;
//		}
//		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_TIPO_TRANSACCION.getNameAs())) {
//		return bigTipoTransaccionMigrate;
//	}
		if (item.getNombreTabla().trim().equalsIgnoreCase(TableMigration.BIG_PASIVOS_CONSOLIDADO.getNameAs())) {
			return bigParametrosConsolidadosMigrate;
		}
		
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

}
