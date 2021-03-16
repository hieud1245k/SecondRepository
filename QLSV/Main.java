
public class Main {
	
	public static void main(String[] args) {
		Students student1 = new Students("Nguyễn Minh Hiếu", 21, "Đà Nẵng", 102170084, "17T2");
		Students student2 = new Students("Đỗ Cao Trí", 21, "Đà Nẵng", 102170144, "17T2");
		Students student3 = new Students("Trần Thị Thu Công", 21, "Đà Nẵng", 102170075, "17T2");
		Students student4 = new Students("Nguyễn Thị Thùy Trinh", 21, "Đà Nẵng", 102170127, "17T2");
		Teachers teacher = new Teachers("Nguyễn Văn Nguyên", 47, "Đà Nẵng", "12345", "IT");
		Subjects subjects = new Subjects("OOP", teacher);
		subjects.addStudent(student1);
		subjects.addStudent(student2);
		subjects.addStudent(student3, student4);
		System.out.println(subjects.toString());
		System.out.println(subjects.getStudents("asc"));
	}
}
