package kosta.cons;

public class Car {
	String model;
	char color; //'W', 'B'
	float price;
	Engine engine;
	
	//�����ڸ� 3�� �ۼ�
	public Car() {	}

	public Car(String model, char color, float price, Engine engine) {
		this.model = model;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}

	public Car(String model, char color, float price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	
	public String getDetails() {
		return model+"\t"+color+"\t"+price;
	}
//�߰�..
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}














