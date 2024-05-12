package org.example;


import org.example.service.ProdutoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();

        boolean sair = false;
        while (!sair) {
            System.out.println("======= MENU =======");
            System.out.println("[1] Cadastrar produto");
            System.out.println("[2] Listar produto");
            System.out.println("[3] Remover produto");
            System.out.println("[4] Consultar estoque");
            System.out.println("[0] Sair");
            System.out.println("Escolha uma opção: ");

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()){
                int opcao = scanner.nextInt();
                switch (opcao){
                    case 1:
                        produtoService.cadastrarProduto();
                        break;
                    case 2:
                        produtoService.listarProdutos();
                        break;
                    case 3:
                        produtoService.removerProduto();
                        break;
                    case 4:
                        produtoService.consultarEstoque();
                        break;
                    case 0:
                        System.out.println("Saindo do programa...");
                        sair = true;
                        break;
                }
            }
            else{
                System.out.println("Opção inválida! Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner
            }

        }
    }
}