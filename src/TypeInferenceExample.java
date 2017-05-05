
public class TypeInferenceExample {
	
	public static void main(String args[]){

	myInference giveMelength = (String s) ->   s.length(); 
	
	System.out.println(giveMelength.getLength("Rajat"));
	
	}
	
}
interface myInference{
	public int getLength(String s);
}
