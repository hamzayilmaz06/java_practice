package hastane;

public class Case {
	private String actualCase;
	private boolean emergency;
	
	public void setActualCase(String actualCase){
		this.actualCase = actualCase;
	}
	public String getActualCase(){
		return this.actualCase;
	}

	public void setEmergency(boolean emergency){
		this.emergency = emergency;
	}
	public boolean getEmergency(){
		return this.emergency;
	}
}
