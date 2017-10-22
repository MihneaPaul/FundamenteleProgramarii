package SEMINAR_2.FARMACIE;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by Mihnea on 21.10.2017.
 */
public class FarmacieService {

    private List<MedicamentBean> beans = new ArrayList<>();

    public void addMed(String medicament, int price){
        beans.add(new MedicamentBean(medicament,price));
    }

    public List<String> searchMed(String partialName){
        List<String> searchedNames = new ArrayList<>();
        for(MedicamentBean x:beans){
            if(x.getName().toLowerCase().contains(partialName.toLowerCase())){
                searchedNames.add(x.getName());
            }
        }
        return searchedNames;
    }
   /* pt fiecare i de la 0 la n-1:
    pt fiecare j de la i+1 la n-1:
            if v.get(i).getPrice() > v.get(j).getPrice():
    t = v.get(i)
            v.set(i, v.get(j))
            v.set(j, t)
*/

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
    public int compare(MedicamentBean o1, MedicamentBean o2) {

    return o1.getPrice() < o2.getPrice() ? 1 : 0;
}


    public void sortMeds(){
       /* Collections.sort(beans, new Comparator<MedicamentBean>() {
            @Override
            public int compare(MedicamentBean o1, MedicamentBean o2) {

                return o1.getPrice() < o1.getPrice() ? 1 : 0;
            }
        });*/
       ArrayList<String> unSortedMedList = new ArrayList<>();
       ArrayList<Integer> unSortedPriceList = new ArrayList<>();
        for(MedicamentBean bean:beans){
            unSortedMedList.add(bean.getName());
        }
        for(MedicamentBean bean:beans){
            unSortedPriceList.add(bean.getPrice());
        }
//        System.out.println(unSortedMedList);
        ArrayList<String> sortedMedList = new ArrayList<>(unSortedMedList);
        boolean modif = true;
        while(modif){
            modif=false;
            for(int i=0;i<unSortedMedList.size()-1-i;i++){
                if(unSortedPriceList.get(i) > unSortedPriceList.get(i+1));
                System.out.println(beans.get(i+1).getName());
                String temp = unSortedMedList.get(i);
                sortedMedList.set(i,unSortedMedList.get(i+1));
                sortedMedList.set(i+1,temp);
                modif=true;
            }
        }
        for(String x:sortedMedList){
            System.out.println(sortedMedList);
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        FarmacieService service = new FarmacieService();

        MedicamentBean med1 = new MedicamentBean("Nurofen",10);
        MedicamentBean med2 = new MedicamentBean("Algocalmin",15);
        MedicamentBean med3 = new MedicamentBean("tralala", 5);

        service.addMed(med1.getName(),med1.getPrice());
        service.addMed(med2.getName(),med2.getPrice());
        service.addMed(med3.getName(),med3.getPrice());

//        System.out.println(service.toString());
        System.out.println();
//        System.out.println(service.searchMed("nuro"));
//        System.out.println(service.objList);
//        System.out.println(service.sortMeds());
//        service.sortMeds();
        System.out.println();
        service.sortMeds();
//       System.out.println(service.sortMeds());
    }


    @Override
    public String toString() {
        List<String> medicamenteList = new ArrayList<>();
        List<Integer> medPriceList = new ArrayList<>();
        for(MedicamentBean bean:beans){
            medicamenteList.add(bean.getName());
            medPriceList.add(bean.getPrice());

        }
        return "FarmacieService { " +
                "Medicamente = " + medicamenteList +
                ",\n Lista Preturi: " + medPriceList +
                '}';
    }

}
