package prueba122;


public class Televisor {
    
    // public Televisor(){} Si no lo ponemos Java lo pone igual, asi q no hace falta ponerlo, pero está
    
    //Todos los atributos tiene q ser privados
    private final String marca; //Final xq es una constante en cada televisor que no cambia
    private final double tamanio; //private para q no aparezca el "metodo" al hacer tv1. x ej
    private int canal;
    private int volumen;
    private boolean estaEncendido;
    private boolean mute;
    private int nroSerie;
 
    //Todo lo static ocurre una vez sola, cuando se carga el programa y ya se guarda en memoria
    private static final int MAX_CANAL = 10; //cantidad de canales, final es para q no se pueda cambiar en ningun tv (const en js)
    private static final int MIN_CANAL = 1;    //Usamos static para q sea comun para todas las instancias, se reserva
                                                //en la memoria ni bien este el objeto "funcionando"
    private static final int MIN_VOLUMEN = 0;
    private static final int MAX_VOLUMEN = 10;
    private static final int INITIAL_SERIE = 100_000;
    private static int nextSerie = INITIAL_SERIE; //No se pisa en el proximo objeto xq es static
    
    
    
    //CONSTRUCTOR
    public Televisor(String marca, double tamanio){ //Usamos el constructor por defecto q java pone automaticamente y lo modificamos
        validarTamanio(tamanio);
        validarMarca(marca);
        this.tamanio = tamanio;   
        this.marca = marca;                         //Podemos poner ambas y q se pueda hacer de ambas maneeras
        //nroSerie = nextSerie++; // Como es postincremento, se le asigna el valor y luego se suma pero ese valor no se asiga a esta variable
                                // Nos ahorramos un paso
        nroSerie = getSerieAndIncrement(); // Pero lo hacemos asi para que quede mas claro, sin tener q ver el codigo
    }
    
    
    private void validarMarca(String marca){
        if(marca == null || marca.isEmpty() || marca.isBlank() || marca.length() < 2){
            throw new IllegalArgumentException("Marca invalida");
        }
    }
    
    
    //Si el metodo es de instancia, es para cada objeto en particular, si es de clase es para todos a la vez
    public void power(){
        estaEncendido = !estaEncendido;
        mostrarEncendido();
    }
    
    
    private void mostrarEncendido(){
        System.out.println(estaEncendido ? "Power On" : "Power Off");
    }
    
    
    private static int getSerieAndIncrement(){
        return nextSerie++;
    }
    
    
    private void validarTamanio(double tamanio){
        //tamanio = 32; //Tamaño base, pero esta mal, no deberian llegar tamaños negativos
        if (tamanio <= 0){ //Entonces hacemos esto
            throw new IllegalArgumentException("Tamaño invalido");//Manejamos el error y con un try catch mostramos el msj
        }
    }
    
    private void validarEncendido(){
        if (!estaEncendido) {
            throw new IllegalStateException("La Tv esta apagada");
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
        validarEncendido();
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + getTamanio());
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println(estaEncendido ? "Encendido" : "Apagado");
        System.out.println("----------------------------");
    }
    
    private void mostrarCanal(){ //Hacemos esta funcion para q no haya codigo repetido en subir y bajar canal
        System.out.println("Canal: " + canal);
    }
    
    
     public void subirCanal(){
        validarEncendido();
        if(canal < MAX_CANAL){
            canal++;
        }else{
            canal = MIN_CANAL;
        }
        mostrarCanal();
    }
    
    
    public void bajarCanal(){
        validarEncendido();
        if(canal > MIN_CANAL){
            canal--;
        }else{
            canal = MAX_CANAL;
        }
        mostrarCanal();
    }
    
    
    //VOLUMEN
    private void mostrarVolumen(){
        System.out.println("Volumen: " + volumen);
    }
    
    public void subirVolumen(){
        validarEncendido();
        if(volumen < MAX_VOLUMEN){
            volumen++;
            mute = false;
        }
        mostrarVolumen();
    }
    
    public void bajarVolumen(){
        validarEncendido();
        if(volumen > MIN_VOLUMEN){
            volumen--;
            mute = false;
        } else {
            mute = true;
        }
        mostrarVolumen();
    }
    
    public void switchMutear(){
        validarEncendido();
        mute = !mute;
        mostrarVolumen();
    }
    
    
    //CANALES
    private void validarCanal(int canal){
        if (canal < MIN_CANAL || canal > MAX_CANAL){
            throw new IllegalArgumentException("Canal incorrecto");
        }
    }
    
    public void setCanal (int canal){
        validarEncendido();
        validarCanal(canal);
        this.canal = canal;
        mostrarCanal();
    }
    
    
    
    
}
