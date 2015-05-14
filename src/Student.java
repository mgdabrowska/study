class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;

	public Student(String name, String surname, String birthDate, String pesel) {

	}
}

class NewStudent {
	public static void main(String[] args) {
		Student[] student = new Student[6];
		
			/*	("Ma³gorzata", "Dabrowska",
				"13 marca 1990r", " 90031307568");*/
		 student[0] = new Student("Adam", "Stawicki", "8 marca 1991r",
				"91039198346");
		 student[1] = new Student("Jan", "Kowalski", "15 maja 1989r",
				"89051576893");

	}
}
