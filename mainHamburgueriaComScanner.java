package aula004;

import java.util.Scanner;

public class mainHamburgueriaComScanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Escolha seu lanche ===");
        System.out.println("1 - X-Tudo");
        System.out.println("2 - X-Salada");
        System.out.print("Digite sua opção: ");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            // Instancia o lanche X-Tudo
            lanche01 xtudo = new lanche01() {
                @Override
                public void escolherHamburger() {

                }
            };
            // Chama os métodos específicos do X-Tudo
            xtudo.escolherHamburger();
            xtudo.preparar();
            xtudo.escolherXTUDO();

        } else if (opcao == 2) {
            // Instancia o lanche X-Salada
            lanche02 xsalada = new lanche02() {
                @Override
                public void escolherHamburger() {

                }
            };
            // Chama os métodos específicos do X-Salada
            xsalada.escolherHamburger();
            xsalada.preparar();
            xsalada.escolherXSALADA();

        } else {
            System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}
