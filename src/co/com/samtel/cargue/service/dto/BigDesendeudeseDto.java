package co.com.samtel.cargue.service.dto;

public class BigDesendeudeseDto {

	private String tipoDocumento;
	private String identificacionCliente;
	private String codigoCliente;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getIdentificacionCliente() {
		return identificacionCliente;
	}

	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public String toString() {
		return "BigDesendeudeseDto [tipoDocumento=" + tipoDocumento + ", identificacionCliente=" + identificacionCliente
				+ ", codigoCliente=" + codigoCliente + "]";
	}

}