/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcZero extends ArcEntered{
	

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
		tempPlace.fireDecreaseToken(tempPlace.FLAGARCZERO); //FLAGARCZERO is 0
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


	@Override
	public String toString() {
		return "arcZero " + " (place with " + super.getPlace().getToken()
				+ " tokens to transition)\n";
	}
	
	
	
	
	
}
