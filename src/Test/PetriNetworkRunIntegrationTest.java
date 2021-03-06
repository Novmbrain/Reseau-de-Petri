/**
 * 
 */
package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Arc.ArcEnteredNormal;
import Arc.ArcLeft;
import Arc.ArcVideur;
import Arc.ArcZero;
import Exception4PetriNetwork.DoubleArcException;
import PetriNetwork.PetriNetworkImpl;
import PetriNetwork.Place;
import PetriNetwork.Transition;

/**
 * @Description
 * @author 
 * @version
 * 
 */
public class PetriNetworkRunIntegrationTest {
	
	@Test
	public void ArcEnterdNormalTestInSimplePetriNetwork() throws DoubleArcException{
		PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place place = pN1.addPlace(2);
		Transition transition = pN1.addTransition();
		ArcEnteredNormal addArcEnteredNormal = pN1.addArcEnteredNormal(place, transition, 1);
		ArcLeft arcLeft = pN1.addArcLeft(place, transition, 2);
		
		pN1.connectTransition2ArcEntered(transition, addArcEnteredNormal);
		pN1.connectTransition2ArcLeft(transition, arcLeft);
		
		pN1.fire();
		pN1.fire();
		pN1.fire();
	
		
		assertEquals(5, place.getToken());
	}
	
	@Test
	public void ArcZeroTestInSimplePetriNetwork() throws DoubleArcException{
		PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place place = pN1.addPlace(0);
		Transition transition = pN1.addTransition();
		ArcZero arcZero = new ArcZero(place, transition);
		ArcLeft arcLeft = pN1.addArcLeft(place, transition, 2);
		
		pN1.connectTransition2ArcEntered(transition, arcZero);
		pN1.connectTransition2ArcLeft(transition, arcLeft);
		
		pN1.fire();
		pN1.fire();
	
		assertEquals(2, place.getToken());
	}
	
	@Test
	public void ArcVideurTestInSimplePetriNetwork() throws DoubleArcException{
		PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place place = pN1.addPlace(2);
		Transition transition = pN1.addTransition();
		ArcVideur arcVideur = pN1.addArcVideur(place, transition);
		ArcLeft arcLeft = pN1.addArcLeft(place, transition,2);
		
		pN1.connectTransition2ArcEntered(transition, arcVideur);
		pN1.connectTransition2ArcLeft(transition, arcLeft);
		
		pN1.fire();
		pN1.fire();
		pN1.fire();
	
		assertEquals(2, place.getToken());
	}
	

}
