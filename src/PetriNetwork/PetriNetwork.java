package PetriNetwork;

import Arc.Arc;
import Arc.ArcEnteredNormal;
import Arc.ArcLeft;
import Arc.ArcVideur;
import Arc.ArcZero;
import Exception4PetriNetwork.DoubleArcException;

public interface PetriNetwork {
	
	public Place addPlace(int initialToken);
	
	public void deletePlace(Place place);
	
	public void addPlaceToken(Place place, int addTokenNumber);
	
	public void deletePlaceToken(Place place, int deleteTokenNumber);
	
	public ArcLeft addArcLeft(Place place, Transition transition, int initialToken);
	
	public ArcZero addArcZero(Place place, Transition transition);

	public ArcVideur addArcVideur(Place place, Transition transition);
	
	public ArcEnteredNormal addArcEnteredNormal(Place place, Transition transition, int initialToken);
	
	public void deleteArc(Arc arc);
	
	public Transition addTransition();
	
	public void connectTransition2ArcEntered(Transition transition, Arc arc) throws DoubleArcException;
	
	public void connectTransition2ArcLeft(Transition transition, Arc arc) throws DoubleArcException;
	
	public void deleteTransition(Transition transition);
	
	public void changeArcToken(Arc arc, int newToken);
	
	public void fire();
	
}
