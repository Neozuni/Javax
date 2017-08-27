package pizza.test;

import java.util.Vector;

import pizza.child.BulgogiPizza;
import pizza.child.PineApplePizza;
import pizza.child.PotatoPizza;
import pizza.parent.Pizza;
import pizza.service.PizzaService;

public class PizzaServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaService service = new PizzaService();
		Vector<Pizza> v = new Vector<Pizza>(20,1);
		//객체 생성의 밥법을 확인 하려면 ...
		//api doc 에서 cunstructor summary를 참조하라
		
		
		//
		v.add(new PotatoPizza(15000,"pizzahut"));
		v.add(new BulgogiPizza(18000,"mrpizza"));
		v.add(new PineApplePizza(16000,"papajs"));
		v.add(new PotatoPizza(130000,"59pz"));
		
		System.out.println(v.size());//4
		System.out.println(v.capacity());//10
		
		service.allKindMakePizza(v);
		
	}

}
