package Spring.Dao;

import Spring.Model.Sculpture;
import Spring.Utilite.AbstractDao;

public class SculptureImplDao extends AbstractDao implements ISculptureDao {

	@SuppressWarnings("unchecked")
	public void ajouterSculpture(Sculpture S) {
		// TODO Auto-generated method stub
		persist(S);
	}

	public void supprimerSculpture(Sculpture S) {
		// TODO Auto-generated method stub
		
	}

	public void modifierSculpture(Sculpture S) {
		// TODO Auto-generated method stub
		
	}

	public Sculpture rechercherSculptureById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
