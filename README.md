# ListaSE
Cálculo de similaridade entre duas listas com MESMO tamanho n utilizando a função do cosseno:
 
Cos(X,Y) = ... ver arquivo anexo

onde X e Y são listas, Li é o i-ésimo elemento da lista L. O valor produzido pela função deve ser um número real entre [0.0 , 1.0], sendo o valor 1.0 a similaridade máxima possível.

Determinação da interseção entre duas listas de inteiros de tamanho quaisquer. Dadas duas listas X e Y, retorne uma terceira lista ORDENADA que contém os elementos comuns entre elas.
 

OBS: A estrutura de lista simplesmente encadeada e as seguintes operações são pré-requisito para a apresentação das soluções das questões 1 e 2, ou seja, só poderá apresentar a solução das questões quem tiver desenvolvido integralmente as seguintes operações sobre a lista em JAVA:
 

boolean vazia(); // Verifica se a lista L está vazia

void insere_primeiro( int info);    // Insere o elemento info como primeiro na lista L

void insere_depois(Node * No, int info);  // Insere o elemento info depois do nó No

void insere_ultimo(int info);       // Insere o elemento info como último na lista L

void insere_ordenado(int info); // Insere o elemento info de maneira ordenada na lista

void mostra_lista();                            // Mostra em Tela os Elementos da Lista L

int retira_primeiro(); // Retira o primeiro elemento da Lista e retorna o valor da info do No

int retira_ultimo();           // Retira o último elemento da Lista e retorna a informação do Nó

int retira_depois(Node No);             // Retira o elemento posterior ao nó No e retorna a sua informação

int ultimo_elemento();   // Retorna a informação do último elemento da Lista
