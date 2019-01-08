package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1414F", schema = "DAMCYFILES")
public class BigActivoConsolidadoAs implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigClienteProductoIdAs id;
	
	@Column(name = "fecha_cort")
	private Integer fecha_cort;
	
	
	private String MOD_CREDIT;
	
	private Short CANT_PROVI;	
	private Integer OTORGA_MES;	
	private Long MONTO_OTRG;
	private Long MONTO_CUPO;
	private Long SALDO_CORT;
	private Integer NR_CAN_MES;
	private Long TASA_INT;
	private Integer NRO_CAST_M;
	private Integer PLAZO_PROM;
	private Short NRO_CRED_V;
	private Integer NRO_SOL_CR;
	private Integer NRO_CRED_A;
	private Integer NRO_CRED_R;


}
