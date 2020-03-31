package com.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  // Se aplica a métodos
@Retention(RetentionPolicy.RUNTIME)  // Verficada em tempo de execução
public @interface Executar {
	String value();
}
