
package boletin29;

import javax.swing.JOptionPane;

public class Yate extends Barco {
    private int numCamarotes = 3;
    private float potencia = 2;

    public Yate() {
    }

    public Yate(int eslora, int matricula) {
        super(eslora, matricula);
        this.numCamarotes = numCamarotes;
        this.potencia = potencia;
    }
    
    @Override
    public float aluguer(){
        float resultado;
        int diasOcupacion = Integer.parseInt(JOptionPane.showInputDialog("dias ocupacion"));
        return resultado = diasOcupacion*moduloBase()*potencia*numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{"+ "Matrícula=" + super.getMatricula() + "Eslora=" + super.getEslora() + "numCamarotes=" + numCamarotes + ", potencia=" + potencia + '}';
    }

    

    
    
    
}
