package com.nagarro.Hibernate;

import java.util.List;

public class GetProduct {

    public void viewTShirt(List<TShirtModel> list) {

        if (list.isEmpty()) {
            System.out.println("\nError!!!....The T-Shirt is Not Available.");
            return;
        }
        System.out.println("\n _____SEARCHED T-SHIRT INFORMATION_____");
        System.out.println();
        System.out.println("       ID       |           NAME           | COLOUR |gender|SIZE| PRICE |RATING|AVAILABILITY|");
        for (TShirtModel f : list) {
            System.out.print(String.format("%16s",f.getId()));
            System.out.print(String.format("%27s",f.getName()));
            System.out.print( String.format("%8s",f.getColour()));
            System.out.print(String.format("%5s",f.getGender()));
            System.out.print(String.format("%6s",f.getSize())+" ");
            System.out.print("   "+f.getPrice()+"  ");
            System.out.print(" "+f.getRating()+"     ");
            System.out.println(f.getAvailability()+" ");
        }

    }

}
