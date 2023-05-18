package ejecutable;
import javax.swing.JOptionPane;

import modelo.Suma;

public class Test 
{
    //modelo principal 
    public static void main(String[] args) 
    {
        
        double x = Double.parseDouble(JOptionPane.showInputDialog("Diguite el valor de x :"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Diguite el valor de y :"));

        //creacion de objeto suma

        Suma miSuma =new Suma(x, y);

        miSuma.sumar();
        JOptionPane.showMessageDialog(null,"La suma de "+x+" y "+y+" es "+miSuma.mostrarResultado());
    }
}
