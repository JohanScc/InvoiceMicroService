package aforo255.ms.test.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State  implements Serializable{

	
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_state")
	private Integer idState ;
	@Column(name="descripcion")
	private String descripcion ;
	public Integer getIdState() {
		return idState;
	}
	public void setIdState(Integer idState) {
		this.idState = idState;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}