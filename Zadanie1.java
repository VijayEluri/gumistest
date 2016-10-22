class Zadanie1 {
    public static void main(String[] args){
	
		byte a = 40 , b = 50;
		byte suma = (byte) (a + b);
		System.out.println(suma);
	
		/*
		Operacje w Javie wykonywane są z 32-bitową lub większą dokładnością http://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.2.2 , wynik sumowania będzie domyślnie typu int, a więc próba przypisania go do zmiennej typu byte zakończy się błędem kompilacji. Aby program zadziałał, należy dokonać rzutowania sumy na typ byte poprzez zmianę instrukcji w linii 5 na "byte suma = (byte)(a + b);", wówczas wynikiem będzie 90.
		*/
	
	}
}