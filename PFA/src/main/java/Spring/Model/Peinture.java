package Spring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Peinture extends Oeuvre{

	@Id
	@GeneratedValue
	private Long idPeinture;
	@Column
	private String techniquesUtilises;
	
	
	public Long getIdPeinture() {
		return idPeinture;
	}
	public void setIdPeinture(Long idPeinture) {
		this.idPeinture = idPeinture;
	}
	public String getTechniquesUtilises() {
		return techniquesUtilises;
	}
	public void setTechniquesUtilises(String techniquesUtilises) {
		this.techniquesUtilises = techniquesUtilises;
	}
	public Peinture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
