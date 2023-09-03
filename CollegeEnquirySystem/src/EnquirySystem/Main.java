package EnquirySystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create college data
        College college1 = new College("SRM University", "Chennai");
        college1.addCourse(new Course("Computer Science", 150000, "Chennai"));
        college1.addCourse(new Course("Electrical Engineering", 95000, "Chennai"));
        // ... Add more courses

        College college2 = new College("Chennai Institute of Technology", "Chennai");
        college2.addCourse(new Course("Computer Science", 150000, "Chennai"));
        college2.addCourse(new Course("Electrical Engineering", 95000, "Chennai"));
        // ... Add more courses
        
        // Add colleges to the list
        List<College> colleges = new ArrayList<>();
        colleges.add(college1);
        colleges.add(college2);

        System.out.println("Welcome to this Enquiry system");
        System.out.println("Please enter your Valid Requirements!");

        System.out.println("1. To search for the colleges");
        System.out.println("2. Enquiry about the selected college in detail");

        int input = scanner.nextInt();

        System.out.println("Select your Criteria of domain");
        System.out.println("1. Engineering");
        System.out.println("2. Medical");
        System.out.println("3. Arts and Science");
        System.out.println("4. Law");

        int course = scanner.nextInt();

        // Consume the newline character left by previous nextInt()
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Select your course");
                switch (course) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Enter your requirements");

                        System.out.print("Enter your location: ");
                        String location = scanner.nextLine();

                        System.out.print("Enter Course of Interest: ");
                        String courseOfInterest = scanner.nextLine();

                        System.out.print("Enter your markPercentage: ");
                        int markPercentage = scanner.nextInt();

                        System.out.println("\nAvailable Courses for Student Location: " + location + " and Mark Percentage: " + markPercentage);
                        boolean foundMatchingColleges = false;
                        for (College college : colleges) {
                            if (college.getLocation().equalsIgnoreCase(location)) {
                                for (Course courseObj : college.getCourses()) {
                                    if (courseObj.getName().equalsIgnoreCase(courseOfInterest) && courseObj.getFees() <= 100000 && markPercentage >= 70) {
                                        System.out.println("College: " + college.getName() + ", Course: " + courseObj.getName() + ", Fees: " + courseObj.getFees());
                                        foundMatchingColleges = true;
                                    }
                                }
                            }
                        }
                        if (!foundMatchingColleges) {
                            System.out.println("No colleges match the given criteria.");
                        }
                        break;
                }
                break;
            // ... Handle other cases
        }

        scanner.close();
    }
}
