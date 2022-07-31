package beach;

/**
 *
 * @author WIF3007GroupProj-TG2-G8
 */

public abstract class PersonFactory {
    Person person;
    
    public Person getPerson(String type){
        person = createPerson(type);

        return person;
    }
    abstract Person createPerson(String type);
}




