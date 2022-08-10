public class Pilha {
    //Aqui é aplicado o conceito de FILA - First IN Last OUT
    int inicio;
    int fim;
    int tamanho; 
    int qtdElementos;
    int lista[];

    public Pilha() {
        inicio= fim = -1;
        tamanho = 200;
        lista = new int[tamanho];
        qtdElementos = 0;
    }

    public boolean estaVazia() {
        if(this.qtdElementos == 0) {
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if(this.qtdElementos == this.tamanho - 1) {
            return true;
        } 
        return false;
    }

    public void adicionar(int e) {
        if( ! estaCheia()) {
            if(this.inicio == -1) {
                inicio = 0;
            }
            this.fim++;
            this.lista[fim] = e;
            this.qtdElementos++;
        }
    }

    public void remover(){
        if(!this.estaVazia()){
            this.fim--;
            this.qtdElementos--;
        }
    }

    public void imprimirLista() {
        String elementos = "";
        for(int i = inicio; i <= fim; i++) {
            elementos+= lista[i] + " - ";
            
        }
        
        System.out.println(elementos);
    }


public static void main(String[] args) {
    Pilha pilha = new Pilha();

    for(int i = 0; i <= 10; i++) {
        pilha.adicionar(i);
    }
    pilha.imprimirLista();


    for(int i = 0; i < 5; i++) {
        pilha.remover();
    }

    pilha.imprimirLista();
}
    
}
