package methodreference;

interface Messageable{  
    Message getMessage(String msg);  
}  

class Message{ 
	
	public Message() {
		System.out.println("No arg called");
	}
	
    public Message(String msg){
    	System.out.println("Arg called");
        System.out.print(msg);  
    }  
} 



public class ConstructorReference {
	public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello");
        
        
    }  
}
