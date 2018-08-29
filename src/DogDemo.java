import java.util.Scanner;

public class DogDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age of the dog.");
		int eight = input.nextInt();
		Dog balto = new Dog();
		balto.name = "Balto";
		balto.age = eight;
		balto.breed = "Siberian Husky";
		balto.writeOutput();

		Dog scooby = new Dog();
		scooby.name = "Scooby";
		scooby.age = (eight * 2);
		scooby.breed = "Great Dane";
		System.out.println(scooby.name + " is a " + scooby.breed + ".");
		System.out.print("He is " + scooby.age + " years old, or ");
		int humanYears = scooby.getAgeInHumanYears();
		System.out.println(humanYears + " in human years.");
	}
}
