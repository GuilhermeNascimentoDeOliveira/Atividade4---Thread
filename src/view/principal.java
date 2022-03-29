package view;

import java.util.concurrent.Semaphore;

import controller.ativa;

public class principal {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforonorte = new Semaphore(permissoes);

		Semaphore semaforosul = new Semaphore(permissoes);

		for (int idAvião = 1; idAvião <= 12; idAvião++) {
			Thread aviao = new ativa(idAvião, semaforonorte, semaforosul);
			aviao.start();
		}
	}

}