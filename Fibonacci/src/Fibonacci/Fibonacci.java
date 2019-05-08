package Fibonacci;

public class Fibonacci {
//juan was here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<=100;i++) {
//			if((i%2)!=0) {
//				System.out.println(i);
//			}
//		}
		int x=1;
		int anterior=0;
		int temp;
		while(true) {
			System.out.println(x);
			temp = x;
			x= x + anterior;
			anterior = temp;
			
			if(x>100) {
				break;
			}
		}

	}

}
