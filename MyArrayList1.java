
import java.util.Arrays;

public class MyArrayList1<T> {
	public double[] data;

	public int nprod;

	public MyArrayList1() {
		data = new double[10];
		nprod = 0;
	}

	public boolean isFull() {
		if (nprod == data.length)
			return true;
		else
			return false;
	}

	public void graw() {
		double[] temp = new double[data.length * 2];
		for (int i = 0; i <= data.length; i++) {
			temp[i] = data[i];
		}
		temp = data;
	}

    public void add(double iToAdd) {
	if(isFull()) {
		graw();
	}
	data[nprod]= iToAdd;
      nprod++;
    }

	public boolean add(int idx, double iToAdd) {
		if (idx < 0 || idx > nprod) {
			return false;
		}
		if (isFull()) {
			graw();
		}
		for (int i = nprod - 1; i >= nprod; i--) {
			data[i + 1] = data[i];
		}
		data[idx] = iToAdd;
		nprod++;
		return true;
	}

//	public Double remove(int idx) {
//		int i;
//		if (idx < 0 || idx >= i) {
//			return null;
//		}
//		double iToremove = get[idx];
//		for (int ii = idx; i < i - 1; i++) {
//			get[i] = get[i + 1];
//		}
//		i--;
//		return remove(0);
//	}
	public Object remove(int idx) {
			if(idx<0||idx>=nprod) {
		return null;
			}
	Object itemToremove=data[idx];
	for(int i=idx;i<nprod -1;i++) {
		data[i]=data[i+1];
	}
	nprod --;
	return itemToremove;
	}	
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(data,0,nprod ));
	}
	public void checkIdex(int idx) {
	if(idx <0 || idx > nprod ) {
		throw new IndexOutOfBoundsException();
	}
	}
	public void set(int idx,double nprodToAdd) {
		checkIdex(idx);
		data [idx]= nprodToAdd;
	}
	public Object get(int indx) {
		checkIdex(indx);
		return data[indx];
	}
	}
	

	
	
		