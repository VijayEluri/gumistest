class Zadanie02{
	public static void main(String[] args){
			
		int val1 = 1;
		int val2 = 1;
		int wrt = 2;
			
		do{
			
			System.out.println(val1++ * wrt);
			
		}
		while (val1<=10);
		
		while(val2<=10){
			
			System.out.println(val2++ * wrt);
			
		}
		
		for(int val3 = 1; val3<=10; val3++)
			System.out.println(val3 * wrt);
	}
}