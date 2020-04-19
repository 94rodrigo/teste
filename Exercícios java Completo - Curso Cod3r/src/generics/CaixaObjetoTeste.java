package generics;

public class CaixaObjetoTeste {
	
	// Exemplo SEM generics
	
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //double -> Double
		
		Double coisa = (Double)caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String)caixaB.abrir();
		System.out.println(coisaB);
	}
}
