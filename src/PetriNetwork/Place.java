package PetriNetwork;

public class Place {
	public final static int FLAGARCZERO = 0;
	public final static int FLAGARCVIDEUR = -1;
	
	
	private int token;
	
	public Place() {
		token = 0;
	}


	public Place(int token) {
		super();
		this.token = token;
	}


	public void addToken(int number){
		token += number;
		
	}
	

	public void fireDecreaseToken(int number){
		switch(number){
			case FLAGARCVIDEUR :
				token -= token;
				break;
			case FLAGARCZERO :
				token = token;
				break;
			default:
				token -= number;
				break;				
		}
	}
	
	public void fireAddToken(int number){
		token += number;
	}
	
	public boolean calculateToken(int tokenInArc){
		return false;
	}

	public int getToken() {
		return token;
	}


	@Override
	public String toString() {
		if(token < 0) {
			return "place avec " + token+"(negative)" + " tokens\n";
		}
		return "place avec " + token + " tokens\n";
	}	
	
	

	
}
