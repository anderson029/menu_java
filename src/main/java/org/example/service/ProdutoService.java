package org.example.service;

import org.example.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoService {

    private VerificarNumeroInteiro verificarNumeroInteiro = new VerificarNumeroInteiro();
    private static List<Produto> listProduto = new ArrayList<>();
    boolean produtoRemovido = false;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto(){
            System.out.println("Informe a marca do produto");
            String marca = scanner.next();
            System.out.println("Informe o modelo do produto");
            String modelo = scanner.next();
            System.out.println("Informe a cor do produto");
            String cor = scanner.next();
            int ano = verificarNumeroInteiro.obterValorInteiro("Informe o ano do produto, deve ser números no formato ex:{1990}:");
            int quantidade = verificarNumeroInteiro.obterValorInteiro("Informe a quantidade do estoque, deve ser números inteiros, ex {1}: ");
            Produto novoProduto = new Produto(marca, modelo, cor, ano, quantidade);
            listProduto.add(novoProduto);
            System.out.println("Produto cadastrado com sucesso!");
    }
    public void listarProdutos() {
        if (listProduto.isEmpty())
            System.out.println("Não existem produtos cadastrados: ");
        else{
            for (Produto produto : listProduto){
                System.out.print(produto);
            }
        }
    }

    public void removerProduto() {
        if (listProduto.isEmpty()){
            System.out.println("Não existem produtos para ser removidos: ");
        }
        else {
            System.out.println("Digite o id do produto para exclusão: ");
            Integer id = scanner.nextInt();
            for (int i = 0; i < listProduto.size(); i++) {
                if (listProduto.get(i).getId() == id) {
                    listProduto.remove(i);
                    produtoRemovido = true;
                    break;
                }
            }
        }
        if(produtoRemovido) {
            System.out.println("Produto removido com sucesso, Lista atualizada: ");
            for(Produto produto : listProduto){
                System.out.println(produto);
                produtoRemovido = false;
            }
        } else {
            System.out.println("Não existe esse produto cadastrado, por favor liste os produtos e verifique o id correspondente!");
        }

    }

    public void consultarEstoque() {
        System.out.println("Informe o id do produto para consultar o estoque: ");
        Integer id = scanner.nextInt();
        for(int i = 0; i < listProduto.size(); i++){
            if(listProduto.get(i).getId() == id){
                System.out.printf("O estoque do produto %s é: %d %n" + "\n", listProduto.get(i).getModelo(), listProduto.get(i).getQuantidade());
                break;
            }
            if (i == listProduto.size() - 1) { // Checa se é a última iteração do loop
                System.out.println("Id de produto não encontrado, por favor verifique sua lista de produtos!\n");
            }
        }
    }
}
