/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author ALUNOS
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraBasica c = new CalculadoraBasica ();
        c.setTitle("Calculadora");
        //Define titulo da tela
        c.setSize(485,300);
        //Define o tamanho da tela
        c.setDefaultCloseOperation(CalculadoraBasica.EXIT_ON_CLOSE);
        //Fecha a janela
        c.setVisible(true);
        //Torna a janela visível
        c.setResizable(false);
        //Desabilita o maximizar
        c.setLocationRelativeTo (null);
    }
    
}
