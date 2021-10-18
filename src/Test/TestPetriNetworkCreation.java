package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arc.ArcEnteredNormal;
import Arc.ArcLeft;
import Arc.ArcZero;
import Exception4PetriNetwork.DoubleArcException;
import PetriNetwork.PetriNetworkImpl;
import PetriNetwork.Place;
import PetriNetwork.Transition;

public class TestPetriNetworkCreation {
	
	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll executed");
	}
	
	@BeforeEach
	void setupThis() {
		System.out.println("@BeforeEach executed");
	}
	
	@Test
	void CPe() {
        PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place p1 = pN1.addPlace(5);
		Place p2 = pN1.addPlace(0);
		Place p3 = pN1.addPlace(-5);
		
		Assertions.assertEquals(2, pN1.getPlaceSetSize());
	}
	
	@Test
	void CT() {
        PetriNetworkImpl pN2 = new PetriNetworkImpl();
		
		Transition t1 = pN2.addTransition();
		Transition t2 = pN2.addTransition();
		
		pN2.deleteTransition(t2);
		
		Assertions.assertEquals(1, pN2.getTransitonSetSize());
	}
	
	@Test
	void SJP2() {
        PetriNetworkImpl pN2 = new PetriNetworkImpl();
        
		Place p1 = pN2.addPlace(5);
		pN2.deletePlaceToken(p1, 3);
		pN2.deletePlaceToken(p1, -2);
		

		Assertions.assertEquals(2, p1.getToken());
	}
	
	@Test
	void CAN1() {
        PetriNetworkImpl pN3 = new PetriNetworkImpl();
		
        Place p1 = pN3.addPlace(5);
        Transition t1 = pN3.addTransition();
		ArcEnteredNormal arcEnteredNormal = pN3.addArcEnteredNormal(p1, t1, -1);
		
		assertEquals(1, pN3.getArcSetSize());
	}
	
	@Test
	void AEND() {
		PetriNetworkImpl pN4 = new PetriNetworkImpl();
		Place place = pN4.addPlace(2);
		Transition transition = pN4.addTransition();
		
		ArcEnteredNormal arcEnteredNormal1 = pN4.addArcEnteredNormal(place, transition, 1);
		ArcEnteredNormal arcEnteredNormal2 = pN4.addArcEnteredNormal(place, transition, 5);
		
		try {
			pN4.connectTransition2ArcEntered(transition, arcEnteredNormal1);
			pN4.connectTransition2ArcEntered(transition, arcEnteredNormal2);
			
		} catch (DoubleArcException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		
		Assertions.assertEquals(1, pN4.getArcSetSize());
	}
	
	@Test
	void RM2() throws DoubleArcException {
        PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place p1 = pN1.addPlace(2);
		Place p2 = pN1.addPlace(2);
		Transition t1 = pN1.addTransition();
		ArcEnteredNormal arcEnteredNormal = pN1.addArcEnteredNormal(p1, t1, 1);
		ArcLeft arcLeft = pN1.addArcLeft(p2, t1, 3);
		
		pN1.connectTransition2ArcEntered(t1, arcEnteredNormal);
		pN1.connectTransition2ArcLeft(t1, arcLeft);
		
		pN1.fire();
		
		Assertions.assertEquals(1, p1.getToken());
		Assertions.assertEquals(5, p2.getToken());
	}
	
	@Test
	void REM0() throws DoubleArcException {
        PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place p1 = pN1.addPlace(2);
		Place p2 = pN1.addPlace(2);
		Place p3 = pN1.addPlace(2);
		Transition t1 = pN1.addTransition();
		ArcEnteredNormal arcEnteredNormal1 = pN1.addArcEnteredNormal(p1, t1, 1);
		ArcEnteredNormal arcEnteredNormal2 = pN1.addArcEnteredNormal(p2, t1, 1);
		ArcLeft arcLeft = pN1.addArcLeft(p3, t1, 3);
		
		pN1.connectTransition2ArcEntered(t1, arcEnteredNormal1);
		pN1.connectTransition2ArcEntered(t1, arcEnteredNormal2);
		pN1.connectTransition2ArcLeft(t1, arcLeft);
		
		pN1.fire();
		
		Assertions.assertEquals(1, p1.getToken());
		Assertions.assertEquals(1, p2.getToken());
		Assertions.assertEquals(5, p3.getToken());
	}
	
	@Test
	void REM1() throws DoubleArcException {
        PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place p1 = pN1.addPlace(0);
		Place p2 = pN1.addPlace(2);
		Place p3 = pN1.addPlace(2);
		Transition t1 = pN1.addTransition();
		ArcEnteredNormal arcEnteredNormal1 = pN1.addArcEnteredNormal(p1, t1, 1);
		ArcEnteredNormal arcEnteredNormal2 = pN1.addArcEnteredNormal(p2, t1, 1);
		ArcLeft arcLeft = pN1.addArcLeft(p3, t1, 3);
		
		pN1.connectTransition2ArcEntered(t1, arcEnteredNormal1);
		pN1.connectTransition2ArcEntered(t1, arcEnteredNormal2);
		pN1.connectTransition2ArcLeft(t1, arcLeft);
		
		pN1.fire();
		
		Assertions.assertEquals(0, p1.getToken());
		Assertions.assertEquals(2, p2.getToken());
		Assertions.assertEquals(2, p3.getToken());
	}
	
	@Test
	void SP0() {
        PetriNetworkImpl pN1 = new PetriNetworkImpl();
		
		Place p1 = pN1.addPlace(5);
		Place p2 = pN1.addPlace(9);
		Place p3 = pN1.addPlace(0);

		pN1.deletePlace(p1);

		Assertions.assertEquals(2, pN1.getPlaceSetSize());
	}
	
	@Test
	void ST1() throws DoubleArcException {
        PetriNetworkImpl pN2 = new PetriNetworkImpl();
		
        Place p1 = pN2.addPlace(1);
		Transition t1 = pN2.addTransition();
		ArcEnteredNormal arcEnteredNormal = pN2.addArcEnteredNormal(p1, t1, 1);
		
		pN2.connectTransition2ArcEntered(t1, arcEnteredNormal);
		
		pN2.deleteTransition(t1);
		
		Assertions.assertEquals(0, pN2.getTransitonSetSize());
		Assertions.assertEquals(0, pN2.getArcSetSize());
	}
	
	@AfterEach
	void tearThis() {
		System.out.println("@AfterEach executed");
	}
	
	@AfterAll
	static void  tear() {
		System.out.println("@AfterAll executed");
	}

}
