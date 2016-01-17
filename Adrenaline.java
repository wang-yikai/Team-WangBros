public class Adrenaline extends Item {
    public int boost = 0;
    public boolean used;

    public Adrenaline() {
	super( "Adrenaline", 250 );
	boost = 5;
	used = false;
    }

    public int drink( Character c ) {
    	c.setSpeed( c.getSpeed() + boost );
    	used = true;
    	return c.getSpeed();
    }
}
