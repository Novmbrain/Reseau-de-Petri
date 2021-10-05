package PetriNetwork;

public class Place {
	private int token;
	private String name;
	
	
	
	public Place(String name) {
		super();
		this.name = name;
		this.token = 0;
	}
	

	public Place(int token, String name) {
		super();
		this.token = token;
		this.name = name;
	}


	public void addToken(int number){
		
	}
	
	public void decreaseToken(int number){
		
	}
	
	public boolean calculateToken(int tokenInArc){
		return false;
	}

	public int getToken() {
		return token;
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
		Place other = (Place) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Place [token=" + token + ", name=" + name + "]";
	}
	
	
	
	
	
}
