package Spring.Dao;

import Spring.Model.Sculpture;

public interface ISculptureDao {

	public void ajouterSculpture(Sculpture S);

	public void supprimerSculpture(Sculpture S);

	public void modifierSculpture(Sculpture S);
	
	public Sculpture rechercherSculptureById(Long id);
	
}
