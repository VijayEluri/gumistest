class zadanie06
 {
    public static void main(String[] args) {
		/*
		char suma = 0;
		char skladnik1 = '\u0000';
		int skladnik2 = 1;
		
		suma = skladnik1 + skladnik2;
		*/
		
		//wynik - błąd kompilacji, możliwa utrata
		//danych przy konwersji typu int na char
		
		/*
		int suma = 0;
		char skladnik1 = 'b';
		int skladnik2 = 100;
		
		suma = skladnik1 + skladnik2;
		*/
		
		//wynik - program kompiluje się poprawnie,
		//wynikiem dodawania jest suma liczby
		//calkowitej skladnik2 oraz wartości kodu UNICODE
		//odpowiadającego znakowi skladnik1
		
		
		/*
		float suma = 0f;
		float skladnik1 = 1.1f;
		double skladnik2 = 1.1d;
		
		suma = skladnik1 + skladnik2;
		*/
		
		//wynik - błąd kompilacji, możliwa utrata 
		//danych przy konwersji typu double na float
		
		/*
		byte suma = 0;
		byte skladnik1 = 1;
		int skladnik2 = 1;
		
		suma = skladnik1 + skladnik2;;
		*/
		
		//wynik - błąd kompilacji, możliwa utrata
		//danych przy konwersji typu int na byte
		
    }
}