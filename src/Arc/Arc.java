package Arc;

import PetriNetwork.Place;
import PetriNetwork.Transition;


public class Arc {
	
	private String name;
	private Place place;
	private Transition transition;
	private int tokenInArc;
	
	public Arc(String name, Place place, Transition transition) {
		super();
		this.name = name;
		this.place = place;
		this.transition = transition;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arc other = (Arc) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arc [name=" + name + ", place=" + place + ", transition=" + transition + "]";
	}
	
	
	
}
