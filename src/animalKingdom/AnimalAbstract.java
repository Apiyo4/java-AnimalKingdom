package animalKingdom;

public abstract class AnimalAbstract{
    protected static int maxId = 0;
    protected int id;
    protected int food;
    protected String name;
    protected int year;
    public AnimalAbstract(String name, int year){
        maxId++;
        id = maxId;
        food=0;
        this.name = name;
        this.year = year;
    }
    public int getId(){
        return id;
    }
    public void eat(){
        food = food + 1 ;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year ;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =  name;
    }
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

}