package Animais;

public class Gato {

    //#region (Variaveis)
    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private float peso;
    private int tamanhoDoRabo;
    private String humor;
    //#endregion

    /*Construtor */
    public Gato(String nome,String cor,int altura,float peso, int tamanhoDoRabo, String humor)
    {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.humor = humor;

        numeroDeGatos++;
    }
    //#region (Get e Sets)
    //#endregion
    //#region (Metodos)


    //#endregion
}