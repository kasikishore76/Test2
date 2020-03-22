
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.display();
	   
		
		
		
		
		

	}

}

class animal
{
	
	 public void display(){
	System.out.println("parent class");
}
}
class Dog extends animal{
	
	 public void display(){
		System.out.println("child class");
		super.display();
		
	}
}