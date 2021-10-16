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
import PetriNetwork.PetriNetwork;
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
	
	@Test
	public void TestDoubleArc1(){
		PetriNetworkImpl pN1 = new PetriNetworkImpl();
		Place place = pN1.addPlace(2);
		Transition transition = pN1.addTransition();
		
		ArcEnteredNormal arcEnteredNormal = pN1.addArcEnteredNormal(place, transition, 1);
		ArcZero arcZero = pN1.addArcZero(place, transition);
		
		try {
			pN1.connectTransition2ArcEntered(transition, arcEnteredNormal);
			pN1.connectTransition2ArcEntered(transition, arcZero);
			
		} catch (DoubleArcException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		
	}
	
	@Test
	public void TestOfShow() {
		PetriNetwork pN1 = new PetriNetworkImpl();
		
		Place placeLeft = pN1.addPlace(4);
		Place placeRight = pN1.addPlace(0);
		
		Transition transition = pN1.addTransition();
		
		ArcEnteredNormal arcEnteredNormal = pN1.addArcEnteredNormal(placeLeft, transition, 1);
		ArcLeft arcLeft = pN1.addArcLeft(placeRight, transition, 1);
		
		try {
			pN1.connectTransition2ArcEntered(transition, arcEnteredNormal);
			pN1.connectTransition2ArcLeft(transition, arcLeft);
		} catch (DoubleArcException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
