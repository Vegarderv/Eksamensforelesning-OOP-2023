package abakus.app.arv;

public abstract class SjakkBrikke implements IBrikke {

    private int x;
    private int y;

    public SjakkBrikke(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected final void setX(int x) {
        if (x <= 7 && x >= 0) {
            this.x = x;
        }
    }

    protected void setY(int y) {
        if (y <= 7 && y >= 0) {
            this.y = y;
        }
    }

    public abstract boolean isValidMove(int x, int y);

    public abstract void move(int x, int y);

}
