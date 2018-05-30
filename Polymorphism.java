package Sample;

public class Polymorphism {
    public static void main(String[] args){
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
        Animal obj3 = new Horse();
        obj1.shout(); //output is bark..
        obj2.shout(); //output is bark..  
         obj3.shout();
    		}   
}

class Animal{
    public void shout(){
        System.out.println("Parent animal's shout");
    		}       
}

class Dog extends Animal{
    public void shout(){
        System.out.println("bark..");
    		}
}

class Cat extends Animal{
    public void shout(){
        System.out.println("Meaw..");
   		 }
}

class Horse extends Animal{
    	public void shout(){
        System.out.println("neigh");
    		}
}
