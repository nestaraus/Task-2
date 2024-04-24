public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Toys example1  = new Toys(1, "Игрушка", 2, 5);
        Toys example2  = new Toys(2, "Игрушка1", 10, 10);
        Toys example3  = new Toys(3, "Игрушка2", 50, 15);
        Toys example4  = new Toys(4, "Игрушка3", 50, 50);
        Toys example5  = new Toys(5, "Игрушка4", 50, 50);
        Toys example6  = new Toys(6, "Игрушка5", 50, 50);
        Toys example7  = new Toys(7, "Игрушка6", 50, 50);
        Toys example8  = new Toys(8, "Игрушка7", 10, 10);
        Toys example9  = new Toys(9, "Игрушка8", 1, 2);
        Toys example10  = new Toys(10, "Игрушка9", 50, 50);

        market.addToy(example1);
        market.addToy(example2);
        market.addToy(example3);
        market.addToy(example4);
        market.addToy(example5);
        market.addToy(example6);
        market.addToy(example7);
        market.addToy(example8);
        market.addToy(example9);
        market.addToy(example10);

        market.draft();
        market.changeChance(4, 20);
        market.draft();

        Toys prize = market.getPrize();
        if (prize != null){
            System.out.println("Поздравляем вы выиграли: " + prize.getName());
        }

    }
}
