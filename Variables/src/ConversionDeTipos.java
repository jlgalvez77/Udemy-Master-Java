public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "9846.74";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoReal = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoReal = " + logicoReal);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroString = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroString = " + otroNumeroString);

        otroNumeroString = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroString = " + otroNumeroString);

        double otroRealDouble = 452762.34;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 1000500;
        short s = (short)i;
        System.out.println("s = " + s);
    }
}
