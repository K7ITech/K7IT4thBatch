
public class EqualsMethod {

	public EqualsMethod(int i, String string, double d, double e) {
	}

	public static void main(String[] args) {
		EqualsMethod em=new EqualsMethod(27,"rani",5.7,65.0);
		EqualsMethod em2 =new EqualsMethod(28,"raju",5.2,60.0);
		EqualsMethod em3=em;
		EqualsMethod em4= new EqualsMethod(28,"raju",5.2,60.0);
				if(em3.equals(em)) {
				System.out.println("true");
		}
		else 
		{
			System.out.println("false");
			}
		}
	
	}


