class Zadanie3 {
    public static void main(String[] args){

		int wrt = -4;
		
		if ((( wrt > -15 && wrt <-10 )||( wrt > -5 && wrt < 0 )||( wrt > 5 && wrt < 10 ))
			&&( wrt <= -13 )||( wrt > -8 && wrt < -3 )
			&&( wrt >= -4 ))
			System.out.println("Zmienna wrt = " + wrt + " nalezy do czesci wspolnej zadanych zbiorow");
		else
			System.out.println("Zmienna wrt = " + wrt + " nie nalezy do czesci wspolnej zadanych zbiorow");
	
	}
}