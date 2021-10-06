package PetriNetwork;

import Arc.Arc;
import Arc.ArcEnteredNormal;
import Arc.ArcLeft;
import Arc.ArcVideur;
import Arc.ArcZero;

public interface PetriNetwork {
	
	public Place addPlace(int initialToken);
	
	public void deletePlace(Place place);
	
	public void changePlaceToken(Place place, int newToken);
	
	public ArcLeft addArcLeft(Place place, Transition transition);
	
	public ArcZero addArcZero(Place place, Transition transition);
	
	public ArcVideur addArcVideur(Place place, Transition transition);
	
	public ArcEnteredNormal addArcEnteredNormal(Place place, Transition transition, int initialToken);
	
	public void deleteArc(Arc arc);
	
	public Transition addTransition();
	
	public void connectTransition2ArcEntered(Transition transition, Arc arc);
	
	public void connectTransition2ArcLeft(Transition transition, Arc arc);
	
	public void deleteTransition(Transition transition);
	
	public void changeArcToken(Arc arc, int newToken);
	
	public void fire();
	
}
