package Spring.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class Oeuvre {

	@Id
	@GeneratedValue
	private Long idOeuvre;
    @Column	
	private String nomOeuvre;
    @Column	
	private String nomRealisateur;
    @Column	
	private Date dateRealisation;
    @Column	
	private Double valeurEstimee;
    @Column	
	private String etatOeuvre;
    @Column	
	private String localisation;
    @Column	
	private String urlImage;
    @Column	
	private int largeur;
    @Column	
	private int longeur;
    @Column	
	private String courant;
    
	public Long getIdOeuvre() {
		return idOeuvre;
	}
	public void setIdOeuvre(Long idOeuvre) {
		this.idOeuvre = idOeuvre;
	}
	public String getNomOeuvre() {
		return nomOeuvre;
	}
	public void setNomOeuvre(String nomOeuvre) {
		this.nomOeuvre = nomOeuvre;
	}
	public String getNomRealisateur() {
		return nomRealisateur;
	}
	public void setNomRealisateur(String nomRealisateur) {
		this.nomRealisateur = nomRealisateur;
	}
	public Date getDateRealisation() {
		return dateRealisation;
	}
	public void setDateRealisation(Date dateRealisation) {
		this.dateRealisation = dateRealisation;
	}
	public Double getValeurEstimee() {
		return valeurEstimee;
	}
	public void setValeurEstimee(Double valeurEstimee) {
		this.valeurEstimee = valeurEstimee;
	}
	public String getEtatOeuvre() {
		return etatOeuvre;
	}
	public void setEtatOeuvre(String etatOeuvre) {
		this.etatOeuvre = etatOeuvre;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getLongeur() {
		return longeur;
	}
	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}
	public String getCourant() {
		return courant;
	}
	public void setCourant(String courant) {
		this.courant = courant;
	}
	
	public Oeuvre() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
