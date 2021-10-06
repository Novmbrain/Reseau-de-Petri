/**
 * 
 */
package Test;

import org.junit.Test;

import Arc.ArcEnteredNormal;
import PetriNetwork.PetriNetworkImpl;
import PetriNetwork.Place;
import PetriNetwork.Transition;

/**
 * @Description
 * @author 
 * @version
 * 
 */
public class PetriNetworkCreateTest {
	
	@Test
	public void CreateSimplePetriNetwork(){
		PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place place = pN1.addPlace(1);
		Transition transition = pN1.addTransition();
		ArcEnteredNormal addArcEnteredNormal = pN1.addArcEnteredNormal(place, transition, 2);
		

	}

}
