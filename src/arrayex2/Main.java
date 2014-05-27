package arrayex2;

import javax.swing.JOptionPane;

public class Main {  
    public static void main(String[] args) {
int idade[]=new int[10];
int par=0;
int impar=0;
        for (int i=0;i<10;i++){
        idade[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        if((idade[i]%2)==0) {
            par+=1;
        }
        if((idade[i]%2)!=0) {
            impar+=1;
        }}
        
        int idadePar[]=new int[par];
        int idadeImpar[]=new int[impar];
        
        int ip=0;
        int p=0;
        
        for (int i=0;i<idade.length;i++){
        if((idade[i]%2)==0) {
            idadePar[p]=idade[i];
            p++;
        }
        if((idade[i]%2)!=0) {
            idadeImpar[ip]=idade[i];
            ip++;
        }
        }System.out.print("Clientes Idade Impares");
        for (int i=0;i<idadeImpar.length;i++){
            System.out.print(idadeImpar[i]+",");
        }System.out.print("Cliente idade Pares");
        for (int i=0;i<idadePar.length;i++){
            System.out.print(idadePar[i]+",");
        }
        
        }
 }

    


