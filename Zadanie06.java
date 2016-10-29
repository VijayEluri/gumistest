class Zadanie06{
	public static void main(String[] args){
	
		int x=0;//deklaracja zmiennych
		while(x++<10){System.out.println(x);}//inkrementacja wartości zmiennej x do 11 oraz wykonanie instrukcji pustej 10 razy
		String msg = x>10?"Wieksze niz":"false";//błąd kompilacji gdyż nie możemy przypisać wartości logicznej do zmiennej msg typu string
		System.out.println(msg+","+x);//nie zadziała ze względu na błąd w poprzedniej linii
		
	}
}