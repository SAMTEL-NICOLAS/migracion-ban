package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigCanalesAs;
import co.com.samtel.entity.sql.BigCanales;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigCanalesMigrate")
public class BigCanalesMigrate extends MigrateAbs<BigCanalesAs, BigCanales>
		implements IGenerateMigration, ITransformation {

	@EJB(beanName = "bigCanalesAsDao")
	IGenericDao origen;

	@EJB(beanName = "bigCanalesDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" nui ASC, cod_canal ASC, cod_tip_tr ASC,cod_subpro ASC");
		setTableToMigrate(TableMigration.BIG_CANALES);
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
	public List<BigCanales> mappearOrigen(List<BigCanalesAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		// Mapeo
		for (BigCanalesAs item : origen) {
			item.setFecha_cort(transformDate(item.getFecha_cortAux()));
		}
		BigCanales[] listaDestino = modelMapper.map(origen, BigCanales[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigCanalesAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigCanalesAs.class;
	}

	@Override
	public BigCanales mappearOrigen(BigCanalesAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}

}
