class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;
	List mySubjects;
	List myMarks;

	Student(String name, String surname, String birthDate, String pesel,
			List mySubjects, List myMarks) {
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
