package abakus.app.arv;

public class DamBrikke implements IBrikke {
    private int x;
    private int y;
    private String color;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    protected void setX(int x) {
        if (x <= 8 && x >= 0) {
            this.x = x;
        }
    }

    protected void setY(int y) {
        if (y <= 8 && y >= 0) {
            this.y = y;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}
