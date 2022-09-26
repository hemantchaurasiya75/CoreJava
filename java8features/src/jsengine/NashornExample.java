package jsengine;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornExample {

	public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("C:\\Users\\Hridesh\\eclipse-workspace_29\\java8features\\src\\jsengine\\hello.js"));  
    }
}
