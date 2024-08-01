package com.numbers;

import java.util.function.Supplier;

public class FibbonancySeries {

	public static void main(String[] args) {

		Supplier<Integer> f = new Supplier<Integer>() {
			private int f1 = 0, f2 = 1, current = 0;
			private int n = 10;

			@Override
			public Integer get() {
				
				if (current < n) {
					int result = f1;
					int next = f1 + f2;
					f1 = f2;
					f2 = next;
					current++;
					return result;
					
				} else {
					throw new IllegalStateException("No more elements in the Fibonacci series.");
				}
			}
		};

		int n = 10;

		for (int i = 0; i < n; i++) {
			System.out.print(f.get() + " ");
		}
	}
}
