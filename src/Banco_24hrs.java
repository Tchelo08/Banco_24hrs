/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class Banco_24hrs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       Scanner ler = new Scanner(System.in);
       String bancos;
       System.out.println("Digite seu banco: ");
       bancos = ler.next();
       System.out.println("O banco escolhido foi: " + bancos);  
       
       if (bancos.equals("Bradesco")){
           
           Scanner op = new Scanner (System.in); //Prepara a entrada de dados.
           int operacao;
           System.out.println("Digite a operação : ");
           operacao = op.nextInt();
           System.out.println("A operação escolhida foi : " + operacao);
       
           switch(operacao){
               case 1 :
                   System.out.println("Depósito");
                   break;
               case 2 :
                   System.out.println("Saldo Conta Corrente");
                   break;
               case 3 : 
                   System.out.println("Conta Poupança");
                   break;
               case 4 : 
                   System.out.println("Saldo");
                   break;
               default :
                   System.out.println("Opção inválida");
           
           }  
           
    }else if(bancos.equals("Itau")){
          
       Scanner op = new Scanner (System.in); //Prepara a entrada de dados.
       int operacao;
       System.out.println("Digite a operação : ");
       operacao = op.nextInt();
       
       switch(operacao){
           
           case 1 :
                   System.out.println("Depósito");
                   break;
               case 2 :
                   System.out.println("Saldo Conta Corrente");
                   break;
               case 3 : 
                   System.out.println("Conta Poupança");
                   break;
               case 4 : 
                   System.out.println("Saldo");
                   break;
               default:
               System.out.println("Opção inválida");
        }
    }else if(bancos.equals("Caixa Econômica")){
        
        Scanner op = new Scanner (System.in); //Prepara a entrada de dados.
       int operacao;
       System.out.println("Digite a operação : ");
       operacao = op.nextInt();
       
       switch(operacao){
           
           case 1 :
                   System.out.println("Depósito");
                   break;
               case 2 :
                   System.out.println("Saldo Conta Corrente");
                   break;
               case 3 : 
                   System.out.println("Conta Poupança");
                   break;
               case 4 : 
                   System.out.println("Saldo");
                   break;
               default :
                   System.out.println("Opção inválida");
        
    }
       
        
    }else if(bancos.equals("Santander")){
        Scanner op = new Scanner (System.in); //Prepara a entrada de dados.
       int operacao;
       System.out.println("Digite a operação : ");
       operacao = op.nextInt();
       
       switch(operacao){
           
           case 1 :
                   System.out.println("Depósito");
                   break;
               case 2 :
                   System.out.println("Saldo Conta Corrente");
                   break;
               case 3 : 
                   System.out.println("Conta Poupança");
                   break;
               case 4 : 
                   System.out.println("Saldo");
                   break;
               default :
                   System.out.println("Opção inválida");
    }
        
        
        
        
        
        
        
        
    }
     
   
              
          
}
}

    
