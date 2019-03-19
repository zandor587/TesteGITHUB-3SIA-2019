package bola;

public class Bola {

	String cor;
	double raio;

	// variavel declarada dentro do metodo é local

	public Bola(String cor, double raio) {
		// o this acessa a variável global lá fora (this é para variavel DESTA CLASSE)
		this.cor = cor;
		this.raio = raio;
	}

	public Bola() {
		this(null, 0);
	}

	public Bola maiorBola(Bola bola2, Bola bola3) {
		// o this sozinho tem o endereço de memoria do objeto que fez a chamada, no caso
		// o bola1
		Bola aux = this;

		if (bola2.raio > this.raio && bola2.raio > bola3.raio) {
			aux = bola2;
		} else if (bola3.raio > this.raio) {
			aux = bola3;
		}
		return aux;
	}

	public String retornarDados() {
		return cor + " " + raio;
	}

}
