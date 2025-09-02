
package prueba122;

public class Prueva122_2 {
    
    public static void main(String[] args) {
        
        /*
        int i = 10;
        int j;
        
        j = i++; //postincremento, aca vale 10
        j = ++i; //preincremento, aca vale 11, lo incrementa antes
        */       
        
        Televisor tv1 = new Televisor("Sony", 55);
        Televisor tv2 = new Televisor("Samsung", 65);
        
        //tv1.mostrarInfo();
        
        
        for(int i=0; i < 20; i++){
            tv1.subirCanal();
            tv1.mostrarInfo();
        }
        
        tv1.mostrarInfo();
        
    }
}
