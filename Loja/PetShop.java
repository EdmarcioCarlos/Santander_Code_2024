package Loja;

import Animais.Animal;
import Animais.Cachorro;

public class PetShop {
    

    public void darBanho(Animal _Animal)
    {
        _Animal.setHumor("Feliz");
    }

    public void darVacina(Animal _Animal)
    {
        _Animal.setHumor("Raiva");
    }

    public void hospedar (Animal _Animal)
    {
        _Animal.setHumor("Triste");
    }

    public void treinar(Cachorro _Cachorro)
    {
        _Cachorro.setHumor("Apreenssivo");
    }

}
