package prueba122;

import java.util.Scanner; //Con Ctrl + Barra espaciadora al final de la palabra

public class Prueba122 {
    
    
    //Hacer una funcion, fuera del main
    public static int sumar(int a, int b){ //Con 2 parametros
        
        return a + b; //Si no retornara nada iria "void" al lado de static, como en el main
        
    }
    

    public static void main(String[] args) {

        System.out.println("Hola mundo");

        int carlos = 10;

        //Condicional
        if (carlos > 11) {
            System.out.println("no");
        } else {
            System.out.println("si");
        }

        String mes = "Enero";

        switch (mes) {
            case "Enero":
                System.out.println("Hace calor");
                break;
            case "Febrero":
                System.out.println("Hace mas calor");
                break;
            default:
                System.out.println("Hace calor");
        }

        //Loop
        int n = 1; //variable de control

        while (n <= 10) {
            System.out.println(n);
            n++; //sumamos un + 1, variable de control
        }

        //forma correcta para ver la variable de control si se la cantidad de repeticiones:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        
        
        //Input
        Scanner input = new Scanner(System.in); //Hay q importar Scanner primero de los otros paquetes
                                                //Luego creamos un Scanner y le decimos para q va a ser utilizado
                                                //Como crear un destornillador y decirle q punta va a llevar
        
        String nombre;
        
        System.out.print("Ingrese su nombre: "); //El print sin el "ln" deja el cursor en la misma linea
                                                
        nombre = input.next();
        
        System.out.println("Su nombre es " + nombre);
        
        ////
        
        int edad;
        String dato;
 
        System.out.print("Ingrese su nombre: ");
                                                
        // edad = input2.next(); //Aca si ingreso un "4" x ej, estaria ingresando str, xq ingresa el ASCCI
                                //tengo q pasarlo a int en este caso
        
        dato = input.next(); //Lo guardo en una variable string y luego lo convierto
                             //Puedo utilizar siempre el mismo input
        edad = Integer.parseInt(dato); //Integer convierte dato de str a int
        
        System.out.println("Su edad es " + edad);
        
        
        
        //Pero si se que voy a escanear un entero, puedo utilizar lo siguiente:
        int dato2;
        System.out.print("Ingrese un numero: ");
        dato2 = input.nextInt(); 
        System.out.println("El numero es " + dato2);
        
        
        
        //Estructura repetitiva:
        int numero = 0; //Le tengo q dar un valor para q entre al while una vez por lo menos
        while(numero != -1){
            System.out.print("Ingrese un numero o -1 para salir: ");
            
            numero = input.nextInt();
            System.out.println("Ingresaste el numero " + numero);
        }
        System.out.println("Fin del programa");
        
        
        //Para no tener q ponerle un valor a la variable numero, uso Do While:
        int numero2;
        
        do{
            System.out.print("Ingrese un numero o -1 para salir: ");
            
            numero2 = input.nextInt();
            System.out.println("Ingresaste el numero " + numero2);
            
        } while(numero2 != -1); //Pongo la condicion a lo ultimo con el While
        
        System.out.println("Fin del programa");
        
        
        
        
        //Calcular promedio:
        int a = 9;
        int b = 4;
        
        double promedio; //Usamos double en java en vez de float
        
        promedio = (a + b) / 2;
        
        System.out.println("El promedio es " + promedio); //En este caso nos devolveria 6.0, no 6.5 
                                                         //xq ambos numeros son int, me devuelve 6 y al guardarse 
                                                         //en double me agrega un decimal "0"
        
        //Para que no suceda eso y no tener que cambiar los ints x double:
        promedio = (double)(a + b) / 2; //El double afecta a+b por estar a la derecha y en parentesis y lo convierte
                                        //Lo "convierte" en el momento de la cuenta pero no cambia las variables
        
        System.out.println("El promedio es " + promedio);
        
        
        
        
        //Usamos la Funcion "sumar"
        int x = 4;
        int y = 5;
        int rta = sumar(x, y);
        
        System.out.println("La suma es " + rta);
        
    }

}
