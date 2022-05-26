public class Zombie extends Monster {
    //Fix this class
    public Zombie(String name, int i) {
        super(name + " the Zombie", 3);
    }

    public Zombie() {
        super();
    }

    public void growl(){
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(Monster monster) {
        attack();
    }

    @Override
    public void attack(){
        growl();
    }


}