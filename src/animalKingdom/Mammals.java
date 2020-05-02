package animalKingdom;

public class Mammals extends AnimalAbstract{
    public Mammals(String name, int year){
        super(name, year);
    }
    @Override
    public String move(){
        return "walk";
    };
    
    @Override
    public String breath(){
        return "lungs";
    };
    
    @Override
    public String reproduce(){
        return "live births";
    };
    
    @Override
    public String toString() {
        return "Mammals{" + "id='" + id + '\'' + ", year = " + year + ", name = " + name + '}';
    }
}