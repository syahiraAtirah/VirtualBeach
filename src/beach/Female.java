package beach;

/**
 *
 * @author WIF3007GroupProj-TG2-G8
 */

public class Female extends PersonFactory{

    @Override
    Person createPerson(String type) {
        if(type.equals("child")){
            return FemaleChild.getInstance(); 
            
        }else if(type.equals("teenager")){
            return FemaleTeenage.getInstance();
            
        }else if(type.equals("adult")){
            return FemaleAdult.getInstance();
            
        }else {
            return null;
        }
    }
}
