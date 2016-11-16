package classes;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyMethods {

    public int getumSubjects(boolean regularStudent, boolean workingStudent) {
        int numSubject = 6;
        if(!regularStudent) {
            numSubject = regularStudent?7:5;
        }

        return numSubject;
    }

    public static void youMama() {
        for (int n = 1; n <= 6; ++n) {
            System.out.println("[" + n + "]");
        }
    }

     public static int getSum(int n){
         int x = 1, sum = 0;

         while (x <= n){
             sum = sum + x;
             x++;
        }
        return sum;

    }


   /* public static void getTralala( int q, int y){
        int y=1;

       do {
           System.out.println("[" + q + "]");
           q++;
       }while (q <= y);*/


       public static String getMyNiggas() {

           List<String> myNiggas = new ArrayList<String>();

           myNiggas.add("Marky");
           myNiggas.add("Gart");
           myNiggas.add("Wayne");
           myNiggas.add("Marwan");
           myNiggas.add("Venz");

           Random ranNum = new Random();
           int getRandomNum = ranNum.nextInt(myNiggas.size());

           return myNiggas.get(getRandomNum);



       }


    /*   For Girl Friends*/

      public static String getExGfs(){

           List<String> exGfs = new ArrayList<String>();

           exGfs.add("Gwen");
           exGfs.add("Risa");
           exGfs.add("Sweet");
           exGfs.add("Kim");
           exGfs.add("Zarah");

       Random ranEx = new Random();
          int randomEx = ranEx.nextInt(exGfs.size());

          return exGfs.get(randomEx);
       }

//RelationShip

       public static String getRelationship(){

           List<String>relationshipStat = new ArrayList<String>();

           relationshipStat.add("Hates");
           relationshipStat.add("Seenzoned");
           relationshipStat.add("Friendzoned");
           relationshipStat.add("Loves");
           relationshipStat.add("Kuyazoned");

           Random ranStatus = new Random();
           int relationStat = ranStatus.nextInt(relationshipStat.size());

           return relationshipStat.get(relationStat);






       }

    }

