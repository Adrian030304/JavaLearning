package def;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Person> people = StoringRecords.readRecordsFromFile("file.txt");
		
		System.out.println("Total amount of people read: " + people.size());
	}
}

class StoringRecords {
	public static ArrayList<Person> readRecordsFromFile(String file) {
		ArrayList<Person> people = new ArrayList<>();
		try (Scanner scanner = new Scanner(Paths.get(file))) {
			while (scanner.hasNextLine()) {
				String row = scanner.nextLine();
				if (row.equals("")) {
					break;
				}
				String[] parts = row.split(",");
			    String name = parts[0];
			    int age = Integer.valueOf(parts[1]);

			    people.add(new Person(name, age));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return people;
	}
}
