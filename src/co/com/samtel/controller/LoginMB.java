package co.com.samtel.controller;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import co.com.samtel.service.IRoleService;

@ManagedBean
public class LoginMB {

	private String usuario;
	@Inject
	private IRoleService roleService;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void login() {
		roleService.findAll();
	}

}
