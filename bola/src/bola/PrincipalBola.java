package bola;

import javax.swing.JOptionPane;

public class PrincipalBola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cor;
		double raio;

		//esse é estatico pois n depende de objeto
		cor = JOptionPane.showInputDialog("Cor da bola 1");
		raio = JOptionPane.showInputDialog("Raio da bola 1");
		
		
		Bola bola1 = new Bola("azul", 2.75);
		Bola bola2 = new Bola("branca", 3.5);
		Bola bola3 = new Bola("vermelha", 3.25);

		
		//o objeto bola1 chama o maiorBola
		Bola aux = bola1.maiorBola(bola2, bola3);
		//a variavel aux indica que o metodo esta sendo buscado em outra classe. Se nao houvesse a variavel indicaria que o metodo estaria sendo chamado dentro da propria classe principal
		System.out.println("Dados da bola com o maior raio -> " + aux.retornarDados());
		

	}

}
