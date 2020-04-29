package com.java.invocacao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Aplicacao {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<Televisao> tvClass = Televisao.class;

		// Obtendo todos atributos da classe
		Field[] fields = tvClass.getDeclaredFields();

		System.out.println("ATRIBUTOS");
		for (Field field : fields) {
			System.out.println(field.getType() + " " + field.getName());
		}

		System.out.println();

		// Obtendo todos os métodos da classe
		Method[] methods = tvClass.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println(method.getGenericReturnType() + " " + method.getName() + " "
					+ Arrays.deepToString(method.getParameterTypes()));
		}
		
		System.out.println();
		
		// Obtendo  e invocar um método
		Televisao tv = new Televisao();
		Method mudarCanal = tvClass.getDeclaredMethod("mudarCanal", int.class);
		mudarCanal.invoke(tv, 10);
		
		Method ligarTv = tvClass.getDeclaredMethod("ligar");
		ligarTv.invoke(tv);
	}

}
