package Test;





import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Arc.ArcEnteredNormal;
import Arc.ArcLeft;
import Arc.ArcZero;
import Exception4PetriNetwork.DoubleArcException;

import PetriNetwork.PetriNetworkImpl;
import PetriNetwork.Place;
import PetriNetwork.Transition;

public class PetriNetworkCreateIntegrationTest {
	
	@Test
	public void SimplePetriNetworkPlaceChange() {
		PetriNetworkImpl pN2 = new PetriNetworkImpl();
		
		Place p1 = pN2.addPlace(5);
		Place p2 = pN2.addPlace(9);
		Place p3 = pN2.addPlace(0);
		Place p4 = pN2.addPlace(3);
		
		pN2.addPlaceToken(p4, 5);
		pN2.deletePlaceToken(p2, 5);
		
		pN2.deletePlace(p1);
		
		assertEquals(8, p4.getToken());
		assertEquals(4, p2.getToken());
		assertEquals(3, pN2.getPlaceSetSize());
	}

	@Test
	public void SimplePetriNetworkTransitionChange() {
		PetriNetworkImpl pN3 = new PetriNetworkImpl();
		
		Transition t1 = pN3.addTransition();
		Transition t2 = pN3.addTransition();
		
		pN3.deleteTransition(t2);
		
//		assertEquals(1, pN3.getTransitonSetSize());
	}
	
	@Test
	public void SimplePetriNetworkArcChange() throws DoubleArcException {
		PetriNetworkImpl pN4 = new PetriNetworkImpl();
		
		Place p1 = pN4.addPlace(5);
		Place p2 = pN4.addPlace(7);
		Transition t1 = pN4.addTransition();
		Transition t2 = pN4.addTransition();
		ArcEnteredNormal arcEnteredNormal = pN4.addArcEnteredNormal(p1, t1, 1);
		ArcLeft arcLeft = pN4.addArcLeft(p2, t2,2);
		pN4.connectTransition2ArcEntered(t1, arcEnteredNormal);
		pN4.connectTransition2ArcLeft(t2, arcLeft);
		
		pN4.deleteArc(arcLeft);
		
		pN4.changeArcToken(arcEnteredNormal, 6);
		
		assertEquals(1, pN4.getArcSetSize());
		assertEquals(6, arcEnteredNormal.getTokenInArc());
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
}
