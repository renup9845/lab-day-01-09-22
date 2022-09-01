package com.bankApp;

import java.util.ArrayList;

public class laptopStore {
    public static void main(String[] args){
        //TODO Auto-generated method stub

        laptop e1 = new laptop(541,"DELL","Dell Latitude",14000,2019);
        laptop e2 = new laptop(458 ,"SAMSUNG","Galaxy Book",33000,2021);
        laptop e3 = new laptop(657,"HP","HP G8",25000,2018);
        laptop e4 = new laptop(108,"ACER","Acer Swift 3",380000,2021);
        laptop e5 = new laptop(110,"ASUS","Asus VivoBook 15",32000,2019);


        ArrayList<laptop> a1 = new ArrayList<laptop>();

        a1.add(e5);
        a1.add(e4);
        a1.add(e3);
        a1.add(e2);
        a1.add(e1);

        a1.stream()
                .filter(pro-> {
                    return pro.ePrice>30000;
                })
                .forEach(pro->{
                    System.out.println(pro.eCompany+" "+pro.eName+" Rs: "+pro.ePrice);

                });


    }
}
