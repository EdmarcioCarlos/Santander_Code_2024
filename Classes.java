import Animais.Cachorro;

public class Classes {
    public static void main(String[] args) {

        Cachorro pet1 = new Cachorro("Ted","preto",25,1.5f,5,"Neutro");
        System.out.println(pet1.getNumeroDeCachorros());
        Cachorro pet2 = new Cachorro("Nick","preto",25,1.5f,5,"Neutro");
        System.out.println(pet1.getNumeroDeCachorros());

        System.out.println(pet1);
        System.out.println(pet2);

        /*
        pet1.Print();
        pet1.Interagir("Carinho");
        pet1.Print();
        */
    }
}