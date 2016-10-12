/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Papadakis Gewrgios
 */
package com.example.model;

import java.util.*;

public class BeerExpert {
   public List getBrands(String color) {

     List types = new ArrayList();

       switch (color) {
           case "amber":
               types.add("Zoe");
               types.add("Lagunitas Lucky 13 Mondo Large Red Ale");
               break;
           case "dark":
               types.add("Dark Lord Imperial Stout");
               types.add("Plead The 5th Imperial Stout");
               types.add("Darkness");
               break;
           case "light":
               types.add("Sam Adams Light");
               types.add("Corona Light");
               break;
           case "brown":
               types.add("Indian Brown Ale");
               types.add("Lagunitas Sucks (Brown Shugga Substitute Ale)");
               break;
           default:
               break;
       }
     return(types);
   }
}