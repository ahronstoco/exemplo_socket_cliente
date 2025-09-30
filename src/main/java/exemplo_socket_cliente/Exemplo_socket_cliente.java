import java.net.*;
import java.io.*;
import javax.swing.*;

public class Exemplo_socket_cliente {

    public static void main(String args[]) {
        try {
            Socket servidor = new Socket("localhost", 4444);
            PrintWriter out = new PrintWriter(
                    servidor.getOutputStream(), true);
            String mensagem = "";
            while (!mensagem.equals("fim")) {
                mensagem = JOptionPane.
                        showInputDialog("Digite a Mensagem ou fim para sair");
                out.println(mensagem);
            }
        } catch (IOException io) {
            System.err.println("Problemas de IO");
        }
    }
}
