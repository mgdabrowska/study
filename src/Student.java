class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;

	Student(String name, String surname, String birthDate, String pesel) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.pesel = pesel;
		
	}

	public String toString() {
		return "" + name + "" + surname + "" + birthDate + "" + pesel;
	}
}

class NewStudent {
	public static void main(String[] args) {
		Student[] student = new Student[6];
		student[0] = new Student("Adam ", "Stawicki ", "8 marca 1991r ",
				"91039198346 ");
		student[1] = new Student("Jan ", "Kowalski ", "15 maja 1989r ",
				"89051576893 ");
		student[2] = new Student("Karol ", "Lato ", "20 wrzesnia 1988r ",
				"88092076893");
		student[3] = new Student("Anna ", "Dobrowolska ", "20 stycznia 1993r ",
				"93012076893 ");
	}
}
