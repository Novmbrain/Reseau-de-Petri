/**
 * 
 */
package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;

/**
 * @Description
 * @author wenjie fu email:wjfuxidian@163.com
 * @version
 * @date 2021骞�10鏈�5鏃ヤ笂鍗�9:55:35
 * 
 */
public class ArcEnteredNormal extends ArcEntered {
	
	private int tokenInArc;

	public ArcEnteredNormal(Place place, Transition transition) {
		super(place, transition);
	}


	public ArcEnteredNormal(int tokenInArc, Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
		this.tokenInArc=tokenInArc;
	}
	

}
