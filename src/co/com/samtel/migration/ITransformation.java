package co.com.samtel.migration;

import java.util.Calendar;
import java.util.Date;

import javax.ejb.Local;

@Local
public interface ITransformation<T,U> {
	
	public default Date transformDate(Integer date) {
		if(date != null) {
			String fechaStr = date.toString();
			if(fechaStr.length() == 8 || fechaStr.length() == 7 ) {
				if (fechaStr.length() == 7 ) {
					fechaStr = "0".concat(fechaStr);
				}
				
				String dia = fechaStr.substring(0, 2);
				String mes = fechaStr.substring(2, 4);
				String anio = fechaStr.substring(4, 8);
				
				Calendar myCal = Calendar.getInstance();
				myCal.set(Calendar.YEAR, Integer.valueOf(anio));
				myCal.set(Calendar.MONTH,Integer.valueOf(mes) );
				myCal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(dia));
				
				return myCal.getTime();
			}
		}
		return null;
	}
	/**
	 * Metodo con el cual genero todo tipo de transformaciones previas a la insercion de informaci�n
	 * @param origen
	 * @param destino
	 * @return
	 */
	U generateTransformation(T origen, U destino);
	
}