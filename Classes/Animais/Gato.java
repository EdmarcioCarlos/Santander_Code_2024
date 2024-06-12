package Classes.Animais;

public class Gato extends Animal{


    /*Construtor */
    public Gato(String nome,String cor,float peso, String humor)
    {
        super(nome, cor, peso, humor);
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.humor = humor;
    }
    //#region (Get e Sets)
    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCor()
    {
        return this.cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public Float getPeso()
    {
        return this.peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public String getHumor()
    {
        return this.humor;
    }

    public void setHumor(String humor)
    {
        this.humor = humor;
    }
    //#endregion
    
    //#region(Metodos)
    @Override
    public void soar()
    {
        System.out.println("--------------------------");
        System.out.println("Miauuuu!!!");
        System.out.println("--------------------------");
    }
    //#endregion
}