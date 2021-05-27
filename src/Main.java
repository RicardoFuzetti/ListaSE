public class Main {

    public static void main(String[] args) {

        ListaSE lista1 = new ListaSE();
        ListaSE lista2 = new ListaSE();
        OperacoesListaOrdenada op = new OperacoesListaOrdenada();

        lista1.insereOrdenado(2);
        lista1.insereOrdenado(3);
        lista1.insereOrdenado(60);
        lista1.insereOrdenado(9);
        lista1.algoritmo();
        lista1.imprime();


    }
}
