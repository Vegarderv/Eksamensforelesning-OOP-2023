package abakus.app.arv;

public class Konge extends SjakkBrikke{

    public Konge(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isValidMove(int x, int y) {
        return this.getX() <= x + 1 && this.getX() >= x - 1
        && this.getY() <= y + 1 && this.getY() >= y - 1
        && (this.getX() != x || this.getY() != y);
        
    }

    @Override
    public void move(int x, int y) {
       if (isValidMove(x, y)) {
        setX(x);
        setY(y);
       }
    }

}
