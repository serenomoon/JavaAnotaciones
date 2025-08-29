package prueba122;


public class Televisor {
    
    // public Televisor(){} Si no lo ponemos Java lo pone igual, asi q no hace falta ponerlo, pero está
    
    //Todos los atributos tiene q ser privados
    private String marca;
    private double tamanio; //private para q no aparezca el "metodo" al hacer tv1. x ej
    private int canal;
    private int volumen;
    private boolean estaEncendido;
    private static final int MAX_CANAL = 10; //cantidad de canales, final es para q no se pueda cambiar (const en js)
    private static final int MIN_CANAL = 1;    //Usamos static para q sea comun para todas las instancias
    
    public Televisor(String marca, double tamanio){ //Usamos el constructor por defecto q java pone automaticamente y lo modificamos
        validarTamanio(tamanio);
        this.tamanio = tamanio;   
        this.marca = marca;                         //Podemos poner ambas y q se pueda hacer de ambas maneeras
    }
    
    private void validarTamanio(double tamanio){
        //tamanio = 32; //Tamaño base, pero esta mal, no deberian llegar tamaños negativos
        if (tamanio <= 0){ //Entonces hacemos esto
            throw new IllegalArgumentException("Tamaño invalido");//Manejamos el error y con un try catch mostramos el msj
        }
    }
    
    
//    private void setTamanio(double tam) { //Hacemos una funcion para que el tamaño sea mayor a un numero determinado
//        if (tam > 0) {
//            tamanio = tam;
//        } else {
//            System.out.println("El tamaño debe ser mayor a 0");
//        }
//    }
    
    public double getTamanio(){ //Hacemos una funcion para poder ver el tamanio, pero no modificarlo
        return tamanio;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Encendido: " + estaEncendido);
        System.out.println("----------------------------");
    }
    
    public void subirCanal(){
        if(canal == MAX_CANAL){
            canal = MIN_CANAL;
        }else{
            canal++;
        }
    }
    
    public void bajarCanal(){
        if(canal == MIN_CANAL){
            canal = MAX_CANAL;
        }else{
            canal--;
        }
    }
    
}
