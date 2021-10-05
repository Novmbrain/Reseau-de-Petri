package PetriNetwork;

public interface PetriNetwork {
	public void addPlace(String placeName);
	
	public void deletePlace(String placeName);
	
	public void addArc(String arcName);
	
	public void addArcZero(String arcName, String placeName, int initialTokenPlace, String transitionName);
	
	public void addArcVideur(String arcname, String placeName, int initialTokenPlace, String transitionName);
	
	public void addArcEnteredNormal(String name, String placeName, int initialTokenPlace, String transitionName);
	
	public void deleteArc(String arcName);
	
	public void addTransition(String transitionName);
	
	public void deleteTransition(String transitionName);
	
	public void changeArcToken(String arcName, int newToken);
	
}
