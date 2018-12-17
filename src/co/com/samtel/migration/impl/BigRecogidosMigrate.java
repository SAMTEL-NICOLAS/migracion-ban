package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IBigRecogidosAsDao;
import co.com.samtel.dao.IBigRecogidosDao;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.migration.IGenerateMigration;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Stateless(name = "bigRecorridosMigrate")
public class BigRecogidosMigrate extends MigrateAbs<BigRecogidosAs, BigRecogidos> implements IGenerateMigration {
	
	@EJB(beanName="bigRecogidosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigRecogidosDao")
	IGenericDao destino;

	@Override
	public List<BigRecogidos> mappearOrigen(List<BigRecogidosAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		BigRecogidos [] listaDestino = 	modelMapper.map(origen, BigRecogidos[].class);
		return Arrays.asList(listaDestino);
	}

}
