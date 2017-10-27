package SEMINAR_2.FARMACIE;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by Mihnea on 21.10.2017.
 */
public class FarmacieService {

    private static List<MedicamentBean> beans = new ArrayList<>();
    private static ShoppingCart cart = new ShoppingCart();

    public int getLength() {
        return beans.size();
    }

    /**
     * Adds new MedicamentBean object to the ArrayList of objects.
     * @param medicament
     * @param price
     */

    public void addMed(String medicament, int price){
        if(medicament.length() == 0){
            throw new IllegalArgumentException("Nume invalid");
        }
        beans.add(new MedicamentBean(medicament,price));
    }

    public void deleteMed(String medicamentDelete){
        if(searchMed(medicamentDelete) != null){
            beans.removeIf(MedicamentBean -> MedicamentBean.getName().equalsIgnoreCase(medicamentDelete));
        }
    }

//    public void changeMedName(String medName) {
//        if (searchMed(medName) != null){
//            beans.set(beans.indexOf(medName), )
//        }
//    }

    /**
     * Searches a Med by it's name or part of it's name in the ArrayList.
     * @param partialName
     * @return
     */
    public List<String> searchMed(String partialName){
        List<String> searchedNames = new ArrayList<>();
        for(MedicamentBean x:beans){
            if(x.getName().toLowerCase().contains(partialName.toLowerCase())){
                searchedNames.add(x.getName());
            }
        }
        return searchedNames;
    }

    /**
     * Prints all the Meds names and their prices.
     */
    public static void printAll(){
        for(MedicamentBean bean:beans){
            System.out.println("[" + bean.getName() + "]" + "[" + bean.getPrice() + "]");
        }
    }


    /**
     * Bubble Sorts the Meds in ascending order by their prices.
     */
    public static void bubbleSort(){
        int temp;
        String temp2;
        for(int i=0;i<beans.size();i++){
            for(int j = 1; j<beans.size() - 1; j++){
                if(beans.get(j-1).getPrice() > beans.get(j).getPrice()){
                    //swap elements
                    temp = beans.get(j-1).getPrice();
                    beans.get(j-1).setPrice(beans.get(j).getPrice());
                    beans.get(j).setPrice(temp);
                    //swap names
                    temp2 = beans.get(j-1).getName();
                    beans.get(j-1).setName(beans.get(j).getName());
                    beans.get(j).setName(temp2);
//                    Collections.swap(beans,beans.get(j).getPrice(),beans.get(j-1).getPrice());
//                    Collections.swap(beans,beans.get(j).getName(),beans.get(j-1).getName());
                }
            }
        }
    }
    private static class CartInnerClass {
        /**
         * Adds a new Med to the private cartList so the user would not need to add the object directly, but the Med with it's name
         *
         * @param medName
         * @param quantity
         */
        private void addToCart(String medName, int quantity) {
            for (MedicamentBean x : beans) {
                if (x.getName().equalsIgnoreCase(medName)) {
                    cart.mediatorAddToCart(x, quantity);
                }
            }
        }

        /**
         * Deletes a Med from the private cartList so that the user would not have to delete the object directly, but the Med with it's name
         *
         * @param medName
         */
        private void deleteFromCart(String medName) {
            for (MedicamentBean x : beans) {
                if (x.getName().equalsIgnoreCase(medName)) {
                    cart.mediatorDeleteFromCart(x);
                }
            }
        }
    }

    @Override
    public String toString() {
        List<String> medNameList = new ArrayList<>();
        List<Integer> medPriceList = new ArrayList<>();
        for(MedicamentBean bean:beans){
            medNameList.add(bean.getName());
            medPriceList.add(bean.getPrice());

        }
        return "FarmacieService { " +
                "Medicamente = " + medNameList +
                ",\n Lista Preturi: " + medPriceList +
                '}';
    }

    public static void mainMenu(){
        System.out.println("1. Customer");
        System.out.println("2. Admin");
    }

    public static void menuAdmin(){
        System.out.println("----- Farmacie -----");
        System.out.println();
        System.out.println("1. Vizualizati stocul");
        System.out.println("2. Adaugati un medicament");
        System.out.println("3. Cautati un medicament");
        System.out.println("4. Stergeti un medicament");
        System.out.println("5. Modificati un medicament");
        System.out.println("6. Sortati medicamentele in functie de pret");
        System.out.println("x. Exit");
        System.out.println();
        System.out.print("Selectia: ");
    }

    public static void menuCustomer(){
        System.out.println("----- Farmacie -----");
        System.out.println();
        System.out.println("1. Vizualizati stocul");
        System.out.println("2. Cautati un medicament");
        System.out.println("3. Sortati medicamentele in functie de pret");
        System.out.println("4. Cumparati");
        System.out.println("x. Exit");
        System.out.println();
        System.out.print("Selectia: ");

    }

