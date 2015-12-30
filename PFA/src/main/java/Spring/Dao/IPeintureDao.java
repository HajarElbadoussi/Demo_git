package Spring.Dao;

import Spring.Model.Peinture;

public interface IPeintureDao {

	public void ajouterPeinture(Peinture P);

	public void supprimerPeinture(Peinture p);

	public void modifierPeinture(Peinture P);
	
	public Peinture rechercherPeinture(Long id);
	
	
}
