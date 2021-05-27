public class OperacoesListaOrdenada {

    public double Cos(ListaSE lista1, ListaSE lista2) {
        double retorno = 0;
        if (lista1.tamanho == lista2.tamanho) {
            No n1 = lista1.primeiro;
            No n2 = lista2.primeiro;
            double num = 0;
            double somaA1 = 0;
            double somaA2 = 0;
            double den = 0;
            while(n1 != null && n2 != null) {
                somaA1 += Math.pow(n1.dado, 2); //elevando ao quadrado
                somaA2 += Math.pow(n2.dado, 2);
                num += n1.dado * n2.dado;
                n1 = n1.proximo;
                n2 = n2.proximo;
            }
            den = Math.sqrt(somaA1 * somaA2); //
            retorno = num / den;
        }
        else {
            System.out.println("Tamanhos diferentes de Lista");
        }
        return retorno;
    }

    public ListaSE intersecao(ListaSE l1, ListaSE l2) {
        ListaSE l3 = new ListaSE();
        No n1 = l1.primeiro;
        No n2 = l2.primeiro;

        while(n1 != null) {
            if(n2 == null) {
                n2 = l2.primeiro;
                n1 = n1.proximo;
            }
            else if(n1.dado == n2.dado) {
                l3.insereOrdenado(n1.dado);
                n1 = n1.proximo;
                n2 = l2.primeiro;
            }
            else {
                n2 = n2.proximo;
            }
        }
        return l3;
    }
}
