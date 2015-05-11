public class List {
	int[] value = new int[0];

	int get(int index) {
		return value[index];
	}

	void add(int element) {
		int[] value1 = new int[value.length + 1];
		for (int i = 0; i < value.length; ++i) {
			value1[i] = value[i];

		}
		value1[value.length] = element;
		value=value1;
	}
}
