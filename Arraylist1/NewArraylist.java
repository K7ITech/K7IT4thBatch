package Arraylist1;

import java.util.Arrays;

public class NewArraylist<T> {
	public double[] get;

	public int nprod;

	public NewArraylist() {
		get = new double[10];
		nprod = 0;
	}

	public boolean isFull() {
		if (nprod == get.length)
			return true;
		else
			return false;
	}

	public void graw() {
		double[] temp = new double[get.length * 2];
		for (int i = 0; i <= get.length; i++) {
			temp[i] = get[i];
		}
		temp = get;
	}

    public void add(double iToAdd) {
	if(isFull()) {
		graw();
	}
      get[nprod]= iToAdd;
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
			get[i + 1] = get[i];
		}
		get[idx] = iToAdd;
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

	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(get, 0, 1));
	}
	
}
