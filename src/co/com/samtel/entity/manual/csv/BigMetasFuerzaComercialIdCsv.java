package co.com.samtel.entity.manual.csv;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
*
* @author Jeferson
*/
@Embeddable
public class BigMetasFuerzaComercialIdCsv implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private Date d_fecha;

	@Column
	private String i_cod_fuerza_comercial;

	@Column
	private Integer i_cod_segmento_producto;

	@Column
	private String i_categoria_asesor;

	@Column
	private String s_nombre_meta;

	public BigMetasFuerzaComercialIdCsv() {
		super();
	}

}
