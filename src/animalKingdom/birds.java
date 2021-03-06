package animalKingdom;

public class Birds extends AnimalAbstract{
    public Birds(String name, int year){
        super(name, year);
    }
    
    @Override
    public String move() {
        return "fly";
    };

    @Override
    public String breath() {
        return "lungs";
    };

    @Override
    public String reproduce() {
        return "eggs";
    };
    
    @Override
    public String toString() {
        return "Birds{" + "id='" + id + '\'' + ", year = " + year + ", name = " + name + '}';
    }
}