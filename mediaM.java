import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
																					  // Exerc�cio 2021 - Fase 2 - M�dia ou mediana
public class mediaM {                                                                 // Explica��o:
                                                                                      // M�todo principal com o m�todo do bufferedreader/inputstreamreader
	                                                                                  // Foi utilizado o bufferedreader por conta dele ser mais r�pido, pois ele simplesmente l� a sequ�ncia de caracteres, enquanto o scanner faz a an�lise dos dados de entrada 
    public static void main(String[] args) throws IOException {                       // IOException � utilizado para evitar erros no sistema de leitura                                                                                                                                     
    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	// Declara��o de vari�veis
	int a = Integer.parseInt(leitor.readLine());                                      // Integer.parseInt � utilizado para converter uma string em um int
	int b = Integer.parseInt(leitor.readLine());

	// Processamento & Sa�da
	if (a < b)                                                                       // A mediana sempre ser� determinada pelo menor n�mero (A/B) para atender o menor inteiro poss�vel para C
	    System.out.println(2*a-b);                                                   // explica��o matem�tica: ((a+b+c)/3)=a) {caso A seja menor que b}
	else                                                                             // igualando os dois lados da equa��o fica (a=(1/2)*b+(1/2)*c)
	    System.out.println(2*b-a);                                                   // Como queremos descobrir a vari�vel c, e n�o podemos declarar meia vari�vel como na express�o anterior
    }                                                                                // multiplicamos a igualdade por 2 e isolamos o c, ficando (c=(2*a)-b)
}

