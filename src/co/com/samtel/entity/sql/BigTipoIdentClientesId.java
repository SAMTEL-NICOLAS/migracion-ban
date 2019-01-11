 package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BigTipoIdentClientesId implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
	private String i_tipo_persona;			
	private String i_clase_tipo;
	
	public BigTipoIdentClientesId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigTipoIdentClientesId(String i_tipo_persona, String i_clase_tipo) {
		super();
		this.i_tipo_persona = i_tipo_persona;
		this.i_clase_tipo = i_clase_tipo;
	}
	public String getI_tipo_persona() {
		return i_tipo_persona;
	}
	public void setI_tipo_persona(String i_tipo_persona) {
		this.i_tipo_persona = i_tipo_persona;
	}
	public String getI_clase_tipo() {
		return i_clase_tipo;
	}
	public void setI_clase_tipo(String i_clase_tipo) {
		this.i_clase_tipo = i_clase_tipo;
	}
	
	

}
