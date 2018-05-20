
package boletin29;

import java.util.ArrayList;

public class Boletin29 {

    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList();
        Barco v = new Velero();
        Barco y = new Yate();
        barcos.add(y);
        
        System.out.println(y.aluguer());
        
        for(int i=0;i<barcos.size();i++){
            System.out.println(barcos.get(i).toString());
        }
    }
    
}
