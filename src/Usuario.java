
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class Usuario {
    
    String Nome;
    String Banco;
    int Senha;
    
    
    void dados_usuario(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu banco: ");
        Banco = ler.next();
        System.out.println("O banco escolhido foi: " + Banco);
        
        Scanner nome = new Scanner(System.in);
        System.out.println("Confirme o nome do Usuário: ");
        Nome = nome.next();
        System.out.println("O nome do usuário é: " + Nome);
        
        
        Scanner pass = new Scanner (System.in);
        System.out.println("Digite a sua Senha");
        Senha = pass.nextInt();
        System.out.println("Senha digitada");   
             
        
    }
    
    
    void operacao(){
        
        Scanner op = new Scanner(System.in);
        int Operação;
        System.out.println("Digite a operação desejada");
        Operação = op.nextInt();
        System.out.println("Operação Escolhida foi : " + Operação);
         
        switch (Operação) {
                case 1:
                    System.out.println("Depósito");
                    break;
                case 2:
                    System.out.println("Saldo Conta Corrente");
                    break;
                case 3:
                    System.out.println("Conta Poupança");
                    break;
                case 4:
                    System.out.println("Saldo");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        
    }
    
}
