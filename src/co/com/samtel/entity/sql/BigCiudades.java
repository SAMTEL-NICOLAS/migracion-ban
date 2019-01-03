package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "BIG_CIUDADES", schema = "dbo")
public class BigCiudades implements Serializable{
		
	@Id
	@Column(name = "i_cod_ciudad")
	private String cod_ciudad;	
	
	@Column(name = "i_cod_depto")
	private String cod_depto ;
	
	@Column(name = "s_nombre_ciudad")
	private String nombre_ciu;

	public String getCod_ciudad() {
		return cod_ciudad;
	}

	public void setCod_ciudad(String cod_ciudad) {
		this.cod_ciudad = cod_ciudad;
	}

	public String getCod_depto() {
		return cod_depto;
	}

	public void setCod_depto(String cod_depto) {
		this.cod_depto = cod_depto;
	}

	public String getNombre_ciu() {
		return nombre_ciu;
	}

	public void setNombre_ciu(String nombre_ciu) {
		this.nombre_ciu = nombre_ciu;
	}
}
