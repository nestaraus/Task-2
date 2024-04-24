public class Toys {
    private int id;
    private String name;
    private int volume;
    private double chance;

    public Toys(int id, String name, int volume , double chance){
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.chance = chance;
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getVolume(){
        return volume;
    }

    public void addVolume(int volume){
        this.volume = volume;
    }

    public double getChance(){
        return chance;
    }

    public void addChance(double chance){
        this.chance = chance;
    }

}