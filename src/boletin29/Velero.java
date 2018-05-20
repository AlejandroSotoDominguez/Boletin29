
package boletin29;

import javax.swing.JOptionPane;

public class Velero extends Barco {
    private int numMastiles;

    public Velero() {
    }
    
    public Velero(int numMastiles, int eslora, int matricula) {
        super(eslora, matricula);
        this.numMastiles = numMastiles;
    }
    
    @Override
    public float aluguer(){
        float resultado;
        int diasOcupacion = Integer.parseInt(JOptionPane.showInputDialog("dias ocupacion"));
        numMastiles = Integer.parseInt(JOptionPane.showInputDialog("numero de mastiles"));
        return resultado = diasOcupacion*moduloBase()*numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "Matrícula=" + super.getMatricula() + " Eslora=" + super.getEslora() + " numMastiles=" + numMastiles + '}';
    }
    
    
}
