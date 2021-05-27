public class ListaSE {
    public No primeiro;
    public No ultimo;
    public int tamanho;

    public ListaSE(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public boolean vazia(){
        return (this.primeiro == null);
    }

    public void inserePrimeiro(int elemento){
        No p = new No(elemento);

        if (vazia()){
            this.primeiro = p;
            this.ultimo = p;
        }else{
            p.proximo = this.primeiro;
            this.primeiro = p;
        }
        tamanho++;
    }

    public void insereUltimo(int elemento){
        No p = new No(elemento);

        if (vazia()){
            this.primeiro = p;
            this.ultimo = p;
        }else{
            this.ultimo.proximo = p;
            this.ultimo = p;
        }
        tamanho++;
    }

    public void insereOrdenado(int elemento) {
        if(vazia()){
            inserePrimeiro(elemento);
        } else if(elemento < primeiro.dado) {
            inserePrimeiro(elemento);
        } else if(elemento > ultimo.dado) {
            insereUltimo(elemento);
        } else {
            No p = primeiro;
            No q = null;
            while(p.dado < elemento) {
                q = p;
                p = p.proximo;
            }
            insereDepois(elemento,q);
        }
        tamanho++;
    }

    public void insereDepois(int elemento, No p) {
        No novo = new No(elemento);
        novo.proximo = p.proximo;
        p.proximo = novo;
        tamanho++;
    }

    public void imprime(){
        No p = this.primeiro;
        while(p != null){
            System.out.println(p.dado);
            p = p.proximo;
        }
    }

    public int ultimoElemento() {
        if (vazia()){
            System.out.println("Lista está vazia!!!");
        } else {
            System.out.println(ultimo.dado);
            return ultimo.dado;
        }
        return ' ';
    }

    public void retiraPrimeiro() {
        if (vazia()){
            System.out.println("Lista está vazia!!!");
        } else {
            primeiro = primeiro.proximo;
            tamanho--;
        }
    }

    public void retiraUltimo() {
        if (vazia()){
            System.out.println("Lista está vazia!!!");
        } else{
            No p = this.primeiro;
            No q = null;
            while(p.dado < this.ultimo.dado) {
                q = p;
                p = p.proximo;
            }
            q.proximo = null;
            this.ultimo = q;
            this.tamanho--;
        }
    }

    public void retiraDepois(No no) {
        if (vazia()){
            System.out.println("Lista está vazia!!!");
        } else {
            no.proximo = no.proximo.proximo;
            tamanho--;
        }
    }

    public void algoritmo()
    {
        No p = primeiro, q, r = null;

        while(p != null)
        {
            q = p.proximo;
            p.proximo = r;
            r = p;
            p = q;
        }
        if (primeiro != null)
        {
            p =  ultimo;
            ultimo = primeiro;
            primeiro = p;
        }
    }

}
