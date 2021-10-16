package Test;

import org.junit.Test;

import PetriNetwork.PetriNetwork;
import PetriNetwork.PetriNetworkImpl;
import PetriNetwork.Transition;

public class ShowTest {
	@Test
	public void AT1() {
		PetriNetwork pN1 = new PetriNetworkImpl();
		pN1.addTransition();
		Transition transition = new Transition();
		System.out.println(pN1.show());
	}

}
