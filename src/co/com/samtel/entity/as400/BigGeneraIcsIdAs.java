package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class BigGeneraIcsIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "num_creotr")
	private Long i_codigo_cliente;	
	
	@Column(name = "num_creotr")
	private Long s_cod_producto;

	@Transient
	private Date d_fecha_corte;

}
