package kosta.cons;

public class Engine {
	String brandName;
	int life;
	
	
	public Engine(String brandName, int life) {
		this.brandName = brandName;
		this.life = life;
	}

	/*public String getBrandName() {
		return brandName;
	}

	public int getLife() {
		return life;
	}*/
	
	public String getEngineInfo() {
		return brandName+", "+life;
	}
	
}








