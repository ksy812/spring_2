package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1 호출");
	}
	
	public void method2() {
		System.out.println("method2 호출");
	}
	
	public void method3() {
		System.out.println("method3 호출");
		int a = 10/0;
	}
}
