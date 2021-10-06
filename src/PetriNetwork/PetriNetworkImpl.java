package PetriNetwork;

import java.util.HashSet;
import java.util.Set;

import Arc.Arc;
import Arc.ArcEnteredNormal;
import Arc.ArcLeft;
import Arc.ArcVideur;
import Arc.ArcZero;

/**
 * 
 */


public class PetriNetworkImpl implements PetriNetwork{
	
	private Set<Place> placeSet;
	private Set<Arc> arcSet;
	private Set<Transition> transitionSet;
	
	
	
	public PetriNetworkImpl() {
		super();
		placeSet = new HashSet<>();
		arcSet = new HashSet<>();
		transitionSet = new HashSet<>();
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addPlace(int)
	 */
	@Override
	public Place addPlace(int initialToken) {
		// TODO Auto-generated method stub
		Place newPlace = new Place(initialToken);
		placeSet.add(newPlace);
		return newPlace;

	}
	
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#deletePlace(PetriNetwork.Place)
	 */
	@Override
	public void deletePlace(Place place) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#changePlaceToken(PetriNetwork.Place, int)
	 */
	@Override
	public void changePlaceToken(Place place, int newToken) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArcZero(PetriNetwork.Place, PetriNetwork.Transition)
	 */
	@Override
	public ArcZero addArcZero(Place place, Transition transition) {
		// TODO Auto-generated method stub
		ArcZero arcZero = new ArcZero(place, transition);
		arcSet.add(arcZero);
		return arcZero;
	}
	
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArcVideur(PetriNetwork.Place, PetriNetwork.Transition)
	 */
	@Override
	public ArcVideur addArcVideur(Place place, Transition transition) {
		// TODO Auto-generated method stub
		ArcVideur arcVideur = new ArcVideur(place, transition);
		arcSet.add(arcVideur);
		return arcVideur;
	}
	
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArcEnteredNormal(PetriNetwork.Place, PetriNetwork.Transition, int)
	 */
	@Override
	public ArcEnteredNormal addArcEnteredNormal(Place place, Transition transition, int initialToken) {
		// TODO Auto-generated method stub
		ArcEnteredNormal arcEnteredNormal = new ArcEnteredNormal(place, transition, initialToken);
		arcSet.add(arcEnteredNormal);
		return arcEnteredNormal;
	}
	
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArcLeft(PetriNetwork.Place, PetriNetwork.Transition)
	 */
	@Override
	public ArcLeft addArcLeft(Place place, Transition transition, int initialToken) {
		// TODO Auto-generated method stub
		ArcLeft arcLeft = new ArcLeft(place, transition, initialToken);
		arcSet.add(arcLeft);
		return arcLeft;	
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#connectTransition2ArcEntered(Arc.Arc)
	 */
	@Override
	public void connectTransition2ArcEntered(Transition transition, Arc arc) {
		// TODO Auto-generated method stub
		transition.addArc(arc);
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#connectTransition2ArcLeft(Arc.Arc)
	 */
	@Override
	public void connectTransition2ArcLeft(Transition transition, Arc arc) {
		// TODO Auto-generated method stub
		transition.addArc(arc);
	}
	
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#deleteArc(Arc.Arc)
	 */
	@Override
	public void deleteArc(Arc arc) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addTransition()
	 */
	@Override
	public Transition addTransition() {
		// TODO Auto-generated method stub
		Transition transition = new Transition();
		transitionSet.add(transition);
		return transition;
	}
	
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#deleteTransition(PetriNetwork.Transition)
	 */
	@Override
	public void deleteTransition(Transition transition) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#changeArcToken(Arc.Arc, int)
	 */
	@Override
	public void changeArcToken(Arc arc, int newToken) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#fire()
	 */
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		for(Transition transition : transitionSet){
			if(transition.isTriggerable()){
				transition.doFire();
			}
		}
		
	}
	@Override
	public String toString() {
		return "PetriNetworkImpl [placeSet=" + placeSet + ", arcSet=" + arcSet + ", transitionSet=" + transitionSet
				+ "]";
	}

	

	

}
