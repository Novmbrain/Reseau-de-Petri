package PetriNetwork;

import java.util.HashMap;
import java.util.Map;

import Arc.Arc;
import Arc.ArcEnteredNormal;
import Arc.ArcVideur;
import Arc.ArcZero;

/**
 * 
 */


public class PetriNetworkImpl implements PetriNetwork{
	
	private Map<String, Place> placeMap;
	private Map<String, Arc> arcMap;
	private Map<String, Transition> transitionMap;
	
	

	public PetriNetworkImpl() {
		super();
		placeMap = new HashMap<>();
		arcMap = new HashMap<>();
		transitionMap = new HashMap<>();
	}
	
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addPlace(java.lang.String)
	 */
	@Override
	public void addPlace(String placeName) {
		// TODO Auto-generated method stub
		
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#deletePlace(java.lang.String)
	 */
	@Override
	public void deletePlace(String placeName) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArc(java.lang.String)
	 */
	@Override
	public void addArc(String arcName) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArcZero(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void addArcZero(String arcName, String placeName, int initialTokenPlace, String transitionName) {
		// TODO Auto-generated method stub
		Transition transition;
		Place place;
		
		if(arcMap.containsKey(arcName)){
			System.out.println("arc can't have the same name");
			return;
		}
		
		if(transitionMap.containsKey(transitionName)){
			transition = transitionMap.get(transitionName);
		}else{
			transition = new Transition(transitionName);
			transitionMap.put(transitionName, transition);
		}
		
		if(placeMap.containsKey(placeName)){
			place = placeMap.get(placeName);
		}else{
			place = new Place(initialTokenPlace, placeName);
			placeMap.put(placeName, place);
		}
		
		ArcZero arcZero = new ArcZero(arcName, place, transition);
		
		arcMap.put(arcName, arcZero);
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArcVideur(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void addArcVideur(String arcName, String placeName, int initialTokenPlace, String transitionName) {
		// TODO Auto-generated method stub
		Transition transition;
		Place place;
		
		if(arcMap.containsKey(arcName)){
			System.out.println("arc can't have the same name");
			return;
		}
		
		if(transitionMap.containsKey(transitionName)){
			transition = transitionMap.get(transitionName);
		}else{
			transition = new Transition(transitionName);
			transitionMap.put(transitionName, transition);
		}
		
		if(placeMap.containsKey(placeName)){
			place = placeMap.get(placeName);
		}else{
			place = new Place(initialTokenPlace, placeName);
			placeMap.put(placeName, place);
		}
		
		ArcVideur arcVideur = new ArcVideur(arcName, place, transition);
		
		arcMap.put(arcName, arcVideur);

	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addArcEnteredNormal(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void addArcEnteredNormal(String arcName, String placeName, int initialTokenPlace, String transitionName) {
		// TODO Auto-generated method stub
		Transition transition;
		Place place;
		
		if(arcMap.containsKey(arcName)){
			System.out.println("arc can't have the same name");
			return;
		}
		
		if(transitionMap.containsKey(transitionName)){
			transition = transitionMap.get(transitionName);
		}else{
			transition = new Transition(transitionName);
			transitionMap.put(transitionName, transition);
		}
		
		if(placeMap.containsKey(placeName)){
			place = placeMap.get(placeName);
		}else{
			place = new Place(initialTokenPlace, placeName);
			placeMap.put(placeName, place);
		}
		
		ArcEnteredNormal arcEnteredNormal = new ArcEnteredNormal(arcName, place, transition);
		
		arcMap.put(arcName, arcEnteredNormal);
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#deleteArc(java.lang.String)
	 */
	@Override
	public void deleteArc(String arcName) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#addTransition(java.lang.String)
	 */
	@Override
	public void addTransition(String transitionName) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#deleteTransition(java.lang.String)
	 */
	@Override
	public void deleteTransition(String transitionName) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see PetriNetwork.PetriNetwork#changeArcToken(java.lang.String, int)
	 */
	@Override
	public void changeArcToken(String arcName, int newToken) {
		// TODO Auto-generated method stub
		
	}

	public Map<String, Place> getPlaceMap() {
		return placeMap;
	}

	public Map<String, Arc> getArcMap() {
		return arcMap;
	}

	public Map<String, Transition> getTransitionMap() {
		return transitionMap;
	}

	@Override
	public String toString() {
		return "PetriNetworkImpl [placeMap=" + placeMap + ", arcMap=" + arcMap + ", transitionMap=" + transitionMap
				+ "]";
	}

	

}
