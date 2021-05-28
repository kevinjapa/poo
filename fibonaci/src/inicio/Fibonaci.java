/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;
/**
 *
 * @author japak
 */
public class Fibonaci {
 
    public static void main(String[] args) {
 
        int v1 = 0;
        int v2 = 1;
        int a = 10;
        System.out.print(v1+"-"+v2+"-");
        for(int i=0;i<a-2;i++)
        {
            v2=v1+v2;
            v1=v2+v1;
            System.out.print(v2+"-");
        }
    }
}