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
 * @date 2021骞�10鏈�5鏃ヤ笂鍗�9:54:44
 * 
 */
public class ArcLeft extends Arc{
	
	private int tokenInArc;

	public ArcLeft(int tokenInArc, Place place, Transition transition) {
		super(place, transition);
		// TODO Auto-generated constructor stub
		this.tokenInArc=tokenInArc;
	}

}
