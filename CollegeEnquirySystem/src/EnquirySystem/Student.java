package EnquirySystem;

import java.util.Scanner;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private String location;
	private String contact;
	private String courseOfInterest;
	private int markPercentage;

	public Student(String name, int age, String location, String contact, String courseOfInterest, int markPercentage) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.contact = contact;
		this.courseOfInterest = courseOfInterest;
		this.markPercentage = markPercentage;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	public String getContact() {
		return contact;
	}

	public String getCourseOfInterest() {
		return courseOfInterest;
	}

	public int getMarkPercentage() {
		return markPercentage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setCourseOfInterest(String courseOfInterest) {
		this.courseOfInterest = courseOfInterest;
	}

	public void setMarkPercentage(int markPercentage) {
		this.markPercentage = markPercentage;
	}

	// Getters and setters (You can generate them automatically in an IDE)
	// ...
}

class StudentInputDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to this Enquiry system");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your Age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter your location: ");
		String location = scanner.nextLine();

		System.out.print("Enter your Contact Number: ");
		String contact = scanner.nextLine();

		System.out.print("Enter Course of Interest: ");
		String courseOfInterest = scanner.nextLine();

		System.out.print("Enter your markPercentage: ");
		int markPercentage = scanner.nextInt();

		Student student = new Student(name, age, location, contact, courseOfInterest, markPercentage);

		scanner.close();
	}
}
