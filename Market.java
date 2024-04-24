import java.util.ArrayList;
import java.io.*;

public class Market {
    private ArrayList<Toys> toy;
    private ArrayList<Toys> prize;
    private String file;

    public Market(){
        toy = new ArrayList<Toys>();
        prize = new ArrayList<Toys>();
        file = "winners.csv";
    }

    public void addToy(Toys toys){
        toy.add(toys);
    }

    public void draft(){
        prize.clear();
        for (Toys toys : toy){
            double random = 100*Math.random();
            if (random < toys.getChance()) {
                prize.add(toys);
            }
        }
    }

    public void changeChance(int id, double nextChance){
        for (Toys toys : toy){
            if (toys.getId() == id){
                toys.addChance(nextChance);
            }
        }
    }

    public Toys getPrize(){
        if (!prize.isEmpty()){
            Toys prizeToy = prize.remove(0);
            prizeToy.addVolume(prizeToy.getVolume()-1);
        
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.write(prizeToy.getName() + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("recording Error");
        }
        return prizeToy;
    }
        else{
            System.out.println("Призов больше нет");
            return null;
        }
    }
}
