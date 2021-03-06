package co.com.samtel.migration.impl.facade;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigClienteEstadosAs;
import co.com.samtel.entity.sql.BigClienteEstados;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;
import co.com.samtel.migration.impl.MigrateAbs;

@Stateless(name = "facadeClientesEstado")
public class BigClientesEstadoFacade extends MigrateAbs<BigClienteEstadosAs, BigClienteEstados> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName = "bigClienteEstadosMigrateHiloUno")
	IGenerateMigration bigClienteEstadosMigrateUno;
	
	@EJB(beanName = "bigClienteEstadosMigrateHiloDos")
	IGenerateMigration bigClienteEstadosMigrateDos;
	
	@EJB(beanName = "bigClienteEstadosMigrateHiloTres")
	IGenerateMigration bigClienteEstadosMigrateTres;
	
	@EJB(beanName = "bigClienteEstadosMigrateHiloCuatro")
	IGenerateMigration bigClienteEstadosMigrateCuatro;
	
	@PostConstruct
	public void init() {
		setTableToMigrate(TableMigration.BIG_CLIENTE_ESTADOS);
	}
	
	@Override
	public Boolean generateMigration() {
		try {
			
			//Seteamos los ordenamientos
			bigClienteEstadosMigrateUno.setTypeOrder("ASC");
			bigClienteEstadosMigrateDos.setTypeOrder("DESC");
			
			bigClienteEstadosMigrateUno.setLogActivador(getLogActivador());
			bigClienteEstadosMigrateUno.numRecordsSourceAndDestination();
			//Calculo para cada hilo
			Long reg = bigClienteEstadosMigrateUno.getRegistrosOrigen();
			reg = reg / 4;
			
			
			bigClienteEstadosMigrateUno.setNumRecBlock( getNumRecBlock() );
			bigClienteEstadosMigrateUno.setIniProcess(Long.valueOf("0"));
			bigClienteEstadosMigrateUno.setDeleteRecords(getDeleteRecords());
			bigClienteEstadosMigrateUno.validateData("Y");
			
			bigClienteEstadosMigrateDos.setLogActivador(getLogActivador());
			bigClienteEstadosMigrateDos.numRecordsSourceAndDestination();
			bigClienteEstadosMigrateDos.setNumRecBlock( getNumRecBlock() );
			bigClienteEstadosMigrateDos.setIniProcess(reg);
			
			bigClienteEstadosMigrateTres.setLogActivador(getLogActivador());
			bigClienteEstadosMigrateTres.numRecordsSourceAndDestination();
			bigClienteEstadosMigrateTres.setNumRecBlock( getNumRecBlock() );
			bigClienteEstadosMigrateTres.setIniProcess(reg * 2);
			
			
			bigClienteEstadosMigrateCuatro.setLogActivador(getLogActivador());
			bigClienteEstadosMigrateCuatro.numRecordsSourceAndDestination();
			bigClienteEstadosMigrateCuatro.setNumRecBlock( getNumRecBlock() );
			bigClienteEstadosMigrateCuatro.setIniProcess(reg * 3);
			
			
			//Ejecutamos las migraciones
			bigClienteEstadosMigrateUno.ejecutarHilo();
			bigClienteEstadosMigrateDos.ejecutarHilo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Boolean.TRUE;
	}

	@Override
	public IGenericDao getOrigen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOrigen(IGenericDao origen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IGenericDao getDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDestino(IGenericDao destino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BigClienteEstados> mappearOrigen(List<BigClienteEstadosAs> origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigClienteEstados mappearOrigen(BigClienteEstadosAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<BigClienteEstadosAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void numRecordsSourceAndDestination() {
		System.out.println("Prueba");
	}
	


}
