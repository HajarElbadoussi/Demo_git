package Spring.Dao;

import Spring.Model.collection;

public interface IcollectionDao {

	public void ajoutercollection(collection C);

	public void supprimercollection(collection C);

	public void modifiercollection(collection C);
	
	public collection recherchercollection(Long id);
}
