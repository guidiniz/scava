package com.padual.scava;

import java.text.MessageFormat;

import org.springframework.stereotype.Component;

@Component
public class BeanA {

	public String getSometext() {
		String msg = MessageFormat.format("{0}, written in Java", this.getClass().getSimpleName());
		return msg;
	}
}
