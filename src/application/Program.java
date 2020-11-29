package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import generics.demilitado.entities.Product;

public class Program {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		PrintService<Integer> ps = new PrintService<>();
//
//		System.out.println("How many values?");
//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			Integer value = sc.nextInt();
//			ps.addValue(value);
//		}
//
//		ps.print();
//		System.out.println("First: " + ps.first());
//		sc.close();
//
//		System.out.println("----------------------------------------");
//		List<Integer> myInts = Arrays.asList(1, 2, 3);
//		List<Double> myDouble = Arrays.asList(2.50, 10.66);
//		List<Object> myObject = new ArrayList<>();
//
//		copy(myInts, myObject);
//		printList(myObject);
//		copy(myDouble, myObject);
//		printList(myObject);

//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

//		System.out.println(set.contains("Notebook"));

//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) >= 3);

		for (String string : set) {
			System.out.println(string);
		}

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
//		UNION
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);		
		
//		INTERSECTION
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);		
		
//		DIFERENCE
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		Set<Product> prod = new TreeSet<>();
		
		prod.add(new Product("TV", 900.0));
		prod.add(new Product("Notebook", 1200.0));
		prod.add(new Product("Tablet", 400.0));
		
		for (Product product : prod) {
			System.out.println(product.toString());
		}
		
		
	}

	private static void printList(List<?> lst) {
		for (Object object : lst) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

	private static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number object : source) {
			destiny.add(object);
		}
	}
}
