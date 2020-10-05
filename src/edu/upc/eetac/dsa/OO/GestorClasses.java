package edu.upc.eetac.dsa.OO;

import edu.upc.eetac.dsa.OO.figuras.Cercle;
import edu.upc.eetac.dsa.OO.figuras.Figura;
import edu.upc.eetac.dsa.OO.figuras.Quadrat;
import edu.upc.eetac.dsa.OO.figuras.Rectangle;

import java.util.Arrays;

public class GestorClasses {

    public static void sort (Figura[] v){       //mecanisme per ordenar vector figures
    }

    public static double suma (Figura[] v){     //mecanisme per proporcionar suma area total
        double ret = 0;
        for (Figura f: v) {
            ret+= f.area();
        }
        return ret;
    }
    public static void main(String[] args) {       //punt entrada on farem el testing
        Figura[] v =new Figura[3];              //iniciem vector (v) amb 3 posicions
        v[0] = new Cercle(5);                     //posició 0
        v[1] =new Rectangle(2,1);                   //posició 1
        v[2] =new Quadrat(2);                     //posició 2

        double r = GestorClasses.suma(v);     //invoquem el vector v, ens ha de donar el resultat de la suma total

        System.out.println(r);      //r ens envia el valor de la area global a la consola de sortida standard

        System.out.println(Arrays.asList(v));
        GestorClasses.sort(v);
        System.out.println(Arrays.asList(v));



    }


}
