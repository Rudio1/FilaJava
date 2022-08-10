//Aqui é aplicado o conceito de FILA - First IN Last OUT

class Fila {
    int inicio;
    int fim;
    int tamanho; 
    int qtdElementos;
    int lista[];

    public Fila() {
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
            this.inicio++;
            this.qtdElementos++;
        }
    }

    public void imprimirLista() {
        String elementos = "";
        for(int i = inicio; i <= fim; i++) {
            elementos+= lista[i] + " - ";
            
        }
        
        System.out.println(elementos);
    }
}