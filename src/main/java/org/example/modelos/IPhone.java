package org.example.modelos;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class IPhone implements Telefone, Navegador, TocadorDeMusica {


    private List<String> musicas = List.of("musica1" , "musica2", "musica3");

    private Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para" + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Em chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Consultando correio eletronico");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova aba");
    }

    @Override
    public void recarregarPagina(String url) {
        System.out.println("atualizando " + url );
    }

    @Override
    public void tocar(int numero) {
        System.out.println("tocando" + musicas.get(numero -1));
    }

    @Override
    public void pausar() {
        System.out.println("pausa");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musicas");
        for (int i = 0; i < musicas.size() ; i++) {
            System.out.println(i+1 + " - " + musicas.get(i) );
        }

        System.out.println("Digite o numero da musica");
        var musicasSelecionada = teclado.nextInt();

        System.out.println("Musica Selecionada" + musicas.get(musicasSelecionada-1));



    }
}
