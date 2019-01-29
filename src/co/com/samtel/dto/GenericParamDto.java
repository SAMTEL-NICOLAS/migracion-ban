package co.com.samtel.dto;

public class GenericParamDto {

	private String clave;
	private String valor;
	
	public static GenericParamDto of(String clave, String valor) {
		return new GenericParamDto(clave, valor);
	}

	public GenericParamDto(String clave, String valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}




	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
