import java.util.Arrays;

import org.apache.log4j.Logger;

public class MyArrayList1<T> {

	private static Logger log = Logger.getLogger(MyArrayList1.class);

	public Object[] data;
	public int nItems;

	public MyArrayList1() {
		data = new Object[10];
		nItems = 0;
	}

	public boolean isFull() {
		if (nItems == data.length)
			return true;
		else
			return false;

	}

	public void grow() {
		Object[] temp = new Object[data.length * 2];

		for (int i = 0; i < data.length; i++) {

			temp[i] = data[i];
		}

		data = temp;

	}

	public void add(double itemToAdd) {
		if (isFull()) {
			grow();

		}
		data[nItems] = itemToAdd;
		nItems++;

	}

	public boolean add(int idx, double nItemsToAdd) {
		if (idx < 0 || idx > nItems) {
			return false;

		}
		if (isFull()) {
			grow();

		}
		for (int i = nItems - 1; i >= idx; i--) {
			data[i + 1] = data[i];
		}
		data[idx] = nItemsToAdd;
		nItems++;
		return true;

	}

	public Object remove(int idx) {
		if (idx < 0 || idx >= nItems) {
			return null;

		}
		Object itemToremove = data[idx];
		for (int i = idx; i < nItems - 1; i++) {
			data[i] = data[i + 1];
		}
		nItems--;

		return itemToremove;
	}

	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(data, 0, nItems));

	}

	
	public void checkIdx(int idx) {
		if(idx<0 || idx > nItems) {
			throw new IndexOutOfBoundsException();
		}
	}
	public void set(int idx, double nItemsToAdd) {
		checkIdx(idx);
//		if (isFull()) {
//			grow();
//
//		}
//		for (int i = nItems - 1; i >= idx; i--) {
//			data[i + 1] = data[i];
//		}
//		data[idx] = nItemsToAdd;
//		nItems++;
//		return true;
		//double old= data[idx];
		data[idx]=nItemsToAdd;

	}
	public Object get(int indx) {
		checkIdx(indx);
		return data[indx];
	}
}
