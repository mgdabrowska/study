class Student<E> {

	String name;
	String surname;
	String birthDate;
	String pesel;
	E mySubjects;
	E myMarks;

	Student(String name, String surname, String birthDate, String pesel,
			E mySubjects, E myMarks) {
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
