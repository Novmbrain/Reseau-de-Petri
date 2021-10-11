/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcZero extends ArcEntered{
	
	private final static int thresholdOfArcZero = 0; 

	/**
	 * @param place
	 * @param transition
	 */
	public ArcZero(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void doChange() {
		// TODO Auto-generated method stub
		Place tempPlace = super.getPlace();
		tempPlace.fireDecreaseToken(tempPlace.FLAGARCZERO);
	}
	
	@Override
	public boolean haveEnoughToken() {
		// TODO Auto-generated method stub
		Place tempPlace = super.getPlace();
		if(tempPlace.getToken() != 0){
			return false;
		}
		
		return true;
	}
	
	
	
}
