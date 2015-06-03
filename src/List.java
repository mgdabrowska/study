public class List<E> {
	Object[] value = new Object[0];

	E get(int index) {
		return (E) value[index];
	}

	int size() {
		return value.length;
	}

	void add(E element) {
		Object[] value1 = new Object[value.length + 1];
		for (int i = 0; i < value.length; ++i) {
			value1[i] = value[i];

		}
		value1[value.length] = element;
		value = value1;
	}

	void remove(int index) {
		Object[] value1 = new Object[value.length - 1];
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

	void addAt(int index, E element) {
		Object[] value1 = new Object[value.length + 1];
		for (int i = 0; i < index; i++) {
			value1[i] = value[i];

		}
		for (int j = index; j < value1.length; j++) {
			value1[j] = value[j - 1];

		}
		value1[index] = element;
		value = value1;
	}

	void change(int index, E element) {
		value[index] = element;

	}
	public String toString(){
		String result= " ";
		for (int i = 0; i < value.length; i++) {
			E s = (E) value[i];
			result+=s;
		}
		return result;
	}

}
