
class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;
	ListSubject mySubjects;

	Student(String name, String surname, String birthDate, ListSubject mySubject) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.pesel = pesel;
		this.mySubjects=mySubjects;

	}

	public String toString() {
		return "" + name + "" + surname + "" + birthDate + "" + pesel + ""
				+ mySubjects + "";
	}
	
}
