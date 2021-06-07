package abstract_demo;

public class User {

	public static void main(String[] args) {
		Animal[] ani = new Animal[3];
		
		ani[0] = new Dog();
		ani[1] = new Cat();
		ani[2] = new Lion();
		
		for(Animal a: ani) {
			a.demo();
			a.respire();
			a.talk();
		}
	}

}
