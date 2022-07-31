package beach;

/**
 *
 * @author WIF3007GroupProj-TG2-G8
 */

public class Beach {

    public static void main(String[] args) {
        System.out.println("Welcome to the Beach");    
        
        PersonFactory female = new Female();
        PersonFactory male = new Male();
        
        Person person = female.getPerson("child");
        person.setMove(new Walk());
        person.performMove();
        
        Person person2 = female.getPerson("teenager");
        person2.setMove(new Run());
        person2.performMove();
        
        Person person3 = male.getPerson("child");
        person.setMove(new Swim());
        person.performMove();
    }
    
}
