/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author ged20
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
    
        //si es fin de semana da igual el numero de bellotas que haya
        if (finDeSemana){
        return true;
        }
        //si llega aqui es que no es fin de semana
        if (numBellotas >= 40 && numBellotas <=60){
        return true;
        }
        return false;
    }
    
 /**
  * multa: Si    la    velocidad    es    de    60    o    menos,    el    resultado    es    0    Si    la    velocidad    es    de    entre    61    y    80    inclusive,    el    resultado    es    1    Si    la    velocidad    es    81    o    más,    el    resultado    es    2    a    menos    que    sea    tu    cumpleaños    :    en    ese    día,    tu    velocidad    puede    ser    5    puntos    superior    en    todos    los    casos.    
  */
    
    public int multa (int velocidad, boolean birthday){
        //si es su cumple se restan 5kmh
        if (birthday){
            velocidad = velocidad - 5; //velocidad -= 5;
        }
        //si va a menos de 60kmh
        if (velocidad <= 60){
        return 0;
        }
        //si va entre 60 y 80 kmh
        if (velocidad > 60 && velocidad <= 80){
        return 1;
        }
        //mas de 80
        return 2;
    }
    //evaluar si el numero es vanidoso. Es vanidoso si es multiplo de 11 o multiplo de 11 mas 1
    public boolean muyVanidoso (int numero){
        //si el resto da cero o uno
        if (numero % 11 < 2){
        return true;
        }
        //si da cualquier otro resultado
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto de la clase en la que estamos(EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        
        System.out.println("Ejercicio 01 ardillas:");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        System.out.println("Ejercicio 02 multa:");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        
        System.out.println("Ejercicio 03 muyVanidoso:");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
    }
    
}
