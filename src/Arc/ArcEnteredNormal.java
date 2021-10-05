/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcEnteredNormal extends ArcEntered {
	
	private int tokenInArc;

	public ArcEnteredNormal(Place place, Transition transition) {
		super(place, transition);
	}


	public ArcEnteredNormal(int tokenInArc, Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
		this.tokenInArc=tokenInArc;
	}
	

}
