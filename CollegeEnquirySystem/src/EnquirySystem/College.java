package EnquirySystem;

	import java.util.ArrayList;
	import java.util.List;

	class Course {
	    private String name;
	    private int fees;
	    private String location;

	    public Course(String name, int fees, String location) {
	        this.name = name;
	        this.fees = fees;
	        this.location = location;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getFees() {
			return fees;
		}

		public void setFees(int fees) {
			this.fees = fees;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

	    // Getters and setters (You can generate them automatically in an IDE)
	    // ...
	}

	class College {
	    private String name;
	    private String location;
	    private List<Course> courses;

	    public College(String name, String location) {
	        this.name = name;
	        this.location = location;
	        this.courses = new ArrayList<>();
	    }

	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}

		public void addCourse(Course course) {
	        courses.add(course);
	    }

	    public List<Course> getCourses() {
	        return courses;
	    }

	    // Getters and setters (You can generate them automatically in an IDE)
	    // ...
	}



