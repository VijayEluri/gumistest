class zadanie05 {
    public static void main(String[] args) {
	
		//typy logiczne
		boolean typeBool;
		//typy liczb calkowitych
		byte typeByte;
		short typeShort;
		int typeInt;
		long typeLong;
		//typy liczb rzeczywistych
		float typeFloat;
		double typeDouble;
		//typy znakow
		char typeChar;
		
		//inicjowanie zmiennych najniższymi wartościami
		typeBool = true;
		//typ bool nie posiada wartości minimalnej
		typeByte = Byte.MIN_VALUE;
		typeShort = Short.MIN_VALUE;
		typeInt = Integer.MIN_VALUE;
		typeLong = Long.MIN_VALUE;
		typeFloat = Float.MIN_VALUE;
		typeDouble = Double.MIN_VALUE;
		typeChar = Character.MIN_VALUE;

		//inicjowanie zmiennych najwyższymi wartościami
		typeBool = false;
		//typ bool nie posiada wartości maksymalnej
		typeByte = Byte.MAX_VALUE;
		typeShort = Short.MAX_VALUE;
		typeInt = Integer.MAX_VALUE;
		typeLong = Long.MAX_VALUE;
		typeFloat = Float.MAX_VALUE;
		typeDouble = Double.MAX_VALUE;
		typeChar = Character.MAX_VALUE;

    }
}