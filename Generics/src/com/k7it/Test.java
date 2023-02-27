package com.k7it;

class Test<T> {

	void print(T i, T j) {
		System.out.println(i + ":" + j);
	}

	public static void main(String[] args) {
		Test<Integer> t1 = new Test<Integer>();
		t1.print(20, 30);

		Test<String> t2 = new Test<>();
		t2.print("Java", "K7iT");
		
		Test<Double> t3 = new Test<>();
		t3.print(10.25, 20.35);
	}

}
