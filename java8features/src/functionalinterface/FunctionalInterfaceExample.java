package functionalinterface;
  
public class FunctionalInterfaceExample implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }
    
    public static void main(String[] args) {  
    	Sayable fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");
    }  
}  
