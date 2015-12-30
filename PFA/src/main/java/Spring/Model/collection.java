package Spring.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class collection {
	
	@Id
	@GeneratedValue
	private Long idCollection;
	
	@Column
	private String nomCollection;
	@Column
	private String type;
	@Column
	private Date dateCreation;
	@Column
	private String description;
	@Column
	private int nombreOeuvres;
	
	
	public Long getIdCollection() {
		return idCollection;
	}
	public void setIdCollection(Long idCollection) {
		this.idCollection = idCollection;
	}
	public String getNomCollection() {
		return nomCollection;
	}
	public void setNomCollection(String nomCollection) {
		this.nomCollection = nomCollection;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNombreOeuvres() {
		return nombreOeuvres;
	}
	public void setNombreOeuvres(int nombreOeuvres) {
		this.nombreOeuvres = nombreOeuvres;
	}
	public collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
