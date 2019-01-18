package co.com.samtel.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MenuMB {
	private String casa;
    private String cargueMigracion;
    private String auditoriaAs400;
    private String cargueExcel;

    public MenuMB() {
        ponerTitulos();
    }

    public void ponerTitulos() {
        setCasa("Home");
        setCargueMigracion("Cargar Migracion");
        setAuditoriaAs400("Auditoria AS400");
        setCargueExcel("Cargue Excel");
    }

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public String getCargueMigracion() {
		return cargueMigracion;
	}

	public void setCargueMigracion(String cargueMigracion) {
		this.cargueMigracion = cargueMigracion;
	}

	public String getAuditoriaAs400() {
		return auditoriaAs400;
	}

	public void setAuditoriaAs400(String auditoriaAs400) {
		this.auditoriaAs400 = auditoriaAs400;
	}

	public String getCargueExcel() {
		return cargueExcel;
	}

	public void setCargueExcel(String cargueExcel) {
		this.cargueExcel = cargueExcel;
	}
    
    

    
}
