package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;

/**
 * 
 */


public class ArcEntered extends Arc{
	
	private static final boolean direction = true; //the direction of all the ArcEntered (ArcEnteredNormal, ArcZero, ArcVideur) is true

	public ArcEntered(Place place, Transition transition, int tokenInArc) {
		super(place, transition, tokenInArc);
		// TODO Auto-generated constructor stub
		super.setDirection(Arc.ARCENTERED);
	}

	public ArcEntered(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
		super.setDirection(Arc.ARCENTERED);
		
	}


	
	
	
	
	
	
	
	



	

}
