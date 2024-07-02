package iphone.aparelho;

import iphone.funcionalidades.AparelhoTelefonico;
import iphone.funcionalidades.NavegadorWeb;
import iphone.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorWeb, AparelhoTelefonico {
    public void atender() {
        System.out.println("ATENDENDO...");
	}

	public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
	}

	public void ligar() {
        System.out.println("LIGANDO...");
	}

    public void exibirPagina(){
        System.out.println("EXIBINDO PÁGINA");
    }

	public void adicionarNovaAba(){
        System.out.println("NOVA ABA ADICIONADA");
    }

	public void atualizarAba(){
        System.out.println("ATUALIZANDO ABA...");
    }

	public void pesquisar(){
        System.out.println("PESQUISANDO...");
    }

    public void tocar(){
        System.out.println("TOCANDO MÚSICA...");
    }

	public void pausar(){
        System.out.println("MÚSICA PAUSADA");
    }

	public void selecionarMusica(){
        System.out.println("SELECIONANDO MÚSICA...");
    }
}
