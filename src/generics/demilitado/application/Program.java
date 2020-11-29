package generics.demilitado.application;

//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import generics.demilitado.entities.Circle;
import generics.demilitado.entities.Retangle;
import generics.demilitado.entities.Shape;

//import generics.demilitado.entities.Product;
//import generics.demilitado.services.CalculationService;

public class Program {

	public static void main(String[] args) {

		genericsDelimitado();

//		genericsTipoCuringa();

		// List<Product> list = new ArrayList<>();
//		String file = "C:\\tempTestes\\list.csv";
//		try (BufferedReader br = new BufferedReader(new FileReader(file))){
//			String line = br.readLine();
//			while (line!=null) {
//				String[] fields = line.split(",");
//				list.add(new Product(fields[0],Double.parseDouble(fields[1])));
//				line = br.readLine();
//			}
//			Product x = CalculationService.max(list);
//			System.out.println("Most expensive:");
//			System.out.println(x);
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
	}

	private static void genericsDelimitado() {
		List<Shape> lst = new ArrayList<>();
		lst.add(new Circle(2.5));
		lst.add(new Retangle(2.0, 2.0));
		
		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(5.0));
		
		System.out.println("Total areas: " + totalArea(circles));
	}

	private static Double totalArea(List<? extends Shape> shapes) {
		double sum = 0;
		for (Shape shape : shapes) {
			sum += shape.area();
		}
		return sum;
	}

	private static void genericsTipoCuringa() {
		List<?> listG = new ArrayList<>();
		List<String> listStr = Arrays.asList("Maria", "Joao", "Jose");
		listG = listStr;

		printlist(listStr);
	}

	private static void printlist(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
