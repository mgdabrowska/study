class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;
	List<Subject> mySubjects;
	List<Marks> myMarks;

	Student(String name, String surname, String birthDate, String pesel,
			List<Subject> mySubjects, List<Marks> myMarks) {
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
