package java07;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CellPhone {

	String model;
	String number;
	int chord;

	public void setNumber(String n) {
		number = n;
	}
	
	public String getModel() {
		return model;
	}
	
	public int setChord() {
		return chord;
	}
	
	private String getNumber() {
		return number;
	}
	
}// class
	
public class MP3Phone extends CellPhone {
		int size;
		public MP3Phone (String model, String num, int chord, int size) {
			this.model = model;
			number = num;
			this.chord = chord;
			
			this.size = size;
		
	}
}

