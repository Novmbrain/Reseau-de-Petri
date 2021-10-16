/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcEnteredNormal extends ArcEntered {
	
	

	/**
	 * @param place
	 * @param transition
	 */
	public ArcEnteredNormal(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
	}

	public ArcEnteredNormal(Place place, Transition transition, int tokenInArc) {
		super(place, transition, tokenInArc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doChange() {
		// TODO Auto-generated method stub
		super.getPlace().fireDecreaseToken(super.getTokenInArc());
	}

	@Override
	public boolean haveEnoughToken() {
		// TODO Auto-generated method stub
		Place tempPlace = super.getPlace();
		if(tempPlace.getToken() < this.getTokenInArc()){
			return false;
		}
		
		return true;
	}
	
	

	
	
	
	
	
	
	




	

}
