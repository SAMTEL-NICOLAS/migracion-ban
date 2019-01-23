package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigClientesAs;
import co.com.samtel.entity.sql.BigClientes;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;
@Stateless(name = "bigClientesMigrate")
public class BigClientesMigrate extends MigrateAbs< BigClientesAs,  BigClientes> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigClientesAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigClientesDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey("nui ASC");
		setTableToMigrate(TableMigration.BIG_CLIENTES);
	}

	@Override
	public IGenericDao getOrigen() {	
		return origen;
	}

	@Override
	public void setOrigen(IGenericDao origen) {
		this.origen = origen;			
	}

	@Override
	public IGenericDao getDestino() {		
		return destino;
	}

	@Override
	public void setDestino(IGenericDao destino) {
		this.destino = destino;				
	}

	@Override
	public List<BigClientes> mappearOrigen(List<BigClientesAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();		
		for(BigClientesAs item : origen ) {
			item.setFechaexdoc(transformDate(item.getFechaexdocAux()));
			item.setFechcrecli(transformDate(item.getFechcrecliAux()));
			item.setFechconsem(transformDate(item.getFechconsemAux()));
			item.setFechanacim(transformDate(item.getFechanacimAux()));
			item.setFechaultac(transformDate(item.getFechaultacAux()));
		}
		BigClientes [] listaDestino = 	modelMapper.map(origen, BigClientes[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigClientesAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigClientesAs.class;
	}
}
