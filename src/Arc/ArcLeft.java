/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcLeft extends Arc{
	
	private int tokenInArc;

	public ArcLeft(int tokenInArc, Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
		this.tokenInArc=tokenInArc;
	}

}
