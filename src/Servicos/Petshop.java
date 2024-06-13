package Servicos;

import Animal.Animal;
import Animal.Cachorro;

public class Petshop {

    public void darBanho(Animal animal) {
        System.out.println(animal.getNome() + " está tomando banho!");
        animal.setEstadoDeEspirito("feliz e saltitante!");
    }

    public void tosar(Cachorro cachorro) {
        System.out.println(cachorro.getNome() + " está tosando!");
        cachorro.setEstadoDeEspirito("tremendo de frio!");
    }

    public void deixarNoHotel(Animal animal) {
        System.out.println(animal.getNome() + " ficou com saudade enquanto esteve fora!");
        animal.setEstadoDeEspirito("triste e com saudade!");
    }

}