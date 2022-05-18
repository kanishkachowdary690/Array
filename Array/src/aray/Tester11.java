package aray;

class Student {
	// Implement your code here
	private int[] marks;
	private char[] grade;

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public char[] getGrade() {
		return grade;
	}

	public void setGrades(char[] grade) {
		this.grade = grade;
	}

	Student(int[] marks) {
		this.marks = marks;
	}

	public void findGrade() {
		int a=marks.length;
		grade=new char[a];
		for (int i = 0; i < a; i++) {
			if (marks[i] >= 92) {
				grade[i] = 'E';
			} else if (marks[i] >= 85 && marks[i] < 92) {
				grade[i] = 'A';
			} else if (marks[i] >= 75 && marks[i] < 85) {
				grade[i] = 'B';
			} else if (marks[i] >= 65 && marks[i] < 75) {
				grade[i] = 'C';
			} else {
				grade[i] = 'F';
			}
		}
	}
}

class Tester11 {
	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 };
		Student student = new Student(marks);
		student.findGrade();
		System.out.println("Grades corresponding to the marks are : ");
		char[] grade = student.getGrade();
		for (int index = 0; index < grade.length; index++) {
			System.out.print(grade[index] + " ");
		}
	}
}
