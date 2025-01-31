public class TiposDatosPrimitivos {
    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde a " + Byte.BYTES + " bytes");
        System.out.println("Tipo byte corresponde a "  + Byte.SIZE + " bits");
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde a " + Short.BYTES + " bytes");
        System.out.println("Tipo short corresponde a "  + Short.SIZE + " bits");
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);

        int numeroInt = 15;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde a " + Integer.BYTES + " bytes");
        System.out.println("Tipo int corresponde a "  + Integer.SIZE + " bits");
        System.out.println("Valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 20;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde a " + Long.BYTES + " bytes");
        System.out.println("Tipo long corresponde a "  + Long.SIZE + " bits");
        System.out.println("Valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE);

        float numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo float corresponde a " + Float.BYTES + " bytes");
        System.out.println("Tipo float corresponde a "  + Float.SIZE + " bits");
        System.out.println("Valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float " + Float.MIN_VALUE);

        double numeroDouble = 20.0;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Tipo double corresponde a " + Double.BYTES + " bytes");
        System.out.println("Tipo double corresponde a "  + Double.SIZE + " bits");
        System.out.println("Valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double " + Double.MIN_VALUE);

        char caracter = 'a';
        System.out.println("caracter = " + caracter);
        System.out.println("Tipo char corresponde a " + Character.BYTES + " bytes");
        System.out.println("Tipo char corresponde a "  + Character.SIZE + " bits");
        System.out.println("Valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char " + Character.MIN_VALUE);

        boolean verdadero = true;
        System.out.println("verdadero = " + verdadero);
        //System.out.println("Tipo boolean corresponde a " + Boolean.BYTES + " bytes");
        //System.out.println("Tipo boolean corresponde a "  + Boolean.SIZE + " bits");
        System.out.println("Valor verdadero = " + Boolean.TRUE);
        System.out.println("Valor falso = " + Boolean.FALSE);


    }
}
