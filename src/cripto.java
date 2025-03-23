import javax.swing.JOptionPane;

public class cripto {
        public static void main(String[] args) throws Exception {
                // inicio do programa coletar variavel que será criptografada
                // exibir uma caixa de dialogo para o usuario inserir uma string
                String string_input = JOptionPane.showInputDialog(null,
                                "<html><font color='blue'>Entre com uma String:</font>",
                                "Insira Letras para Criptografar", JOptionPane.DEFAULT_OPTION);

                // exibicao String digitada
                JOptionPane.showMessageDialog(null,
                                "<html><font color='blue'>A String digitada foi :</font>" + " " + string_input,
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
                                        "<html><font color = 'green'><n>Caracatere : </n></font>" + c
                                                        + "<font color = 'blue'><br><i><n>Valor tabela ASCII :</i></n></font>"
                                                        + ascii_original,
                                        "Valor Original", JOptionPane.NO_OPTION);

                        // exibir o caractere criptografado
                        JOptionPane.showMessageDialog(null,
                                        "<html><font color = 'green'><n>Caracatere : </n></font>" + c
                                                        + "<font color = 'blue'><br><i><n>Valor tabela ASCII + 10 unidades : </i></n></font>"
                                                        + ascii_criptografado,
                                        "Valor Criptografado", JOptionPane.NO_OPTION);

                        // converter o novo valor ascii para caractere
                        char string_criptografada = (char) (ascii_criptografado);

                        // adiciona o caracter criptografado a mensagem criptografada
                        mensagem_criptografada.append(string_criptografada);
                }

                // exibir a mensagem criptografada
                JOptionPane.showMessageDialog(null,
                                "<html><font color = 'red' size ='5'><n> Mensagem Criptografada : </n><br></font>"
                                                + mensagem_criptografada.toString(),
                                "Mensagem Criptografada", JOptionPane.NO_OPTION);

                // avaliação do projeto
                int escolha = JOptionPane.showConfirmDialog(null,
                                "Você gostou do projeto ?", "Avaliação",
                                JOptionPane.YES_NO_OPTION);
                if (escolha == JOptionPane.YES_OPTION) {

                        JOptionPane.showMessageDialog(null,
                                        "<html><font color='green'>Obrigado pela avaliação</font>",
                                        "Avaliação", JOptionPane.NO_OPTION);

                } else {
                        JOptionPane.showMessageDialog(null,
                                        "Que pena, irei melhorar",
                                        "Avaliação", JOptionPane.NO_OPTION);
                }

        }
}
