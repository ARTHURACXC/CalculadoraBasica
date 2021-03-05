
package calculadorabasica;

import java.util.Scanner;

/* @author ARTHUR CASTRO*/

public class CalculadoraBasica {
    public static void main(String[] args) {
        
        float num1, num2, resultado;
        int op;
        String resp;
        
        Scanner teclado = new Scanner(System.in);
        
        /*ENTRADA DE DADOS*/
        do{
        
        System.out.println("\n\n\n***CALCULADORA DE OPERAÇÕES BÁSICAS***");
        
        System.out.println("\nDigite o primeiro numero: ");
        num1 = teclado.nextFloat();
        
        System.out.println("\nDigite o psegundo numero: ");
        num2 = teclado.nextFloat();
        
        System.out.println("\nESCOLHA A OPERACAO:\n1-ADICAO\n2-SUBTRACAO\n3-MULTIPLICACAO\n4-DIVISAO\n");
        op = teclado.nextInt();
                
        /*PROCESSAMENTO*/
        
        switch (op) {
            case 1:
            {
                resultado = num1 + num2;
                System.out.printf("Resultado = %.2f\n", resultado);
                break;
            }
            case 2:
            {
                resultado = num1 - num2;
                System.out.printf("Resultado = %.2f\n", resultado);
                break;
            }
            case 3:
            {
                resultado = num1 * num2;
                System.out.printf("Resultado = %.2f\n", resultado);
                break;
            }
            case 4:
            {
                resultado = num1 / num2;
                System.out.printf("Resultado = %.2f\n", resultado);
                break;
            }
            default:
                System.out.println("OPERACAO INVALIDA!\n");
                break;
        }
            System.out.println("Deseja continuar? [S/N}");
            resp=teclado.next();
            
        }while (resp.equals("s")||resp.equals("S"));
    }
    
}
