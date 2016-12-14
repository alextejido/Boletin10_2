/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jriveiroromero
 */
public class Xogo {
    
    int num;
    int intent;
    int num2;
    int valorab;
    public void xogador1(){
        
        
       
        num=(int) Math.floor((Math.random()*50)+1);
        intent=Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de intentos"));
        
        
        do{
        num2=Integer.parseInt(JOptionPane.showInputDialog("Adiviñe o numero"));
            for(int i=1;i<intent;i++)
            
            valorab= Math.abs(num-num2);
            
            if(valorab>20){
                System.err.println("O numero esta moi lonxe");
                num2=Integer.parseInt(JOptionPane.showInputDialog("Adiviñe o numero"));}
            else if(valorab>=10 || valorab<=20){
                System.err.println("Lonxe");
                num2=Integer.parseInt(JOptionPane.showInputDialog("Adiviñe o numero"));}
            else if(valorab>=5 || valorab<=10){
                System.err.println("Preto");
                num2=Integer.parseInt(JOptionPane.showInputDialog("Adiviñe o numero"));}
            else if(valorab<5)
                System.err.println("Moi preto");
            } while (num==num2);
            System.out.println("Numero correcto");
            
      
        }
             
}  


