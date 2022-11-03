package com.infinite.lambda;

interface IHello{
	void sayHello();
}
interface ICal{
	int cal(int a, int b);
}
public class Lamdafuc {
public static void main(String[] args) {
	IHello obj1=() ->{
		System.out.println("welcome to jdk");	
	};
	obj1.sayHello();
	
	ICal obj2=(a,b) ->{
		return a+b;
	};
	System.out.println("sum is"+ obj2.cal(2, 3));
	ICal obj3=(a,b) ->{
		return a-b;
	};
	System.out.println("sub is"+ obj3.cal(2, 3));
}
}
