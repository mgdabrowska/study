import java.util.Scanner;

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
		return "" + name + "" + surname + "" + birthDate + "" + pesel+ ""+ indeks+"";
	}
}

class NewStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[6];
		//student[0].name =  ListTest.imie;
		//System.out.println(imie);
		//System.out.println("Podaj imiê"+ sc.nextLine().toString());
		//student[0] = new Student(imie+ " "  , nazwisko+" "  , " ",pesel1+" "  );
		/*student[1] = new Student("Jan ", "Kowalski ", "15 maja 1989r ",
				"89051576893 ");
		student[2] = new Student("Karol ", "Lato ", "20 wrzesnia 1988r ",
				"88092076893");
		student[3] = new Student("Anna ", "Dobrowolska ", "20 stycznia 1993r ",
				"93012076893 ");
		student[4].name= sc.nextLine();*/
	}
}
