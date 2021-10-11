/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ArcVideur extends ArcEntered{
	
	private static final int thresholdOfArcVideur = 1;

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
		if(tempPlace.getToken() < thresholdOfArcVideur){
			return false;
		}
		
		return true;
	}
	
	
	
	


}
