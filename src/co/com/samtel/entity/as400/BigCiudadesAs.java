package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411F84", schema = "DAMCYFILES")
public class BigCiudadesAs implements Serializable {
	
	@Id	
	private String cod_ciudad;
	
	@Column(name = "cod_depto")
	private String cod_depto;
	
	@Column(name = "nombre_ciu")
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
