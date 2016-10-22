class Zadanie4 {
    public static void main(String[] args){

		int wrt = -13;
		boolean test = (wrt > -15 && wrt < -10) ^ (wrt < -13);
		//test = (wrt>-15 && wrt<-10) ? (wrt < -13 ? false : true) : (wrt < -13 ? true : false);
		if (test)
			System.out.println("zmienna nalezy tylko do jednego ze zbiorow");
		else
			System.out.println("zmienna nalezy do obu, lub zadnego ze zbiorow");
	}
}