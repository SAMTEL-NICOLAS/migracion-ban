package co.com.samtel.migration.impl;

import javax.ejb.Stateless;

import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.migration.ITransformation;

@Stateless(name="transformationBigRecogidos")
public class TransformationBigRecogidos implements ITransformation<BigRecogidosAs,BigRecogidos> {

	@Override
	public BigRecogidos generateTransformation(BigRecogidosAs origen, BigRecogidos destino) {
		//destino.setFechaPruebaTra(transformDate(origen.getFechaPrueba()));
		return destino;
	}

	
}
