
public class RunnableExample {
	
	public static void main(String args[]){
		Thread mythread =new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("Inside Runnable Thread");
				
			}
			
		});
		
		mythread.run();
		
		
		//Now Lambdas can be used here
		Thread LambdaThread = new Thread(()->{
			System.out.println("Inside Lambda Thread ");
		});
		
		LambdaThread.run();
		
		//Just see the interface logic to implement Lambda 
		//See the huge Backward Compatiblity here 
		
		/*
		 * Lambda Types can only be used with Functional Interrface
		 * Functional Interface will contain only one function 
		 *	One and Only One 
		 * 
		 * 
		 * 
		 */
	}

}
