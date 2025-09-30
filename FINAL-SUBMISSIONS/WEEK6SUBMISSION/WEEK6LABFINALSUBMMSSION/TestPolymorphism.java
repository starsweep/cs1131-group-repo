class TestPolymorphism {
	public static void main(String[] args){

		Animal b = new Birb();
		b.sound();

		Dog a;
		a = new Dog();
		a.sound();
		

		Cat c = new Cat();
		c.sound();
	

	}

}
