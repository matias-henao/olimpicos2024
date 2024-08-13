package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANOS

        //PARRA CADA PAIS NECESITO ALMACENAR EL NUMERO DE:
        //MEDALLAS DE ORO
        //MEDALLAS DE PLATA
        //MEDALAS DE BRONCE

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS

        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        //TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE LOS PAISES SURAMERICANOS

        ///////////////////////////////////////////////////////////////////////////

        ArrayList<String> paises =new ArrayList<>();
        ArrayList<Integer> medallas=new ArrayList<>();

        Scanner leer=new Scanner(System.in);

        System.out.println("***OLIMPICOS 2024***");

        for (int i=0; i<3; i++){
            String pais;
            int sumatoriasMedallas=0;
            System.out.print("ingrese un pais: ");
            pais=leer.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE CADA PAIS
            System.out.print("Digita el numero de medallas de oro de "+pais+": ");
            int medallasOro=leer.nextInt();
            System.out.print("Digita el numero de medallas de plata de "+pais+": ");
            int medallasPlata=leer.nextInt();
            System.out.print("Digita el numero de medallas de bronce de "+pais+": ");
            int medallasBronce=leer.nextInt();
            sumatoriasMedallas=medallasOro+medallasPlata+medallasBronce;
            System.out.println(pais+" octuvo en total: "+sumatoriasMedallas+"  medallas en Paris");

            leer.nextLine();
            medallas.add(sumatoriasMedallas);


        }
        //RECORRIENDO UN ARREGLO
        int paisMayor=medallas.get(0);

        for (Integer medalla:medallas){

            if (medalla>paisMayor){
                paisMayor=medalla;
            }

        }
        System.out.println("El pais con mas medallas obtuvo un total de: "+paisMayor);

        //quiero preguntar cual es el cajon (indice) donde se guardo la cantidad
        int indiceGanador=medallas.indexOf(paisMayor);
        System.out.println("El indice ganador es el "+indiceGanador);
        //quiero obtener el vamor que hay dentro de un cajon
        System.out.println("Asi pues, el pais ganador fue: "+paises.get(indiceGanador));

        int paisMenor=medallas.get(0);
        for (Integer medalla:medallas){
            if (medalla<paisMenor){
                paisMenor=medalla;
            }
        }
        int indicePerdedor=medallas.indexOf(paisMenor);
        System.out.println("El `pais con menos medallas obtuvo un total de "+paisMenor);
        System.out.println("El pais que quedo de ultimo fue: "+paises.get(indicePerdedor));
    }
}