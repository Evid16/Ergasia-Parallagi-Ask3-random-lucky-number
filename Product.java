package gr.texnikes.rest.texnikes;

public class Product{
	
	private String message;
	private int num;
	
	public Product(String message, int num){
		
		super();
		this.message = message;
		this.num = num; 
		
	}
	
	
	public String getMessage(){
		
		return message;
		
	}

	public void setMessage(String message){
		
		this.message = message;
		
	}

	public int getNumber(){
		
		return num;
		
	}

	public void setNumber(int num){
		
		this.num = num;
		
	}
	
}
