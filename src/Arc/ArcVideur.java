/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcVideur extends ArcEntered{
	
	
	/**
	 * @param place
	 * @param transition
	 */
	public ArcVideur(Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doChange() {
		// TODO Auto-generated method stub
		Place tempPlace = super.getPlace();
		tempPlace.fireDecreaseToken(tempPlace.FLAGARCVIDEUR);
	}

	@Override
	public boolean haveEnoughToken() {
		// TODO Auto-generated method stub
		Place tempPlace = super.getPlace();
		if(tempPlace.getToken() < 1){
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "arcVideur " + " (place with " + super.getPlace().getToken()
				+ " tokens to transition)\n";
	}
	
	
	
	
	
	


}
