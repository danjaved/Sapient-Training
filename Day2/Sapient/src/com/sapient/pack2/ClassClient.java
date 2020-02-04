package com.sapient.pack2;

import com.sapient.pack1.PublicClass;

public class ClassClient extends PublicClass {
	public static void main(String[] args) {
		ClassClient obj=new ClassClient();
		obj.publicMethod();
		obj.protectedMethod();
		//obj.defaultMethod();
		//obj.privateMethod();

	}
}