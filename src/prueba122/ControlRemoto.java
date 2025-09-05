package prueba122;

public class ControlRemoto {
    
    //El control es asociacion de agregacion, xq no necesariamente necesita el control la tv y viceversa
    private Televisor tv;
    
    
    public ControlRemoto(){
        
    }
    
    public void setTv(Televisor tv){
        this.tv = tv;
    }
    
    
    //Osea que si tengo una tv, puedo usar sus atributos
    public void encender(){
        if(tv != null){
            tv.power();
        }
    }
    
    public void subirCanal(){
        if(tv != null){
            tv.subirCanal();
        }
    }
    
    
}
