package MyGeneric;


/**
 *
 * @author Talitha Hayyinas
 */
public class ThisIsGeneric {


    public static void main(String[] args) {

        MyData<String> name = new MyData<>();
        name.setGirl("Talitha");
        System.out.println("My Name: " + name.getGirl());

        MyData<Integer> age = new MyData<>();
        age.setGirl(20);
        System.out.println("My Age: " + age.getGirl() + " Year");

        MyData<String> Character = new MyData<>();
        Character.setGirl("Blue");
        System.out.println("My Favorite Colour: " + Character.getGirl());
    }
}