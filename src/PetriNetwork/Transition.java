package PetriNetwork;

import java.util.HashSet;
import java.util.Set;

import Arc.Arc;


public class Transition {
	
	private Set<Arc> arcSet;

	

	public Transition() {
		super();
		arcSet = new HashSet();
		
	}

	public boolean isTriggerable(){
		//haveEnoughToken
		return true;
		
	}
	
	public void doFire(){
		for(Arc arc : arcSet){
			arc.doChange();
		}
	
		
	}
	
	public void addArc(Arc arc){
		arcSet.add(arc);
	}

	public void removeArc(Arc arc) {
		arcSet.remove(arc);
	}
	
	

}
