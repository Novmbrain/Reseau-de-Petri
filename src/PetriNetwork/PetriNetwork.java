package PetriNetwork;

import Arc.Arc;


public interface PetriNetwork {
	public void addPlace(Place place);
	
	public void deletePlace(Place place);
	
	public void addArc(Arc arc);
	
	public void deleteArc(Arc arc);
	
	public void addTransition(Transition transition);
	
	public void deleteTransition(Transition transition);
	
	public void changeArcToken(Arc arc, int newToken);
	
}
