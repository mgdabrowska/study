
class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;
	String ListSubject;

	Student(String name, String surname, String birthDate, String pesel, String ListSubject ) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.pesel = pesel;
		this.ListSubject = ListSubject;

	}

	public String toString() {
		return "" + name + "" + surname + "" + birthDate + "" + pesel + ""
				+ ListSubject + "";
	}
	
}
