package animalKingdom;

import java.util.*;

public class Main{
        public static ArrayList<AnimalAbstract> filteredList = new ArrayList<AnimalAbstract>();
        
        public static void printAnimalsSorted(ArrayList<AnimalAbstract> animals, CheckAnimal tester) {
            filteredList.clear();
            for (AnimalAbstract v : animals) {
                if (tester.test(v)) {
                    // Parrot eggs fly lungs 1824
                    System.out.println(
                            v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breath() + " " + v.getYear());
                }
            }
        }
        
        public static void printAnimals(ArrayList<AnimalAbstract> animals, CheckAnimal tester){
            filteredList.clear();
            animals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
            for(AnimalAbstract v: animals){
                if (tester.test(v)) {
                    // Parrot eggs fly lungs 1824
                    System.out.println(v.getName() + " " +  v.reproduce() + " " + v.move()+ " " + v.breath() + " "+ v.getYear());
                }
            }
        }
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
        ArrayList<AnimalAbstract> myList = new ArrayList<AnimalAbstract>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);
        System.out.println("List all the animals in descending order by year named");
    //    List all the animals in descending order by year named
        myList.sort((v1, v2) -> v2.getYear() - v1.getYear());
        myList.forEach((v) -> System.out.println(v));
    //    List all the animals alphabetically
        System.out.println();
        System.out.println("List all the animals alphabetically");
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v));
    //  List all the animals order by how they move
        System.out.println();
        System.out.println("List all the animals order by how they move");
        myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        myList.forEach((v) -> System.out.println(v));
    // List only those animals the breath with lungs
        System.out.println();
        System.out.println("List only those animals the breath with lungs");
        printAnimals(myList, v->v.breath().equalsIgnoreCase("lungs"));
    // List only those animals that breath with lungs and were named in 1758
        System.out.println();
        System.out.println("List only those animals that breath with lungs and were named in 1758");
        printAnimals(myList, v -> v.breath().equalsIgnoreCase("lungs") && v.getYear() == 1758);
        // List only those animals that lay eggs and breath with lungs
        System.out.println();
        System.out.println("List only those animals that lay eggs and breath with lungs");
        printAnimals(myList, v -> v.breath().equalsIgnoreCase("lungs") && v.reproduce().equals("eggs"));
        // List alphabetically only those animals that were named in 1758
        System.out.println();
        System.out.println("List alphabetically only those animals that were named in 1758");
        printAnimalsSorted(myList, v -> v.getYear() == 1758 );
    // For the list of animals, list alphabetically those animals that are mammals.
        System.out.println();
        System.out.println("For the list of animals, list alphabetically those animals that are mammals");
        printAnimalsSorted(myList, v -> v instanceof Mammals);
    }
}