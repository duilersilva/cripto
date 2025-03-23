import javax.swing.JOptionPane;

public class cripto {
        public static void main(String[] args) throws Exception {
                // inicio do programa coletar variavel que será criptografada
                // exibir uma caixa de dialogo para o usuario inserir uma string
                String string_input = JOptionPane.showInputDialog(null,
                                "<html><font color='blue' size='5'>Entre com uma String:</font></html>",
                                "Insira Letras para Criptografar", JOptionPane.DEFAULT_OPTION);
                // exibicao String digitada
                JOptionPane.showMessageDialog(null,
                                "A String digitada foi:  " + string_input,
                                "O que será Criptografado", JOptionPane.DEFAULT_OPTION);

                // converter a string para um array de caracteres
                char[] caracteres = string_input.toCharArray();

                // StringBuilder para armazenar a mensagem criptografada
                StringBuilder mensagem_criptografada = new StringBuilder();

                // percorrer cada caractere da string com um loop
                for (char c : caracteres) {
                        int ascii_original = (int) c;
                        int ascii_criptografado = (int) ascii_original + 10;

                        // exibir o caractere e o seu valor em ASCII
                        JOptionPane.showMessageDialog(null,
                                        "Caractere : " + c + " - Valor decimal do caractere na tabela ASCII: "
                                                        + ascii_original,
                                        "Valor Original", JOptionPane.NO_OPTION);
                        // exibir o caractere criptografado
                        JOptionPane.showMessageDialog(null,
                                        "Caractere: " + c
                                                        + " - Valor decimal do caractere na tabela ASCII + 10 unidades: "
                                                        + ascii_criptografado,
                                        "Valor Criptografado", JOptionPane.NO_OPTION);
                        // converter o novo valor ascii para caractere
                        char string_criptografada = (char) (ascii_criptografado);

                        // adiciona o caracter criptografado a mensagem criptografada
                        mensagem_criptografada.append(string_criptografada);
                }

                // exibir a mensagem criptografada
                JOptionPane.showMessageDialog(null,
                                "A mensagem criptografada é: " + mensagem_criptografada.toString());

                // avaliação do projeto
                int escolha = JOptionPane.showConfirmDialog(null,
                                "Você gostou do projeto ?", "Avaliação", JOptionPane.YES_NO_OPTION);
                if (escolha == JOptionPane.YES_OPTION) {

                        JOptionPane.showMessageDialog(null,
                                        "<html><font color='red'>Obrigado pela avaliação</font></html>",
                                        "Avaliação", JOptionPane.NO_OPTION);

                } else {
                        JOptionPane.showMessageDialog(null,
                                        "Que pena, irei melhorar",
                                        "Avaliação", JOptionPane.NO_OPTION);
                }

        }
}

/*
 * JOptionPane.showMessageDialog(null,
 * "<html><i>Primeira Linha</i><br>Segunda linha<br>Terceira linha</html>",
 * "Quebra de Linha", JOptionPane.NO_OPTION);
 * JOptionPane.showMessageDialog(null,
 * "<html><font color='red'>Texto Vermelho</font></html>",
 * "Cor Personalizada", JOptionPane.NO_OPTION);
 * 
 * JOptionPane.showMessageDialog(null,
 * "<html><font size='56'>Texto Grande</font></html>",
 * "Tamanho de Fonte", JOptionPane.NO_OPTION);
 */