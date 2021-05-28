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
public class Vista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cedula ="0106306061";
        for(int i=0;i<cedula.length();i++)
        {
            int c=0;
            String val=cedula.substring(i, i+1);
            int num=Integer.parseInt(val)/2;
            System.out.println(num);
            if(num==0)
            {
                c=Integer.parseInt(val)*2;
                if(c<=10)
                {
                    c=c-9;
                }
            }
            int tem=num+c;
            System.out.println("suma"+tem);
        }
        
    }
    
}
