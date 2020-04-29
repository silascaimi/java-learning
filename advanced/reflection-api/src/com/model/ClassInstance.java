package com.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassInstance {

	public static void showName(Class<?> theClass) {
		System.out.println(theClass.getSimpleName());
	}

	public static void showName(Object obj) {
		Class<?> c = obj.getClass();
		showName(c);
	}

	public static void getSuperClasses(Class<?> c) {
		Class<?> superclass = c.getSuperclass();

		while (superclass != null) {
			showName(superclass);
			superclass = superclass.getSuperclass();
		}
	}

	public static void getInterfaces(Class<?> c) {
		Class<?>[] interfaces = c.getInterfaces();

		for (Class<?> i : interfaces) {
			showName(i);
		}
	}

	public static void getModifiers(Class<?> c) {
		int modifier = c.getModifiers();
		List<String> modifiers = new ArrayList<>();

		if (Modifier.isFinal(modifier)) {
			modifiers.add("final");
		}

		if (Modifier.isPrivate(modifier)) {
			modifiers.add("private");
		} else if (Modifier.isProtected(modifier)) {
			modifiers.add("protected");
		} else if (Modifier.isPublic(modifier)) {
			modifiers.add("public");
		}

		System.out.println(modifiers.toString());
	}

	public static void fieldInfo(Class<?> c) {
		Field[] fields = c.getFields();
		displayFields(fields);

		Field[] declaredFields = c.getDeclaredFields();
		displayFields(declaredFields);
	}

	private static void displayFields(Field[] fields) {
		for (Field field : fields) {
			System.out.println(field.getName() + " " + field.getType());
		}
	}

	public static void methodInfo(Class<?> c) {
		Method[] methods = c.getMethods();
		displayMethods(methods);
//		Method[] declaredMethods = c.getDeclaredMethods();
//		displayMethods(declaredMethods);
	}

	private static void displayMethods(Method[] methods) {
		for (Method method : methods) {
			System.out.println(method.getName() + " " + Arrays.toString(method.getParameters()));
		}
	}

	public static void classInfo(Class<?> c) {
		// Exibe o nome da classe
		System.out.println("Nome");
		showName(c);

		// Exibe as superclasses
		System.out.println("Super Classes");
		getSuperClasses(c);

		// Exibe as interfaces
		if (c.getInterfaces().length > 0) {
			System.out.println("Interfaces");
			getInterfaces(c);
		}

		// Exibe os modificadores
		System.out.println("Modificadores");
		getModifiers(c);

		// Exibe os atributos
		if (c.getFields().length > 0 || c.getDeclaredFields().length > 0) {
			System.out.println("Fields");
			fieldInfo(c);
		}

		// Exibe os métodos
		System.out.println("Métodos");

		methodInfo(c);
	}
}
