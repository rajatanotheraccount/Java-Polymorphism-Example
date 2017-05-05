
public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter g=new Greeter();
		HelloWorldGreeting hg=new HelloWorldGreeting();
		//Typical Implementation of Java Polymorphism 
		//Like in one of project i worked the team used this approach 
		//They created AadharScan Interface that performs some set of implementation 
		//Like scanning ,creating pidxml and other stuff
		//This Interface implementation will be different for Mantra and different for Morpho Scanner
		//Thus we are passig behaviour here everytime which keeps on changing everytime based on the device morpho and mantra
		
		
		g.greet(hg);   //This will greet from Class that we created HelloWorldGreeting
		
		
		//Now we will create a Lambda Expression here
		Greeting function_name = ()->{
			//do something here 
			System.out.println("Hello World from  inside Lambda Expression in Java");
		};
		
		function_name.perform();//Executing a Lambda Express
		
		
		//If you see Lambda Expression is Syntactical Sugar for Anonymous Inner Class
		//But Somehow Lambda Expression is not a short cut for Anonymous Class 
		//It has it's own some cool functions and things
		
		//The Same Concept is implied in Inner Class which 
		//This is called as Anonymous Inner class
		Greeting inner_greeting=new Greeting(){
			public void perform(){
				System.out.println("Hello World from Inner Class");
			}
		};
		
		inner_greeting.perform();//Execute the Inner Class function..Notice that it is Interface that contains Implementation
		
	
		
	}
	public void greet(Greeting greet){
		
		greet.perform();
		
	}
	
}

