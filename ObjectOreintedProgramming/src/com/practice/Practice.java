package com.practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Test {

	void m1();

	public String toString();

	public int hashCode();

	public boolean equals(Object obj);

}

class Accept<T> {

	private T t;

	public Accept(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

}

class Student {

	private int sid;
	private String sName;

	public Student(int sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}

}

public class Practice implements Test {

	public static void main(String[] args) {

		Predicate<Integer> eoro = (Integer x) -> x % 2 == 0;
		System.out.println("The number is even :" + eoro.test(123));

		Predicate<Integer> person = (Integer x) -> x >= 18;
		System.out.println("Are you eligible for vote :" + person.test(18));

		Predicate<String> name = (String x) -> x.equals("Faizan");
		System.out.println("My name is faizan :" + name.test("Faiz"));

		Predicate<Integer> year = (Integer x) -> x % 4 == 0;
		System.out.println("It is a leap year :" + year.test(2024));

		Predicate<String> check = (String x) -> x.startsWith("F");
		System.out.println("Start with F :" + check.test("Faizan"));

		Consumer<String> c = (String x) -> System.out.println(x);
		c.accept("Hi my name is faizan");

		Consumer<Integer> i = (Integer x) -> System.out.println(x);
		i.accept(101);

		Consumer<Student> s = (Student x) -> System.out.println(x);
		s.accept(new Student(101, "Faizan"));

		Function<Integer, Integer> fn1 = num -> {

			return num * num * num;
		};

		System.out.println("Cube of a number is :" + fn1.apply(5));

		Function<String, Boolean> f = (String x) -> x.startsWith("F");
		System.out.println(f.apply("Faizan"));

		Function<String, Integer> o = (String x) -> x.length();
		System.out.println(o.apply("India"));

		String str[] = { "Java", "Python", "Naresh", "IT" };

		Predicate<String> prediacte = p -> p.endsWith("va");

		for (String s1 : str) {
			if (prediacte.test(s1))
				System.out.println(s1);
		}

		Supplier<Student> std = () -> new Student(103, "Faizan");
		System.out.println(std.get());

		Supplier<Double> num2 = () -> Math.random();
		System.out.println(num2.get());

		Consumer<String> c2 = (a) -> System.out.println(a.toLowerCase());
		c2.accept("NareshIT");

		Supplier<Customer2> c3 = () -> new Customer2(101, "Faizan", 12000.56);
		Customer2 customer2 = c3.get();
		System.out.println(customer2.getCustomerBill());
		System.out.println(customer2);

		Supplier<Customer2> c4 = () -> {

			Customer2 cc = new Customer2(102, "Zeeshan", 10000.50);

			return cc;
		};

		Customer2 customer22 = c4.get();
		System.out.println(customer22.getCustomerBill());
		System.out.println(customer22);

		Supplier<Object> ss = () -> 12 + 12 + "Hi" + 14 + 14;
		Object string = ss.get();
		System.out.println(string);

		final double PI = 3.14;

		Function<Double, Double> area = radius -> PI * radius * radius;

		System.out.println("Area of Circle :" + area.apply(4.0));

		int a = 100;
		String st = "" + a;
		System.out.println("LEnght :" + st.length());

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return null;

	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		return false;

	}

}

class Customer2 {
	private int customerId;
	private String customerName;
	private double customerBill;

	public Customer2(int customerId, String customerName, double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

	public double getCustomerBill() {
		return this.customerBill;
	}
}

/*
 * Predicate Functional Interface <T>
 * 
 * @FunctionalInterface public interface predicate <T> {
 * 
 * boolean Test(T x);
 * 
 * }
 * 
 * Consumer Functional Interface <T>
 * 
 * @Functional Interface public interface Consumer <T> {
 * 
 * void accept(T x);
 * 
 * }
 * 
 * function functional interface
 * 
 * @Functional INterface public interface Function <T,R> {
 * 
 * R apply(T x);
 * 
 * }
 */
