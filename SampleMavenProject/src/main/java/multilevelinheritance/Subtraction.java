package multilevelinheritance;

public class Subtraction extends Multiplication {

	public static void main(String[] args) {
		
		Subtraction sub=new Subtraction();
		sub.Add();
		sub.Mult();
		sub.Subtract();
	}
			
		// TODO Auto-generated method stub
		
		public void Subtract() {
			int s=a-b;
		System.out.println(s);
		}

	}


