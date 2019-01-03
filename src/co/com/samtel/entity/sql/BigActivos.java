package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_ACTIVOS", schema = "dbo")
public class BigActivos implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActivosId id;	


}
