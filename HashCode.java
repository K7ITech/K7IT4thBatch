
public class HashCode {

	public HashCode(int i, String string, double d, double e) {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashCode hc= new HashCode(27,"rani",5.7,65.0);
  HashCode hc2=new HashCode(26,"anu",5.1,45.0);
  HashCode hc3=hc;
  HashCode hc4=new HashCode(26,"anu",5.1,45.0);
  
  System.out.println(hc.hashCode());
  System.out.println(hc2.hashCode());
  System.out.println(hc3.hashCode());
  System.out.println(hc4.hashCode());
  
  System.out.println(hc==hc3);
  
	}

}
