class Zadanie08{
	public static void main(String[] args){
		boolean wykonuj = true;

		int res = 15, i = 10;

		do{
			i--;//dekrementacja zmiennej i z każdą iteracją pętli
			if(i==6)//sprawdzenie czy i jest równe 6
				wykonuj=false;//w momencie kiedy i zostanie zmniejszone do 6 zmiennej wykonuj przypisana zostanie wartość false
			res -=2;//z każdą iteracją pętli od zmiennej res odjęte zostanie 2
	
		}while(wykonuj);//zatrzyma wykonywanie pętli gdy zmienna wykonuj przyjmie wartość false
		System.out.println(res);//wypisanie na ekran liczby 7
		
	}
}