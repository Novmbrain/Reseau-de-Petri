package Test;

import org.junit.Test;

import Arc.ArcEnteredNormal;
import Arc.ArcLeft;
import Exception4PetriNetwork.DoubleArcException;
import PetriNetwork.PetriNetwork;
import PetriNetwork.PetriNetworkImpl;
import PetriNetwork.Place;
import PetriNetwork.Transition;


public class ShowTest {
	
	/**
	 * 
	 * @author Yuhua XIN
	 * @throws DoubleArcException
	 */
	@Test
	public void AA1() throws DoubleArcException {
		System.out.println("\n----------AA1 Test----------");
		PetriNetwork pN1 = new PetriNetworkImpl();
		Place place = pN1.addPlace(2);	
		Transition transition = pN1.addTransition();
		ArcEnteredNormal arcEnteredNormal = pN1.addArcEnteredNormal(place, transition, 2);
		pN1.connectTransition2ArcEntered(transition, arcEnteredNormal);
		
		System.out.println(pN1.toString());
	}
	/**
	 * 
	 * @author Yuhua XIN
	 */
	@Test
	public void AP1() {
		System.out.println("\n----------AP1 Test----------");
		PetriNetwork pN1 = new PetriNetworkImpl();
		Place place = pN1.addPlace(0);	
		
		System.out.println(pN1.show());
	}
	
	/**
	 * 
	 * @author Yuhua XIN
	 */
	@Test
	public void AP2() {
		System.out.println("\n----------AP2 Test----------");
		PetriNetwork pN1 = new PetriNetworkImpl();
		Place place = pN1.addPlace(2);	
		Transition transition = pN1.addTransition();
		ArcEnteredNormal arcEnteredNormal = pN1.addArcEnteredNormal(place, transition, 2);
		System.out.println(pN1.show());
	}
	
	/**
	 * 
	 * @author Wenjie FU
	 */
	@Test
	public void AR1() throws DoubleArcException {
		System.out.println("\n----------AR1 Test----------");
		PetriNetwork pN1 = new PetriNetworkImpl();
		Transition transition = pN1.addTransition();
		Place placeLeft = pN1.addPlace(4);		
		Place placeRight = pN1.addPlace(0);
		ArcEnteredNormal arcEnteredNormal = pN1.addArcEnteredNormal(placeLeft, transition, 1);
		ArcLeft arcLeft = pN1.addArcLeft(placeRight, transition, 0);
		
		pN1.connectTransition2ArcEntered(transition, arcEnteredNormal);
		pN1.connectTransition2ArcLeft(transition, arcLeft);
		
		System.out.println(pN1.show());
	}
	/**
	 * 
	 * @author Wenjie FU
	 */
	@Test
	public void AT1() {
		System.out.println("\n----------AT1 Test----------");
		PetriNetwork pN1 = new PetriNetworkImpl();
		pN1.addTransition();
		Transition transition = new Transition();
		
		System.out.println(pN1.show());
	}
	/**
	 * 
	 * @author Wenjie FU
	 */
	@Test
	public void AT2() throws DoubleArcException {
		System.out.println("\n----------AT2 Test----------");
		PetriNetwork pN1 = new PetriNetworkImpl();
		Transition transition = pN1.addTransition();
		Place place = pN1.addPlace(0);		
		ArcEnteredNormal arcEnteredNormal = pN1.addArcEnteredNormal(place, transition, 1);
		pN1.connectTransition2ArcEntered(transition, arcEnteredNormal);

		System.out.println(pN1.show());
	}
	


	
	

}
