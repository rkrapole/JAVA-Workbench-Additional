package additonalPackage;

public class InstanceVariables {
	
	int a = 11, b = 14, c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariables obj1 = new InstanceVariables();
		
		obj1.c = obj1.a+obj1.b;
		System.out.println("sum of a, b: " +obj1.c);

	}

}
