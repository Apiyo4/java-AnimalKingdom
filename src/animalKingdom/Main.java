package animalKingdom;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Mammals panda =  new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloath", 1804);
        Mammals armadillo= new Mammals("Armadillo", 1978);
        Mammals raccoon= new Mammals("Raccoon", 1758);
        Mammals bigfoot= new Mammals("Bigfoot", 2021);


        Birds pigeon= new Birds("Pigeon", 1837);
        Birds peacock= new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot= new Birds("Parrot", 1824);
        Birds swan= new Birds("Swan", 1758);

        Fish salmon= new Fish("Salmon", 1758);
        Fish catfish= new Fish("Catfish", 1817);
        Fish perch= new Fish("Perch", 1758);
        ArrayList<AnimalAbstract> mammalList = new ArrayList<AnimalAbstract>();
        mammalList.add(panda);
        mammalList.add(zebra);
        mammalList.add(koala);
        mammalList.add(sloth);
        mammalList.add(armadillo);
        mammalList.add(raccoon);
        mammalList.add(bigfoot);
        ArrayList<AnimalAbstract> birdList = new ArrayList<AnimalAbstract>();
        birdList.add(pigeon);
        birdList.add(peacock);
        birdList.add(toucan);
        birdList.add(parrot);
        birdList.add(swan);
        ArrayList<AnimalAbstract> fishList = new ArrayList<AnimalAbstract>();
        fishList.add(salmon);
        fishList.add(catfish);
        fishList.add(perch);
    }
}