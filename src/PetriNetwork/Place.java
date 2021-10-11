package PetriNetwork;

public class Place {
	private int token;

	public Place(int token) {
		super();
		this.token = token;
	}


	public void addToken(int number){
		token += number;
		
	}
	
	
	public void fireChangeToken(int number){
		token += number;
	}
	
	public boolean calculateToken(int tokenInArc){
		return false;
	}

	public int getToken() {
		return token;
	}


	

	
}
