package Classes.Animais;

public class Cachorro extends Animal{
    
    
    //#region (Construtor)  
    
    public Cachorro(String nome,String cor,float peso,String humor)
    {
        super(nome, cor, peso, humor);
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.humor = humor;
    } 
    //#endregion

    //#region(Gets e Sets)
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

    //#region (Metodos)
    public String Pegar()
    {
        return "Bolinha";
    }

    @Override
    public void soar()
    {
        System.out.println("--------------------------");
        System.out.println("AU AU!!!");
        System.out.println("--------------------------");
    }
    //#endregion
}
