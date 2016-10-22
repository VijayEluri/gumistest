class Zadanie7 {
    public static void main(String[] args){

		boolean x = true , z = true ;
		int y = 20 ;
		x = (y!=10) ^ (z = false);
		System.out.println(x + "," + y + "," + z);
		
		//krok 0 Ewaluacja wyrażenia "y!=10",wynik true
		//krok 1 Ewaluacja wyrażenia "z = false", wynik false
		//krok 2 Ewaluacja wyrażenia "(y!=10) ^ (z = false)", wynik true
		
		/* Wynik: true,20,false. X równe jest true gdyż jest wynikiem operacji Logical Exclusive OR, a więc jest true tylko gdy jeden z argumentów jest true. W tym przypadku (y!=10) ma wartość true a (z = false) wartość false. Wartość zmiennej y wynosi zgodnie z deklaracją 20, wartość zmiennej z zgodnie z przypisaniem jest false. */
		
	}
}