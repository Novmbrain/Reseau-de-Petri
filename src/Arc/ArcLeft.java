/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcLeft extends Arc{

	/**
	 * @param place
	 * @param transition
	 */
	
	public ArcLeft(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
	}

	public ArcLeft(Place place, Transition transition, int tokenInArc) {
		super(place, transition, tokenInArc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doChange() {
		// TODO Auto-generated method stub
		super.getPlace().fireChangeToken(super.getTokenInArc());
	}
	
	

}
