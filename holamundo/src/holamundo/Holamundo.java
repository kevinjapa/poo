/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.*;
/**
 *
 * @author japak
 */
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b=1;
        while(b>=1)
        {
            //EDAD
            System.out.print("-EDAD-"+" \nINGRESE LA EDAD:");
            Scanner teclado=new Scanner(System.in);
            int edad=teclado.nextInt();
            if(edad<2){System.out.println("BEBE");}
            else if(edad<12){System.out.println("NIÑO");}
            else if(edad<18){System.out.println("JOVEN");}
            else if(edad<65){System.out.println("ADULTO MAYOR");}
            else{System.out.println("TERCERA EDAD");}

            // CALENDARIO
            System.out.print("-CALENDARIO-"+"\nINGRESE EL MES:");
            int a=teclado.nextInt();
            if(a==1){System.out.println("ENERO");}
            else if(a==2){System.out.println("FEBRERO");}
            else if(a==3){System.out.println("MARZO");}
            else if(a==4){System.out.println("ABRIL");}
            else if(a==5){System.out.println("MAYO");}
            else if(a==6){System.out.println("JUNIO");}
            else if(a==7){System.out.println("JULIO");}
            else if(a==8){System.out.println("AGOSTO");}
            else if(a==9){System.out.println("SEPTIEMBRE");}
            else if(a==10){System.out.println("OCTUBRE");}
            else if(a==11){System.out.println("NOVIEMBRE");}
            else if(a==12){System.out.println("DICIEMBRE");}
            else{System.out.println("VALOR DEL MES INGRESADO ES NO EXISTE");}
            System.out.println("******************");
        }
    }
    
}
