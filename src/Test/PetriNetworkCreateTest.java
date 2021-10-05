/**
 * 
 */
package Test;

import org.junit.Test;

import PetriNetwork.PetriNetworkImpl;

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
		
		pN1.addArcEnteredNormal("arc1", "place1", 1, "transition1");
		
		System.out.println(pN1);
		
	}

}
