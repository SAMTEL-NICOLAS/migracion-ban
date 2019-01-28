package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "BIG_ACTIVIDAD_ECONOMICA_INTERNA", schema = "dbo")
public class BigActividadEconomicaInterna implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "i_codigo_interno")
	private String codigo_int;	
	
	@Column(name = "i_codigo_ciiu")
	private String codigo_ciu;
	
	@Column(name = "i_cod_sector_economico")
	private String cod_sec_ec;
	
	@Column(name = "s_descripcion_interna")
	private String des_act_in;

	public String getCodigo_int() {
		return codigo_int;
	}

	public void setCodigo_int(String codigo_int) {
		this.codigo_int = codigo_int;
	}

	public String getCodigo_ciu() {
		return codigo_ciu;
	}

	public void setCodigo_ciu(String codigo_ciu) {
		this.codigo_ciu = codigo_ciu;
	}

	public String getCod_sec_ec() {
		return cod_sec_ec;
	}

	public void setCod_sec_ec(String cod_sec_ec) {
		this.cod_sec_ec = cod_sec_ec;
	}

	public String getDes_act_in() {
		return des_act_in;
	}

	public void setDes_act_in(String des_act_in) {
		this.des_act_in = des_act_in;
	}


}
