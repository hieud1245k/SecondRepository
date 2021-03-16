import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Subjects {

	private String name;
	private Teachers teacher;
	private List<Students> students = new ArrayList<Students>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teachers getTeacher() {
		return teacher;
	}

	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}

	public List<Students> getStudents() {
		return students;
	}

	public List<Students> getStudents(String direct) {
		List<Students> directionStudentList = this.students;
		if (direct.equals("asc") || direct.equals("ASC")) {
			Collections.sort(directionStudentList, new Comparator<Students>() {
				@Override
				public int compare(Students o1, Students o2) {
					return (o1.getMSSV() > o2.getMSSV()) ? 1 : -1;
				}
			});
		} else if (direct.equals("desc") || direct.equals("DESC")) {
			Collections.sort(directionStudentList, new Comparator<Students>() {
				@Override
				public int compare(Students o1, Students o2) {
					return (o1.getMSSV() < o2.getMSSV()) ? 1 : -1;
				}
			});
		}
		return this.students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public void addStudent(Students student) {
		for (Students sd : this.students) {
			if (student.equals(sd)) {
				System.out.println("This student whose MSSV is " + student.getMSSV() + " has already existed!");
				return;
			}
		}
		students.add(student);
		System.out.println("Add student whole MSSV is " + student.getMSSV() + " is successful");
	}

	public void addStudent(Students... studentList) {
		for (Students student : studentList) {
			addStudent(student);
		}
	}

	public void removeStudent(Students student) {
		for (int i = 0; i < this.students.size(); i++) {
			if (student.equals(students.get(i))) {
				this.students.remove(i);
				System.out.println("Remove student whose MSSV is " + student.getMSSV() + " successful");
				return;
			}
			System.out.println("Not found student whose MSSV is " + student.getMSSV());
		}
	}

	public void removeAllStudent() {
		this.students.removeAll(this.students);
	}

	public Subjects(String name, Teachers teacher) {
		super();
		this.name = name;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nSubject name:" + this.name);
		str.append("\nTeacher:" + this.teacher.getName());
		str.append("\nStudent infor:");
		for (Students student : this.students) {
			str.append("\n" + student.toString());
		}
		return str.toString();
	}

}
