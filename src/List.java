public class List {
	int[] value = new int[0];

	int get(int index) {
		return value[index];
	}
	int size(){
		int ile =0;
		for (int i = 0; i < value.length; i++) {
			 ile ++;
		}
		return ile;
	}

	void add(int element) {
		int[] value1 = new int[value.length + 1];
		for (int i = 0; i < value.length; ++i) {
			value1[i] = value[i];

		}
		value1[value.length] = element;
		value=value1;
	}
	void remove(int index){
		int[] value2 = new int[value.length-1]; 
		for (int i = index; i < value.length; i++) {
			value2[i]=value[i+1];
		}
		
		value =value2;
	}
}
