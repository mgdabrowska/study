public class List {
	int[] value = new int[0];

	int get(int index) {
		return value[index];
	}

	int size() {
		return value.length;
	}

	void add(int element) {
		int[] value1 = new int[value.length + 1];
		for (int i = 0; i < value.length; ++i) {
			value1[i] = value[i];

		}
		value1[value.length] = element;
		value = value1;
	}

	void remove(int index) {
		int[] value1 = new int[value.length - 1];
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

	void addAt(int index, int element) {
		int[] value1 = new int[value.length + 1];
		for (int i = 0; i < index; i++) {
			value1[i] = value[i];

		}
		for (int j = index; j < value1.length; j++) {
			value1[j] = value[j - 1];

		}
		value1[index] = element;
		value = value1;
	}

	void change(int index, int element) {
		value[index] = element;

	}

}
