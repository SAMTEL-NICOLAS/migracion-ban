package co.com.samtel.entity.as400;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1409FL1")
public class BigRecojidosEntity {
	@Id
	@Column(name = "CRIREG")
	private Long CRIREG;
	@Column(name = "CRCSPR")
	private String CRCSPR;
	@Column(name = "CRTERC")
	private String CRTERC;

	public Long getCRIREG() {
		return CRIREG;
	}

	public void setCRIREG(Long cRIREG) {
		CRIREG = cRIREG;
	}

	public String getCRCSPR() {
		return CRCSPR;
	}

	public void setCRCSPR(String cRCSPR) {
		CRCSPR = cRCSPR;
	}

	public String getCRTERC() {
		return CRTERC;
	}

	public void setCRTERC(String cRTERC) {
		CRTERC = cRTERC;
	}

}
