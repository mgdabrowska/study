class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;

	Student(String name, String surname, String birthDate, String pesel) {

	}

	public String toString() {
		return name + "" + surname + "" + birthDate + "" + pesel;
	}
}

class NewStudent {
	public static void main(String[] args) {
		Student[] student = new Student[6];
		student[0] = new Student("Adam", "Stawicki", "8 marca 1991r",
				"91039198346");
		student[1] = new Student("Jan", "Kowalski", "15 maja 1989r",
				"89051576893");

	}
}
