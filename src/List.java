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
		int[] value2 = new int[value.length - 1];
		for (int i = 0; i < index; i++) {
			value2[i] = value[i];
		}
		for (int j = index; j < value2.length; j++) {
			value2[j] = value[j + 1];
		}
		value = value2;
	}

	/*
	 * void addAt(int index, int element) { int tmp = 0; int[] value3 = new
	 * int[value.length + 1]; }
	 */
}
