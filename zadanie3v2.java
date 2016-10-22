class Zadanie3v2 {
    public static void main(String[] args){

		int wrt = -4;
		boolean test0 = ( wrt > -15 && wrt <-10 )||( wrt > -5 && wrt < 0 )||( wrt > 5 && wrt < 10 );
		boolean test1 = ( wrt <= -13 )||( wrt > -8 && wrt < -3 );
		boolean test2 = ( wrt >= -4 );
		
		if (test0 && test1 && test2)
			System.out.println("Zmienna wrt = " + wrt + " nalezy do czesci wspolnej zadanych zbiorow");
		else
			System.out.println("Zmienna wrt = " + wrt + " nie nalezy do czesci wspolnej zadanych zbiorow");
	
	}
}