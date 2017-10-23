package SEMINAR_2.FARMACIE;

import java.util.ArrayList;

/**
 * Created by Mihnea on 23.10.2017.
 */
public class ShoppingCart {
    private ArrayList<MedicamentBean> cartList;
    private int medCount;
    private int totalPrice;

    public ShoppingCart(){
        medCount=0;
        totalPrice=0;
        cartList = new ArrayList<>();
    }

    /**
     * Adds Med Object to the cartList - behaves as a mediating method
     * @param object
     * @param quantity
     */
    public void mediatorAddToCart(MedicamentBean object, int quantity) {
        for (int i = 1; i <= quantity;i++) {
            cartList.add(object);
            totalPrice += object.getPrice();
            medCount++;
        }
    }

    /**
     * Deletes Med Object from the cartList - behaves as a mediating method
     * @param object
     */
    public void mediatorDeleteFromCart(MedicamentBean object){
        for(MedicamentBean x:cartList){
            if(x.equals(object)){
                cartList.remove(x);
                totalPrice -= object.getPrice();
            }
        }
    }

    /**
     * Returns total price of the Cart
     * @return
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * deletes the objects from the cart
     */
    public void emptyCart(){
        if(!(cartList.isEmpty())){
            cartList.removeAll(cartList);
            medCount = 0;
            totalPrice = 0;
        }
    }

    /**
     * Empties cart and interacts with the user
     * @return
     */
    public String checkout(){
        System.out.println("Final price is: " + getTotalPrice());
        emptyCart();
        return "Checkout complete.";
    }

    /**
     * Returns the object's name and price with the highest price in the cartList
     * @return
     */
    public String max() {
        int max = Integer.MIN_VALUE;
        String maxMed = "";
        int price = 0;
        for (MedicamentBean bean : cartList) {
            if (bean.getPrice() > max) {
                maxMed = bean.getName();
                price = bean.getPrice();
            }
        }
        return maxMed + ", price is " + price + " lei.";
    }

    @Override
    public String toString() {
        return "Your Shopping Cart: \n" +
                "List of Items: " + cartList +
                ", \nNumber of items: " + medCount + " item(s)" +
                ", \nTotal Price: " + getTotalPrice() + " lei";
    }
}
