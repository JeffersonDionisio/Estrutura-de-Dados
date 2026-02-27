import java.util.Scanner;

/**
 * 📏 Classe AreaRetangulo
 * <p>
 * Este programa lê a base e a altura de um retângulo fornecidas pelo usuário
 * e calcula a sua área utilizando a fórmula:
 * </p>
 * 
 * <pre>
 * área = base * altura
 * </pre>
 * 
 * <p><b>Autor:</b> Professor George Mendes Marra</p>
 * <p><b>Disciplina:</b> Programação Orientada a Objetos</p>
 */
public class AreaRetangulo {

    /**
     * Método principal — ponto de entrada do programa.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        // --- Entrada de dados ---
        System.out.print("Digite o valor da base do retângulo: ");
        double base = input.nextDouble(); // Lê a base

        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = input.nextDouble(); // Lê a altura

        // --- Processamento ---
        // Calcula a área utilizando a fórmula matemática: área = base * altura
        double area = base * altura;

        // --- Saída de dados ---
        System.out.println("\n📐 Cálculo da Área do Retângulo 📐");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
            

        // Fecha o Scanner para liberar recursos
        input.close();
    }
}
