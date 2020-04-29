package com.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		BankAccount acc = new BankAccount("1234");

		// Imprime o nome da classe passando um objeto
		ClassInstance.showName(acc);

		// Imprime o nome da classe passando a classe
		ClassInstance.showName(BankAccount.class);

		// Imprime o nome da classe passado o FullyQualifiedName
		Class<?> c = Class.forName("com.model.BankAccount");
		ClassInstance.showName(c);

		// Exibe informações da classe
		ClassInstance.classInfo(BankAccount.class);

		// Invocação de método
		Method m = c.getMethod("getId");
		Object obj = m.invoke(acc);
		System.out.println(obj);
	}

}
