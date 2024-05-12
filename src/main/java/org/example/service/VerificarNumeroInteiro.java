package org.example.service;

import java.util.Scanner;

public class VerificarNumeroInteiro {
    Scanner scanner = new Scanner(System.in);
    public VerificarNumeroInteiro() {
    }
    public int obterValorInteiro(String mensagem){
        System.out.println(mensagem);
        while(!scanner.hasNextInt()){
            System.out.println("Valor incorreto, por favor digite um valor conforme o exemplo!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

}
