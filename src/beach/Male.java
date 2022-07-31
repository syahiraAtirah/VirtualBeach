package beach;

/**
 *
 * @author WIF3007GroupProj-TG2-G8
 */

public class Male extends PersonFactory{

    @Override
    Person createPerson(String type) {
        if(type.equals("child")){
            return MaleChild.getInstance();
            
        }else if(type.equals("teenager")){
            return MaleTeenage.getInstance();
            
        }else if(type.equals("adult")){
            return MaleAdult.getInstance(); 
            
        }else {
            return null;
        }
    }
}
