
public class Student {
	private String name;
	private int age;
	private String course;
	private char grade;

	public Student() {
		super();
		this.name = "";
		this.age = 0;
		this.course = "";
		this.grade = ' ';
	}

	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String course, char grade) {
		this(name, age);
		this.course = course;
		this.grade = grade;
	}

	public void displayStudentInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course + ", Grade: " + grade);
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Adama", 12);
		Student student3 = new Student("Koffi", 17, "Chemistry", 'C');

		student1.displayStudentInfo();
		student2.displayStudentInfo();
		student3.displayStudentInfo();
	}
}