    public static void menuShop(){
        System.out.println("----- Magazin -----");
        System.out.println();
        System.out.println("1. Adaugati un produs in cos");
        System.out.println("2. Stergeti un produs din cos");
        System.out.println("3. Cost total");
        System.out.println("4. Checkout");
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        FarmacieService service = new FarmacieService();

        MedicamentBean med1 = new MedicamentBean("Nurofen",10);
        MedicamentBean med2 = new MedicamentBean("Algocalmin",15);
        MedicamentBean med3 = new MedicamentBean("Xanax", 5);
        MedicamentBean med4 = new MedicamentBean("Zyloft", 17);
        MedicamentBean med5 = new MedicamentBean("Codeine", 23);
        MedicamentBean med6 = new MedicamentBean("Lorazepam", 2);
        MedicamentBean med7 = new MedicamentBean("Viagra", 69);


        service.addMed(med1.getName(),med1.getPrice());
        service.addMed(med2.getName(),med2.getPrice());
        service.addMed(med3.getName(),med3.getPrice());
        service.addMed(med4.getName(),med4.getPrice());
        service.addMed(med5.getName(),med5.getPrice());
        service.addMed(med6.getName(),med6.getPrice());
        service.addMed(med7.getName(),med7.getPrice());

        boolean canAccessAdmin = false;
        boolean canAccessCustomer = false;

        Scanner scanner = new Scanner(System.in);
        mainMenu();
        System.out.print("Choose:  ");
        int selectionMainMenu = scanner.nextInt();
//        System.out.println("Selections is: "+selectionMainMenu);
        switch(selectionMainMenu) {
            case 1:
                canAccessCustomer = true;
                break;
            case 2:
                System.out.print("Account:  ");
                String account = scanner.next();
//                System.out.println("selections is now: " + account);
                if(account.equalsIgnoreCase("admin")){
                        System.out.print("Password:  ");
                        String password = scanner.next();
                        if(password.equalsIgnoreCase("admin")){
                                canAccessAdmin = true;
                        } else try {
                                throw new Exception("Incorrect password");
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                } else try {
                        throw new Exception("Incorrect account");
                } catch (Exception e) {
                        e.printStackTrace();
                }
                System.out.println();
                break;
        }

        CAN_ACCESS_ADMIN:
        while(canAccessAdmin) {
            menuAdmin();
            String selectionAdmin = scanner.next();
            switch (selectionAdmin){
                case "1":
                    System.out.println(beans.toString());
                    break;

                case "2":
                    System.out.print("Nume:  ");
                    String nameOfAddedMed = scanner.nextLine();
//                    scanner.close();
                    System.out.println();
                    scanner.nextLine();
                    System.out.print("Pret:  ");
                    int priceOfAddedMed = scanner.nextInt();
                    System.out.println();
                    try {
                        service.addMed(nameOfAddedMed, priceOfAddedMed);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Medicament adaugat cu success");
                    System.out.println();
                    break;

                case "3":
                    System.out.print("Introduceti numele: ");
                    String searchedName = scanner.next();
                    System.out.println();
                    System.out.println(service.searchMed(searchedName));
                    System.out.println();
                    break;

                case "4": // TODO
                    break;

                case "5": // TODO
                    break;

                case "6":
                    bubbleSort();
                    printAll();
                    System.out.println();
                    break;

                case "x":
                    break CAN_ACCESS_ADMIN;
            }
        }

        boolean canAccessCart;

        CAN_ACCESS_CUSTOMER:
        while(canAccessCustomer){
            menuCustomer();
            String selectionCustomer = scanner.next();
            switch (selectionCustomer) {
                case "1":
                    printAll();
                    System.out.println();
                    break;

                case "2":
                    System.out.print("Introduceti numele: ");
                    String searchedName = scanner.next();
                    System.out.println();
                    System.out.println(service.searchMed(searchedName));
                    System.out.println();
                    break;

                case "3":
                    bubbleSort();
                    printAll();
                    System.out.println();
                    break;

                case "4":
                    canAccessCart = true;
                    Scanner scanShop = new Scanner(System.in);
                    while(canAccessCart) {
                        menuShop();
                        System.out.print("Selectia:  ");
                        String selectionShop = scanShop.next();
                        CartInnerClass inner = new CartInnerClass();

                        switch (selectionShop) {
                            case "1":
                                System.out.print("Selectati produsul:  ");
                                String selectedProduct = scanShop.next();
                                System.out.println();
                                scanShop.nextLine();
                                System.out.print("Introduceti cantitatea:  ");
                                int quantityOfProduct = scanShop.nextInt();
                                inner.addToCart(selectedProduct, quantityOfProduct);
                                break;

                            case "2":
                                System.out.print("Selectati produsul:  ");
                                String willBeDeletedProduct = scanShop.next();
                                inner.deleteFromCart(willBeDeletedProduct);
                                break;

                            case "3":
                                System.out.println(cart.getTotalPrice());
                                break;

                            case "4":
                                System.out.println(cart.checkout());
                                canAccessCart = false;
                                break;
                        }

                    }
                    break;

                case "x":
                    break CAN_ACCESS_CUSTOMER;
            }
        }
//        System.out.println(med1.getName()+" "+med1.getPrice());
//        System.out.println("\n");
//
//        bubbleSort();
//
//        printAll();
//        System.out.println("\n");
//
//        String m1 = "Xanax";
//        String m2 = "Viagra";
//        CartInnerClass inner = new CartInnerClass();
//
//        inner.addToCart(m1,3);
//        inner.addToCart(m2,1);
//
//
//        System.out.println(cart);
//        System.out.println();
//        System.out.print("Maximum price in cart has the medicine: " + cart.max());
//        System.out.println();
//        cart.checkout();
//        System.out.println();
//        System.out.println(cart);
    }
    public boolean equalsObj(Object object1, Object object2) {
        if(object1 instanceof  MedicamentBean && object1.equals(object2)) {
            return true;
        }
        else return false;
    }



}


//    public void sortMeds() {
//        System.out.println(beans.size());
//        ArrayList<Integer> listMedsSorted = new ArrayList<>();
//        ArrayList<MedicamentBean> objectSortedList = new ArrayList<>(beans);
//        MedicamentBean temp;
//        String tempString;
//        boolean swapped = true;
//        int i = 0;
//        while (swapped) {
//            swapped = false;
//            i++;
//        for (int j = 0; j < beans.size() - i; j++) {
//            if (beans.get(j).getPrice() > beans.get(j + 1).getPrice()) {
//                temp = beans.get(j);
//                beans.set(j) = beans.get
////                System.out.println(objectSortedList.get(j).getName());
////                        System.out.println("Lista Sorted "+objectSortedList);
//                objectSortedList.add(j + 1, temp);
////                System.out.println(beans.get(j).getName() + " " + beans.get(j).getPrice());
////                        listMedsSorted.add(i,beans.get(j).getName());
////                        listMedsSorted.add(j,beans.get(i).getName());
////                        System.out.println("lista Sorted: "+objectSortedList);
//                swapped = true;
//            }
//        }
//
//    }
//                for (MedicamentBean x:objectSortedList){
//                    System.out.print(x.getName()+" - ");
//            }
//
//    }


 /* public  ArrayList<String> sortMeds1(){
        ArrayList<String> listMedsSorted = new ArrayList<>();
        int temp;
        boolean adevarat = true;
        int i = 0;
        String tempString;
        for (MedicamentBean x:beans){
            while(adevarat){
               adevarat = false;
               i++;
                for(int j=i+1;j<beans.size();j++){
                    if (beans.get(i).getPrice() > beans.get(j).getPrice()){
                        temp = beans.get(i).getPrice();
                        listMedsSorted.
                        adevarat = true;
                    }
                }
            }
            System.out.println("[" + x.getName() + "]");

        }
        return listMedsSorted;
    }*/

//    public void sortMeds() throws NoSuchFieldException, IllegalAccessException {
//        List<Integer> tempPriceList = medPriceList;
//        List<String> tempMedList = medicamenteList;
//
//        Collections.sort(tempPriceList);
////        for(Object x:medPriceList){
////        Class<?> xClass = x.getClass();
////        Field field = xClass.getField("price");
////        Object fieldValue = field.get(x);
////            System.out.println(fieldValue.toString());
//        }
//    public void sortMeds(){
//        List<Integer> tempPriceList = new ArrayList<>();
//        for(MedicamentBean bean:beans){
//            tempPriceList.add(bean.getPrice());
//        }
////        System.out.println(tempPriceList);
//        Collections.sort(tempPriceList);
//        for(int x:tempPriceList){
//
//        }
//    }

//    }
//    public int compare(MedicamentBean o1, MedicamentBean o2) {
//
//    return o1.getPrice() < o2.getPrice() ? 1 : 0;
//}
//    public static void sortMeds(){
//       /* Collections.sort(beans, new Comparator<MedicamentBean>() {
//            @Override
//            public int compare(MedicamentBean o1, MedicamentBean o2) {
//
//                return o1.getPrice() < o1.getPrice() ? 1 : 0;
//            }
//        });*/
//        ArrayList<String> unSortedMedList = new ArrayList<>();
//        ArrayList<Integer> unSortedPriceList = new ArrayList<>();
//        for(MedicamentBean bean:beans){
//            unSortedMedList.add(bean.getName());
//        }
//        for(MedicamentBean bean:beans){
//            unSortedPriceList.add(bean.getPrice());
//        }
////        System.out.println(unSortedMedList);
//        ArrayList<String> sortedMedList = new ArrayList<>(unSortedMedList);
//        boolean modif = true;
//        while(modif){
//            modif=false;
//            for(int i=0;i<unSortedMedList.size()-1-i;i++){
//                if(unSortedPriceList.get(i) > unSortedPriceList.get(i+1));
//                String temp = unSortedMedList.get(i);
//                sortedMedList.set(i,unSortedMedList.get(i+1));
//                sortedMedList.set(i+1,temp);
//                modif=true;
//            }
//        }
//        System.out.println("Trying now to print the sorted list: ");
//        for(String x:sortedMedList){
//            System.out.println(sortedMedList);
//        }
//    }