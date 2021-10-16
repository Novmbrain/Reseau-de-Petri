/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcLeft extends Arc{

	private static final boolean direction = false;
	
	public ArcLeft(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
		super.setDirection(false);
	}

	public ArcLeft(Place place, Transition transition, int tokenInArc) {
		super(place, transition, tokenInArc);
		// TODO Auto-generated constructor stub
		super.setDirection(false);
	}

	@Override
	public void doChange() {
		// TODO Auto-generated method stub
		super.getPlace().fireAddToken(super.getTokenInArc());
	}

	@Override
	public boolean haveEnoughToken() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
	
	

}
