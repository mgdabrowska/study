public class ListMarks {
	Marks[] value = new Marks[0];

	Marks get(int index) {
		return value[index];
	}

	int size() {
		return value.length;
	}

	void add(Marks element) {
		Marks[] value1 = new Marks[value.length + 1];
		for (int i = 0; i < value.length; ++i) {
			value1[i] = value[i];

		}
		value1[value.length] = element;
		value = value1;
	}

	void remove(int index) {
		Marks[] value1 = new Marks[value.length - 1];
		for (int i = 0; i < value1.length; i++) {
			if (i != index) {
				value1[i] = value[i];
			}
		}
		for (int j = index; j < value1.length; j++) {
			value1[j] = value[j + 1];
		}
		value = value1;
	}

	void addAt(int index, Marks element) {
		Marks[] value1 = new Marks[value.length + 1];
		for (int i = 0; i < index; i++) {
			value1[i] = value[i];

		}
		for (int j = index; j < value1.length; j++) {
			value1[j] = value[j - 1];

		}
		value1[index] = element;
		value = value1;
	}

	void change(int index, Marks element) {
		value[index] = element;

	}

	public String toString() {
		String result = "Oceny studenta : {";
		for (int i = 0; i < value.length; i++) {
			Marks s = value[i];
			result += s;
		}
		return result + "}";

	}
}
