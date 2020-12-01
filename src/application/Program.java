package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Map<Product,Double> map = new TreeMap<>(); 
//		
//		Product p1 = new Product("TV", 900.0);
//		Product p2 = new Product("game", 2000.0);
//		Product p3 = new Product("tablet", 10000.0);
//		
//		map.put(p1, 10.0);
//		map.put(p2, 2.0);
//		map.put(p3, 5.0);
//		
//		Product ps = new Product("TV", 900.0);
//		
//		System.out.println("Contains 'ps' key: "+map.containsKey(ps));
//		
//		System.out.println();
//		
//		Map<String,String> cookies = new TreeMap<String, String>();
//		cookies.put("name", "ze");
//		cookies.put("email", "email");
//		cookies.put("phone", "99997111");
//		
//		cookies.remove("email");
//		cookies.put("phone", "99997112");
//		
//		System.out.println("All cookies");
//		for (String key : cookies.keySet()) {
//			System.out.println(key + " " + cookies.get(key));
//		}

		System.out.print("Enter file full path: ");
		String path = sc.next();

		Map<String, Integer> votes = new LinkedHashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int voteSoFar = votes.get(name);
					votes.put(name, count+voteSoFar);
				}else {
					votes.put(name , count);
				}
				line = br.readLine();
			}

			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sc.close();
		}

	}

}
