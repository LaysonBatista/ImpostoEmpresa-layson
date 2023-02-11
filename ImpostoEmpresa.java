
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author layson
 */
public class ImpostoEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto");
        double valorDoProduto = scanner.nextDouble();

        System.out.println("Digite o estado de destino do produto (em minusculo e sem acento): ");
        scanner.nextLine();
        String estadoDestino = scanner.nextLine();
        

        switch (estadoDestino) {
            case "minas gerais" -> {
                double percentualImposto = 7;
                double impostoMg = valorDoProduto + (percentualImposto / 100) * valorDoProduto;
                System.out.println("Valor do produto mais imposto: " + impostoMg);
            }
            case "sao paulo" -> {
                double percentualImposto = 12;
                double impostoSp = valorDoProduto + (percentualImposto / 100) * valorDoProduto;
                System.out.println("Valor do produto mais imposto: " + impostoSp);
            }
            case "rio de janeiro" -> {
                double percentualImposto = 15;
                double impostoRj = valorDoProduto + (percentualImposto / 100) * valorDoProduto;
                System.out.println("Valor do produto mais imposto: " + impostoRj);
            }
            case "mato grosso do sul" -> {
                double percentualImposto = 8;
                double impostoMs = valorDoProduto + (percentualImposto / 100) * valorDoProduto;
                System.out.println("Valor do produto mais imposto: " + impostoMs);
            }
            default -> throw new IllegalArgumentException("O estado digitado e invalido.");
        }

        
    }
    
}
