class Zadanie6 {
    public static void main(String[] args){

		int x = 4;
		long y = x * 4 - x++;
		if (y<10) System.out.println("za mało");
		else System.out.println("w sam raz");
		
		/* Rezultatem programu będzie wypisanie do konsoli komunikatu "w sam raz", gdyż wartość zmiennej y wynosi 12, oraz inkrementacją wartości zmiennej x po wykonaniu instrukcji w linii 6. */
		
	}
}