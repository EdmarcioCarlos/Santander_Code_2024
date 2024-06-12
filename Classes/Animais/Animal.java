package Classes.Animais;

public abstract class Animal {

    protected String nome;
    protected String cor;
    protected float peso;
    protected String humor;
    
    //Construtor universal dos animais
    public Animal(String nome,String cor,float peso,String humor)
    {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.humor = humor;

    } 
    
    //#region (get e set)
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
    //#region (Metodos universair dos animais)
    public void comer()
    {

    }
    public void dormi()
    {
        
    }
    public abstract void soar();

    public String Interagir(String acao)
    {
        switch (acao) 
        {
            case "Carinho": this.humor = "Feliz";
                break;
            case "Gritar": this.humor = "Raiva";
                break;
            case "Vai dormi": this.humor = "Cansado";
                break;

            default: this.humor = "erro";
        }

        return humor;
    }
    
    // Print informações dos animais
    public void Print()
    {
        System.out.println("--------------------------");
        System.out.println("O nome do Animal e : " + nome);
        System.out.println("A cor do animel e : " + cor);
        System.out.println("O peso do animal e : " + peso+ " kg");
        System.out.println("O humor atual do animal e : " + humor);
    }
    //#endregion
}
