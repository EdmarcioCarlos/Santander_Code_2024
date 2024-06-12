package Classes;
import Classes.Animais.Cachorro;
import Classes.Animais.Gato;
import Classes.Animais.Passaro;
import Classes.Loja.PetShop;

public class Classes {
    public static void main(String[] args) {

        PetShop petShop = new PetShop();

        Cachorro cachoro01 = new Cachorro("Ted","preto",1.5f,"Neutro");
        Gato gato01 = new Gato("Rajada", "Laranja", 0.5f, "Neutro"); 
        Passaro passaro01 = new Passaro("Jack", "Azul", 1.5f, "Neutro");


        
        cachoro01.Print();
        gato01.Print();
        passaro01.Print();

        petShop.darBanho(passaro01);
        petShop.darVacina(gato01);
        petShop.treinar(cachoro01);

        cachoro01.Print();
        gato01.Print();
        passaro01.Print();

        cachoro01.soar();
        gato01.soar();
        passaro01.soar();
    }
}