package beach;

/**
 *
 * @author WIF3007GroupProj-TG2-G8
 */

public abstract class Person {
    
    MoveBehavior moveBehavior;
    
    public Person() {}
    
    public void performMove() {
        moveBehavior.move();
    }
    
    public void setMove(MoveBehavior mb) {
        moveBehavior = mb;
    }
}