import javax.swing.*;

public class EntradaDatos {
    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null, "Introduce un número entero");
        int numeroInt = Integer.parseInt(numeroString);
        JOptionPane.showMessageDialog(null, "Tu número es: " + numeroInt);
        System.out.println("El número proporcionado es: " + numeroInt);
    }

}
