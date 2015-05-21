
class Student {

	String name;
	String surname;
	String birthDate;
	String pesel;
	String indeks;

	Student(String name, String surname, String birthDate, String pesel) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.pesel = pesel;

	}

	public String toString() {
		return "" + name + "" + surname + "" + birthDate + "" + pesel + ""
				+ indeks + "";
	}
}
