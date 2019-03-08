package co.com.samtel.ldap;

import co.com.samtel.dto.ErrorDto;

public class LdapDto {

	private String user;
	private String password;
	private String group;

	public static ErrorDto of() {
		return new ErrorDto();
	}

	public static LdapDto of(String user, String password, String group) {
		return new LdapDto(user, password, group);
	}

	public LdapDto(String user, String password, String group) {
		super();
		this.user = user;
		this.password = password;
		this.group = group;
	}

	public LdapDto() {
		super();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
