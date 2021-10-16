package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;

/**
 * 
 */


public class ArcEntered extends Arc{
	
	private static final boolean direction = true;

	public ArcEntered(Place place, Transition transition, int tokenInArc) {
		super(place, transition, tokenInArc);
		// TODO Auto-generated constructor stub
		super.setDirection(true);
	}

	public ArcEntered(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
		super.setDirection(true);
		
	}


	
	
	
	
	
	
	
	



	

}
