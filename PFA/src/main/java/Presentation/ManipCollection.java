package Presentation;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import Spring.Metier.CollectionImplMetier;
import Spring.Model.collection;

@RequestScoped
@ManagedBean(name = "manipCollection")
@ViewScoped
public class ManipCollection {

	private Long idCollection;
	private String nomCollection;
	private String type;
	private Date dateCreation;
	private String description;
	private int nombreOeuvres;

	@ManagedProperty("#{collectionImplMetier}")
	private CollectionImplMetier collectionImplMetier;

	public void AjouterCollection() {
		collection C = null;

		if (collectionImplMetier != null)
			System.out.println("Couche Presentation...................");
		else
			System.out.println("Null");

	}

	public CollectionImplMetier getCollectionImplMetier() {
		return collectionImplMetier;
	}

	public void setCollectionImplMetier(
			CollectionImplMetier collectionImplMetier) {
		this.collectionImplMetier = collectionImplMetier;
	}

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

}
