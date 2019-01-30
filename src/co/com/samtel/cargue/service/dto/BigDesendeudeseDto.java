package co.com.samtel.cargue.service.dto;

public class BigDesendeudeseDto {

	private String I_tipo_documento;
	private String S_identificacion_cliente;
	private String I_codigo_cliente;
	
	
	public String getI_tipo_documento() {
		return I_tipo_documento;
	}
	public void setI_tipo_documento(String i_tipo_documento) {
		I_tipo_documento = i_tipo_documento;
	}
	public String getS_identificacion_cliente() {
		return S_identificacion_cliente;
	}
	public void setS_identificacion_cliente(String s_identificacion_cliente) {
		S_identificacion_cliente = s_identificacion_cliente;
	}
	public String getI_codigo_cliente() {
		return I_codigo_cliente;
	}
	public void setI_codigo_cliente(String i_codigo_cliente) {
		I_codigo_cliente = i_codigo_cliente;
	}
	@Override
	public String toString() {
		return "BigDesendeudeseDto [I_tipo_documento=" + I_tipo_documento + ", S_identificacion_cliente="
				+ S_identificacion_cliente + ", I_codigo_cliente=" + I_codigo_cliente + "]";
	}



}