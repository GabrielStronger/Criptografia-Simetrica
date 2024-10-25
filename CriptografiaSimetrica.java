import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CriptografiaSimetrica {

    public static void main(String[] args) {
        // Scanner configurado com codificação UTF-8 para leitura correta de acentos
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());

        System.out.print("Digite o texto aqui: ");
        String textoClaro = scanner.nextLine();

        // Cifragem do texto
        String textoCifrado = mostrarCifrado(textoClaro);
        System.out.println("Texto Cifrado: " + textoCifrado);

        // Decifragem do texto cifrado
        String textoDecifrado = mostrarClaro(textoCifrado);
        System.out.println("Texto Decifrado: " + textoDecifrado);

        scanner.close();
    }

    // Método para cifrar cada letra do texto com base nas regras de substituição
    public static char cifrarLetra(char letra) {
        switch (letra) {
            case 'Z': return 'P';
            case 'P': return 'Z';
            case 'E': return 'O';
            case 'O': return 'E';
            case 'N': return 'L';
            case 'L': return 'N';
            case 'I': return 'A';
            case 'A': return 'I';
            case 'T': return 'R';
            case 'R': return 'T';
            case 'z': return 'p';
            case 'p': return 'z';
            case 'e': return 'o';
            case 'o': return 'e';
            case 'n': return 'l';
            case 'l': return 'n';
            case 'i': return 'a';
            case 'a': return 'i';
            case 't': return 'r';
            case 'r': return 't';
            default: return letra;  // Retorna inalterado caso não seja letra mapeada, preservando acentos
        }
    }

    // Método para cifrar o texto completo
    public static String mostrarCifrado(String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        for (char letra : texto.toCharArray()) {
            textoCifrado.append(cifrarLetra(letra));
        }
        return textoCifrado.toString();
    }

    // Método para decifrar o texto completo
    public static String mostrarClaro(String texto) {
        StringBuilder textoClaro = new StringBuilder();
        for (char letra : texto.toCharArray()) {
            textoClaro.append(cifrarLetra(letra));
        }
        return textoClaro.toString();
    }
}
