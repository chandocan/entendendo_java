package forInvertido;
/*
  	Em Java, um "for" invertido é basicamente um loop "for" que começa no valor 
  	máximo e diminui até o valor mínimo, em vez de começar no valor mínimo e
	aumentar até o valor máximo. qui está um exemplo de como escrever um 
	"for" invertido em Java:
*/
public class ForInvertido {

	public static void main(String[] args) {
		int num [] = {1,2,43,6,7};
		//for (int i = maxValue; i >= minValue; i--) {
		    // código a ser executado em cada iteração do loop
		//}
		
		// for invertido
		for(int i = num.length - 1; i >= 0; i-- ) {
			System.out.println(num[i]);
		}

		
	}

}
