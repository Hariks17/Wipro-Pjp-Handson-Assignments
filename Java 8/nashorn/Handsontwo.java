package nashorn;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class Handsontwo {
public static void main(String args[]) throws ScriptException, FileNotFoundException {
	ScriptEngineManager manager=new ScriptEngineManager();
	ScriptEngine engine=manager.getEngineByName("nashorn");
	FileReader fr=new FileReader("H:\\Wipro\\Pdfs\\Wipro\\Sample.js");
	engine.eval(fr);
	
}
}
