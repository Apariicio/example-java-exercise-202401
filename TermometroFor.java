package Lista5;
import java.util.Scanner;

public class TermometroFor {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int vezes;
            double temp;
            double[] temps = new double[12];
            double soma = 0;

            for(vezes=0; vezes<12; vezes++){
                System.out.print("Por favor, informe a temperatura atual" + (vezes+1) + ": ");
                temp = scanner.nextDouble();
                if(temp < 4 || temp > 10){
                    System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
                    vezes--;
                    continue;
                }

                temps[vezes] = temp;            
                soma += temp;
               
            }
            int media = (int) (soma / 12);
            System.out.println("A media das temperaturas de hoje e: " + media + "°C");

   scanner.close();
        }
    }
    
}