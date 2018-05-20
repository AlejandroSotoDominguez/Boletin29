
package boletin29;

import javax.swing.JOptionPane;

public class EmbarcacionDeportiva extends Barco {
    private float potencia=2;
    
    @Override
    public float aluguer(){
        float resultado;
        int diasOcupacion = Integer.parseInt(JOptionPane.showInputDialog("dias ocupacion"));
        return resultado = diasOcupacion*moduloBase()*potencia;
    }
}
