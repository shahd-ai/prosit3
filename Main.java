
public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Animal();
        Zoo myZoo = new Zoo("zoo", "tunis", 20);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        Animal an = new Animal("aaa", "bbb", 25, true);
        myZoo.addAnimal(an);
    }

}