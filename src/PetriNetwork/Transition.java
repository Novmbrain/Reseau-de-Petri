package PetriNetwork;

import java.util.LinkedList;

import Arc.Arc;


public class Transition {
	
	private LinkedList<Arc> arcs;
	private String name;
	
	
	public Transition(String name) {
		super();
		this.name = name;
		arcs = new LinkedList<Arc>();
	}

	public boolean isTriggerable(){
		return false;
		
	}
	
	public void doFire(){
		
	}
	
	public void addArc(Arc arc){
		
		
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
		Transition other = (Transition) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transition [name=" + name + "]";
	}
	
	

}
