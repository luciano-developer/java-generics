package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import generics.demilitado.entities.LogEntries;
import generics.demilitado.entities.Product;
import generics.demilitado.entities.User;

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
//		Set<String> set = new LinkedHashSet<>();
//
//		set.add("TV");
//		set.add("Notebook");
//		set.add("Tablet");
//
////		System.out.println(set.contains("Notebook"));
//
////		set.removeIf(x -> x.length() >= 3);
//		set.removeIf(x -> x.charAt(0) >= 3);
//
//		for (String string : set) {
//			System.out.println(string);
//		}
//
//		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
//		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
//
////		UNION
//		Set<Integer> c = new TreeSet<>(a);
//		c.addAll(b);
//		System.out.println(c);
//
////		INTERSECTION
//		Set<Integer> d = new TreeSet<>(a);
//		d.retainAll(b);
//		System.out.println(d);
//
////		DIFERENCE
//		Set<Integer> e = new TreeSet<>(a);
//		e.removeAll(b);
//		System.out.println(e);
//
//		Set<Product> prod = new TreeSet<>();
//
//		prod.add(new Product("TV", 900.0));
//		prod.add(new Product("Notebook", 1200.0));
//		prod.add(new Product("Tablet", 400.0));
//
//		for (Product product : prod) {
//			System.out.println(product.toString());
//		}
//
////		EXERCICIO 1
//		System.out.println();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter full path: ");
//		String path = sc.next();
//
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			Set<LogEntries> setLog = new HashSet<>();
//			String line = br.readLine();
//			while (line != null) {
//				String[] fields = line.split(" ");
//				String name = fields[0];
//				Date moment = Date.from(Instant.parse(fields[1]));
//				setLog.add(new LogEntries(name, moment));
//				line = br.readLine();
//			}
//			System.out.println("Totl users: " + setLog.size());
//
//		} catch (Exception e2) {
//			// TODO: handle exception
//		} finally {
//			sc.close();
//		}

//	EXERCICIO 2 
//		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		Set<User> users = new HashSet<>();
//		System.out.print("How many students for course A? ");
//		int a = sc.nextInt();
//		
//		for (int i = 1; i <= a; i++) {
//			int unique = sc.nextInt();
//			users.add(new User(unique));
//		}
//		
//		System.out.print("How many students for course B: ");
//		int b = sc.nextInt();
//		
//		for (int i = 1; i <= b; i++) {
//			int unique = sc.nextInt();
//			users.add(new User(unique));
//		}
//		
//		System.out.print("How many students for course C: ");
//		int c = sc.nextInt();
//		
//		for (int i = 1; i <= c; i++) {
//			int unique = sc.nextInt();
//			users.add(new User(unique));
//		}
//		
//		System.out.println("Total students: " + users.size());
//		sc.close();
		
//		OUTRA FORMA DE SER FEITO
		Scanner sc = new Scanner(System.in);
		System.out.println();
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int unique = sc.nextInt();
			a.add(unique);
		}
		
		System.out.print("How many students for course B: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int unique = sc.nextInt();
			b.add(unique);
		}
		
		System.out.print("How many students for course C: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int unique = sc.nextInt();
			c.add(unique);
		}
		
		Set<Integer> total = new HashSet<Integer>(a);
		total.addAll(b);
		total.addAll(c);
		System.out.println("Total students: " + total.size());
		sc.close();
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
