package inverterString;

public class InverterString {

        public static void main(String[] args) {

            // Definindo a string a ser invertida
            String texto = "Exemplo de texto a ser invertido para o nosso teste";

            // Convertendo a string para um array de caracteres
            char[] chars = texto.toCharArray();

            // Invertendo a ordem dos caracteres
            for (int i = 0; i < chars.length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = temp;
            }

            // Convertendo o array de caracteres de volta para uma string
            String textoInvertido = new String(chars);

            // Imprimindo o resultado
            System.out.println("Texto original: " + texto);
            System.out.println("Texto invertido: " + textoInvertido);

        }

    }

