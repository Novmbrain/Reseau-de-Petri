package PetriNetwork;

import java.util.HashSet;
import java.util.Set;

import Arc.Arc;
import Arc.ArcVideur;


public class Transition {
	
	private Set<Arc> arcSet;

	

	public Transition() {
		super();
		arcSet = new HashSet();
		
	}

	public boolean isTriggerable(){
		//haveEnoughToken
		for(Arc arc : arcSet){
			if(!arc.haveEnoughToken()){
				return false;
			}
		}
		return true;
		
	}
	
	public void doFire(){
		//should first empty place, expacially for the moste simple case(one place one transition)  
		for(Arc arc : arcSet){
			if((arc instanceof ArcVideur)){
				arc.doChange();	
			}
		}
		
		for(Arc arc : arcSet){
			if(!(arc instanceof ArcVideur)){
				arc.doChange();	
			}
		}
		
	}
	
	public void addArc(Arc arc){
		arcSet.add(arc);
	}

	
	

}
