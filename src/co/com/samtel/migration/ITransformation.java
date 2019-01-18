package co.com.samtel.migration;

import java.util.Calendar;
import java.util.Date;

import javax.ejb.Local;

@Local
public interface ITransformation {
	
	public default Date transformDate(Integer date) {
		String dia = "",mes = "",anio = "";
		if(date != null) {
			String fechaStr = date.toString();			
			if(fechaStr.length() == 8 || fechaStr.length() == 7 ||fechaStr.length() == 6 ) {
				if ( fechaStr.length() == 8  ) {				
					dia = fechaStr.substring(0, 2);
					mes = fechaStr.substring(2, 4);
					anio = fechaStr.substring(4, 8);					
				}
				if ( fechaStr.length() == 7  ) {
					fechaStr = "0".concat(fechaStr);
					dia = fechaStr.substring(0, 2);
					mes = fechaStr.substring(2, 4);
					anio = fechaStr.substring(4, 8);
				}
				if ( fechaStr.length() == 6 ) {
					fechaStr = "0".concat(fechaStr);
					dia = fechaStr.substring(0, 2);
					mes = fechaStr.substring(2, 3);
					anio = fechaStr.substring(3, 7);	
				}				
				
				Calendar myCal = Calendar.getInstance();
				myCal.set(Calendar.YEAR, Integer.valueOf(anio));
				myCal.set(Calendar.MONTH,Integer.valueOf(mes)-1 );
				myCal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(dia));
				
				return myCal.getTime();
			}
		}
		return null;
	}
	
}
