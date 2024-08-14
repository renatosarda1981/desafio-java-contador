import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        int primeiroParametro;
        int segundoParametro;
        
        try {
          
            try ( // Receber os parametros
                Scanner recebeParametros = new Scanner(System.in)) {
                System.out.println("Digite o primeiro parâmetro: ");
                primeiroParametro = recebeParametros.nextInt();
                System.out.println("Digite o segundo parâmetro: ");
                segundoParametro = recebeParametros.nextInt();
            }
           

            
            // Verificar se o primeiro parâmetro é maior que o segundo

            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }
            
           

            // Loop para imprimir os números incrementados
            for (int i = 1; i <= segundoParametro - primeiroParametro; i++) {
                System.out.println("Imprimindo o número " + i);
            }
                      
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            
            
        } 
        
    }
}
