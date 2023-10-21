package test;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToSetConverter {

    public static void main(String args[]){
      
        //Creating ArrayList for converting into HashSet
        ArrayList companies = new ArrayList();
        companies.add("Sony");
        companies.add("Samsung");
        companies.add("Microsoft");
        companies.add("Intel");
        companies.add("Sony");
      
        System.out.println("Size of ArrayList before Conversion: " + companies.size());
        System.out.println(companies);
      
        //Converting ArrayList into HashSet in Java
        HashSet companySet = new HashSet(companies);
      
        System.out.println("Size of HashSet after Conversion: " + companies.size());
        System.out.println(companySet);
  
    }
}
