package aula004;

// SuperClass
public class hamburger {
    String pontoCarne;
    String tipoQueijo;


    void preparar(){
        System.out.println("O hambuger está sendo preparado.");
    }
}

    // Interface
    interface Cardapio {
        void escolherHamburger();
    }
