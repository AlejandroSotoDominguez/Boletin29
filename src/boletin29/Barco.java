
package boletin29;

import javax.swing.JOptionPane;

public abstract class Barco {
    private int eslora;
    private int matricula;

    public Barco() {
    }

    public Barco(int eslora, int matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    

    public float aluguer(){
        float resultado;
        int diasOcupacion = Integer.parseInt(JOptionPane.showInputDialog("dias ocupacion"));
        return resultado = diasOcupacion*moduloBase();
    }
    
    public int moduloBase(){
        int modulo;
        eslora = Integer.parseInt(JOptionPane.showInputDialog("eslora"));
        return modulo=eslora*10;
    }

    @Override
    public String toString() {
        return "Barco{" + "eslora=" + eslora + ", matricula=" + matricula + '}';
    }
    
    
}
