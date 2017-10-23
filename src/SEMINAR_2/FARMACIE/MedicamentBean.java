package SEMINAR_2.FARMACIE;

/**
 * Created by Mihnea on 21.10.2017.
 */
public class MedicamentBean {
    private String name;
    private int price;

    public MedicamentBean(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  name + ", " + price + " lei";
    }

}
