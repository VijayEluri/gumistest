class Zadanie4v2 {
    public static void main(String[] args){

		int wrt = -13;
		boolean test0 = (wrt > -15 && wrt < -10);
		boolean test1 = (wrt < -13);

		if (test0 != test1)
			System.out.println("zmienna nalezy tylko do jednego ze zbiorow");
		else
			System.out.println("zmienna nalezy do obu, lub zadnego ze zbiorow");
	}
}