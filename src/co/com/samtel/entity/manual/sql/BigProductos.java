package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_PRODUCTOS", schema = "dmc")
public class BigProductos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigProductosId id;

	@Column(name = "i_cod_tipo_producto")
	private Integer i_cod_tipo_producto;	
	
	@Column(name = "s_des_tipo_producto")
	private String s_des_tipo_producto;	
	
	@Column(name = "i_cod_producto")
	private String i_cod_producto;	
	
	@Column(name = "s_des_producto")
	private String s_des_producto;	
		
	@Column(name = "s_des_segmento_producto")
	private String s_des_segmento_producto;	
	
	@Column(name = "s_des_categoria_asesor")
	private String s_des_categoria_asesor;	
	
	@Column(name = "s_des_segmento_cliente")
	private String s_des_segmento_cliente;	
	
	@Column(name = "s_des_segmento_tasas")
	private String s_des_segmento_tasas;	
	
	@Column(name = "m_tasa_referencia")
	private BigDecimal m_tasa_referencia;

	public BigProductosId getId() {
		return id;
	}

	public void setId(BigProductosId id) {
		this.id = id;
	}

	public Integer getI_cod_tipo_producto() {
		return i_cod_tipo_producto;
	}

	public void setI_cod_tipo_producto(Integer i_cod_tipo_producto) {
		this.i_cod_tipo_producto = i_cod_tipo_producto;
	}

	public String getS_des_tipo_producto() {
		return s_des_tipo_producto;
	}

	public void setS_des_tipo_producto(String s_des_tipo_producto) {
		this.s_des_tipo_producto = s_des_tipo_producto;
	}

	public String getI_cod_producto() {
		return i_cod_producto;
	}

	public void setI_cod_producto(String i_cod_producto) {
		this.i_cod_producto = i_cod_producto;
	}

	public String getS_des_producto() {
		return s_des_producto;
	}

	public void setS_des_producto(String s_des_producto) {
		this.s_des_producto = s_des_producto;
	}

	public String getS_des_segmento_producto() {
		return s_des_segmento_producto;
	}

	public void setS_des_segmento_producto(String s_des_segmento_producto) {
		this.s_des_segmento_producto = s_des_segmento_producto;
	}

	public String getS_des_categoria_asesor() {
		return s_des_categoria_asesor;
	}

	public void setS_des_categoria_asesor(String s_des_categoria_asesor) {
		this.s_des_categoria_asesor = s_des_categoria_asesor;
	}

	public String getS_des_segmento_cliente() {
		return s_des_segmento_cliente;
	}

	public void setS_des_segmento_cliente(String s_des_segmento_cliente) {
		this.s_des_segmento_cliente = s_des_segmento_cliente;
	}

	public String getS_des_segmento_tasas() {
		return s_des_segmento_tasas;
	}

	public void setS_des_segmento_tasas(String s_des_segmento_tasas) {
		this.s_des_segmento_tasas = s_des_segmento_tasas;
	}

	public BigDecimal getM_tasa_referencia() {
		return m_tasa_referencia;
	}

	public void setM_tasa_referencia(BigDecimal m_tasa_referencia) {
		this.m_tasa_referencia = m_tasa_referencia;
	}	

}
