class Zadanie04{
	public static void main(String[] args){
	
		double a = 2.0d;
		for(int n = 0; n < 10; n++){
			
			double wrd = 1/a;
			
			if(n==0){
				
				wrd = 1.0d;
				
			}else{

				a *= a;

			}
			
			System.out.print(wrd+", ");
		}
		
		
	}
}