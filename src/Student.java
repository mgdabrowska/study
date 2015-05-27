class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;
	ListSubject mySubjects;
	ListMarks myMarks;

	Student(String name, String surname, String birthDate, String pesel,
			ListSubject mySubjects, ListMarks myMarks) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.pesel = pesel;
		this.mySubjects = mySubjects;
		this.myMarks = myMarks;
	}

	public String toString() {
		return "" + name + "" + surname + "" + birthDate + "" + pesel + ""
				+ mySubjects + ""+ myMarks+ "";
	}

}
