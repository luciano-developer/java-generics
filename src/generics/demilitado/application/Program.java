package generics.demilitado.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import generics.demilitado.entities.Product;
import generics.demilitado.services.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String file = "C:\\tempTestes\\list.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = br.readLine();
			while (line!=null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
