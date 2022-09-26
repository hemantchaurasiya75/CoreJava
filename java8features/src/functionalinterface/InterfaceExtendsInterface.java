package functionalinterface;

interface sayable1{  
    void say(String msg);   // abstract method  
}  

//@FunctionalInterface // Invalid: Error is '@FunctionalInterface' annotation; Doable is not a functional interface  
interface Doable extends sayable1{  
    void doIt();  
}  
