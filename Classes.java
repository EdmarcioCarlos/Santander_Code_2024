import Animais.Cachorro;

public class Classes {
    public static void main(String[] args) {

        Cachorro pet1 = new Cachorro("TED","preto",25,1.5f,5,"Neutro");
        pet1.Print();
        pet1.Interagir("Carinho");
        pet1.Print();

    }
}