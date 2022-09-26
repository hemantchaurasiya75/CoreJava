package functionalinterface;

@FunctionalInterface  
interface sayable{  
    void say(String msg);  
}  
public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");
        
        //sayable ref = (name) -> System.out.println(name);
        //ref.say("Hridesh");
    }  
}  
