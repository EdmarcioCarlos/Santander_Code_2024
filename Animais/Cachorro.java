package Animais;

public class Cachorro {
    
    private String nome;
    private String cor;
    private int altura;
    private float peso;
    private int tamanhoDoRabo;
    private String humor;
    static int numeroDeCachorros;

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

    public int getAltura()
    {
        return this.altura;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    public Float getPeso()
    {
        return this.peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public int getTamanhoDoRabo(int tamanhoDoRabo)
    {
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo)
    {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getHumor()
    {
        return this.humor;
    }

    public void setHumor(String humor)
    {
        this.humor = humor;
    }
    
    public int getNumeroDeCachorros()
    {
        return this.numeroDeCachorros;
    }

    public void setNumeroDeCachorros(int numeroDeCachorros)
    {
        this.numeroDeCachorros = numeroDeCachorros;
    }
    //#endregion

    //#region (Construtor)  

    public Cachorro(){}
    
    public Cachorro(String nome,String cor, int altura,float peso, int tamanhoDoRabo,String humor)
    {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.humor = humor;

        numeroDeCachorros++;
    } 
    //#endregion

    //#region (Metodos)
    public void Comer()
    {
        System.out.println("Estou comendo");
    }

    public void Soar()
    {
        System.out.println("AU AU");
    }

    public String Pegar()
    {
        return "Bolinha";
    }

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

    // Printa todas informações do animal
    public void Print()
    {
        System.out.println("-----------------------------");
        System.out.println("O nome do Cachorro e : " + nome);
        System.out.println("A cor do Cachorro e : " + cor);
        System.out.println("A altura do cachorro e : " + altura);
        System.out.println("O Peso do cachorro e : " + peso);
        System.out.println("O tamanho do rabo e : " + tamanhoDoRabo);
        System.out.println("O Humor atual : " + humor);
        System.out.println("-----------------------------");
    }
    //#endregion

    @Override
    public String toString()
    {
        return "O nome do Cachorro e : "+nome;
    }
}
