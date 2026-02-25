package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner LER = new Scanner(System.in);

    public static int lerInteiro() {
        int valor = LER.nextInt();
        LER.nextLine();
        return valor;
    }

    public static String lerString() {
        return LER.nextLine();
    }

    public static void main(String[] args) {

        System.out.println("=== Criar Personagem ===");
        System.out.print("Nome do personagem: ");
        String nome = lerString();

        System.out.print("Classe (Guerreiro, Mago...): ");
        String classe = lerString();

        Personagem personagem = new Personagem(nome, classe);

        System.out.print("Quantos itens deseja adicionar? ");
        int qtd = lerInteiro();

        for (int i = 0; i < qtd; i++) {

            System.out.print("Nome do item: ");
            String nomeItem = lerString();

            System.out.print("Está equipado? (1-Sim / 0-Não): ");
            int equipadoInt = lerInteiro();

            boolean equipado = equipadoInt == 1;

            personagem.getInventario().adicionarItem(new Item(nomeItem, equipado));
        }

        System.out.print("Nome da Guilda: ");
        String nomeGuilda = lerString();

        Guilda guilda = new Guilda(nomeGuilda);
        guilda.adicionarMembro(personagem);

        System.out.println("\n=== INVENTÁRIO ===");
        for (Item i : personagem.getInventario().getItens()) {
            System.out.println(i.getNome());
        }

        System.out.println("\n=== ITENS EQUIPADOS ===");
        for (Item i : personagem.getInventario().getItens()) {
            if (i.isEquipado()) {
                System.out.println(i.getNome());
            }
        }

        System.out.println("\n=== MEMBROS DA GUILDA ===");
        for (Personagem p : guilda.getMembros()) {
            System.out.println(p.getNome());
        }
    }
}