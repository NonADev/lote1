package lote_funcional;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Ex_44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble(), b = s.nextDouble();
		String cont = ""+a;
		for (; b > 1; b--) {
			cont += "*" + a;
		}
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			System.out.println(engine.eval(cont));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
