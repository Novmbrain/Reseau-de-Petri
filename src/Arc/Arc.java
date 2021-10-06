package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class Arc {
	
	private Place place;
	private Transition transition;
	private int tokenInArc;
	
	public Arc(Place place, Transition transition) {
		super();
		this.place = place;
		this.transition = transition;
	}

	public Arc(Place place, Transition transition, int tokenInArc) {
		super();
		this.place = place;
		this.transition = transition;
		this.tokenInArc = tokenInArc;
	}
	
	public boolean haveEnoughToken(){
		
		return false;
	}
	
	public void doChange(){
		
	}

	public Place getPlace() {
		return place;
	}

	public Transition getTransition() {
		return transition;
	}

	public int getTokenInArc() {
		return tokenInArc;
	}
	
	
	
}
