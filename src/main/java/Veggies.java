public class Veggies extends Product{

    public Veggies(String name, double price, String style) {
        super(name, price);
        this.setStyle(style);
    }
    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String toString()  {
        return String.format("%s - %s", super.toString(), style);
    }
}