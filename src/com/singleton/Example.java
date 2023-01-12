package com.singleton;

//1. Create a class as Example and make static member
public class Example implements Cloneable {
	
	private static Example example;
	
	//2. Make a class constructor as private 
	
	private Example() {
		
	}
	
	//3.Cretae a method to check object is null or not
	
	//make a method as Synchronized 
	
	public static Example getExampleObject() {
		synchronized(Example.class) {
		if(example==null) {
			 example= new Example();
		}
		else {
			return example;
		}
		}
		
		return example;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return example;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Example obj1= getExampleObject();
	    Example obj2=(Example)obj1.clone();
//	    Example obj3=getExampleObject();
//	    Example obj4=getExampleObject();
	
	    System.out.println("Object 1>>"+obj1.hashCode());

	    System.out.println("Object 2 >>"+obj2.hashCode());
	 
//	    System.out.println("Object 3 >>"+obj3.hashCode());
//	    
//	    System.out.println("Object 4>>"+obj4.hashCode());
//	
	}

}
