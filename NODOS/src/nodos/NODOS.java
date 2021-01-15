/*
 *VAZQUEZ SILVA DANTE.
 *3S11
 */
package nodos;

import java.util.Scanner;

public class NODOS {
 Scanner sc = new Scanner(System.in);
     
    static class Nodo {
        String dato;
        Nodo sig; 
    }
    
    Nodo fin = null; 
//METODOS: AGREGAR, MOSTRAR Y ELIMINAR NUEVO METODO
    public void agregar() { 
        Nodo temp;
        System.out.println("agregar el dato ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;  
        }    
    }
//AQUI TERMINA EL METODO DE AGREGAR 
    // DONDE NOS AGREGARIA LOS DATOS QUE INGRESEMOS UNA VEZ QUE YA PASAMOS POR  EL MENU
    public void mostrar() {

        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                if(actual.dato!=null){
                System.out.print(" DATO " + "[" + actual.dato + "]\n");
                };
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");//imprimimos que esta vacio
        }
    }
       ///AQUI TERMINA EL METODO MOSTRAR
        //DONDE NOS MOSTRARA LOS DATOS UNA VEZ INGRESADOS O AGREGADOS POR EL OTRO METODO
    public void eliminar() {
    	if(fin!=null) {
    		fin=fin.sig;
    	}else {
    		System.out.print("No hay nada que eliminar en el nodo");
    	}
      
    }
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        NODOS n = new NODOS();
        do {
            System.out.println("1 Agregar \n"
                    + "2 Mostrar dato \n"
                    + "3 Eliminar DATO\n"
                    + "4 Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar(); 
                    break;

                case 2:
                    n.mostrar();
                    break;
                case 3:
                    n.eliminar();
                    break;
                case 4: 
                    System.out.println("fin");
                    break;
                    default:
                        System.out.println("Invalido");
                        
            }
        } while (opt != 5);
    }
    
}
