package animalKingdom;

public class Fish extends AnimalAbstract{
    public Fish(String name, int year){
        super(name, year);
    }
    
    @Override
    public String move() {
        return "swim";
    };

    @Override
    public String breath() {
        return "gills";
    };

    @Override
    public String reproduce() {
        return "eggs";
    };
    
    @Override
    public String toString() {
        return "Fish{" + "id='" + id + '\'' + ", year = " + year + ", name = " + name + '}';
    }
}