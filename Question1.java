package in.ineuron.main;

class Animal {
		public void makeSound() {
			System.out.println("Animal Sound");
		}

	}
class Dog extends Animal{
		public void makeSound() {
			System.out.println("Bow Bow");
		}
	}
class Cat extends Animal{
		public void makeSound() {
			System.out.println("Meow Meow");
		}
		
	}
class Cow extends Animal{
		public void makeSound() {
			System.out.println("Amba Amba");
		}
		
	}
public class Question1{
		public static void main(String args[]) {
			Animal a=new Dog();
			Animal a1=new Cat();
			Animal a2=new Cow();
			
			a.makeSound();
			a1.makeSound();
			a2.makeSound();
		}
	}
