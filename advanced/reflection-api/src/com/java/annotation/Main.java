package com.java.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		MinhaClasse mc = new MinhaClasse();
		
		executar(mc);
		
	}
	
	// Método que executa apenas os métodos que possuem a Annotation Executar em MinhaClasse
	private static void executar(MinhaClasse mc) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<MinhaClasse> c = MinhaClasse.class;
		
		Method[] methods = c.getDeclaredMethods();
		
		for (Method method : methods) {
			
			Executar annotation = method.getDeclaredAnnotation(Executar.class);
			
			if (annotation != null) {
				String arg = annotation.value();
				method.invoke(mc, arg);
			}
		}
	}

}
