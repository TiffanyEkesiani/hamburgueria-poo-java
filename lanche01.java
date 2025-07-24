package aula004;

// Subclasse - herda de hamburger
abstract class lanche01 extends hamburger implements Cardapio {
    void escolherXTUDO() {
        System.out.println("O hamburger escolhido do Cardapio foi X-Tudo.");
    }


}
