public class Cell implements Cloneable {

    private String color;

    public Cell(String color) {
        this.color = color;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color.substring(0, 1);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
