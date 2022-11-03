package com.infinite.lambda;


@FunctionalInterface
interface IConvert{
	double convert(double c);
}
public class FunctionalInterface1 {
	public static void main(String[] args) {
		IConvert obj=(c)->{
			return c+22;
		};

		System.out.println("func"+ obj.convert(3));
		
	IConvert ob1=(v)->{
		return v-2;
	};
	System.out.println("func"+ob1.convert(22));
	}
}

