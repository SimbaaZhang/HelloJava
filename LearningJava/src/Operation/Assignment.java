package Operation;

/*
 * 测试对象引用
 * */

class Test{
	int value;
}

public class Assignment {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		t1.value = 1;
		t2.value = 2;
		System.out.println("t1 value = " + t1.value + " t2 value = " + t2.value);
		t1 = t2;
		System.out.println("t1 value = " + t1.value + " t2 value = " + t2.value);
		t1.value = 3;
		System.out.println("t1 value = " + t1.value + " t2 value = " + t2.value);
		
	}
}
