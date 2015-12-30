package Spring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sculpture extends Oeuvre {
	
	@Id 
	@GeneratedValue
	private Long idSculpture;
	@Column
	private String materiauxPrincipaux;
	@Column
	private int hauteur;
	
	public Long getIdSculpture() {
		return idSculpture;
	}
	public void setIdSculpture(Long idSculpture) {
		this.idSculpture = idSculpture;
	}
	public String getMateriauxPrincipaux() {
		return materiauxPrincipaux;
	}
	public void setMateriauxPrincipaux(String materiauxPrincipaux) {
		this.materiauxPrincipaux = materiauxPrincipaux;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public Sculpture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
