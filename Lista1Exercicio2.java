package lista1exercicio2;

import java.util.Scanner;

public class Lista1Exercicio2 {

    public static void main(String[] args) {
        
        float ladoA,ladoB, PR, AR;
        
        System.out.println("Algoritimo para calcular a area e perimetro de uma sala");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a medida do lado da sala:");
        ladoA=teclado.nextFloat();
        System.out.println("Digite a medida do comprimento da sala");
        ladoB=teclado.nextFloat();
        
        AR=ladoA*ladoB;
        PR=(ladoA*2)+(ladoB*2);
        
        System.out.println("A area total da sala é de: ");
        System.out.println(AR);
        System.out.println("O perimetro total da sala é de:");
        System.out.println(PR);
        
    }   
    
}
