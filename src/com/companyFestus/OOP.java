package com.companyFestus;

public class OOP {

    int a;
    int b;
    int c;
   String name;
                                 // 1. METHOD THAT DOES NOT TAKE PARAMETER
     //void sum(){
      //  System.out.println(a+b);
    //}


                                 // 2. METHOD THAT TAKE PARAMETER
//    void sum( int x, int y, int m )
//    {
//        a = x;
//        b= y;
//        c =m;
//        System.out.println(a+b+c);
//    }

                                 // 3. METHOD THAT RETURNS VALUES
//    int sum()
//    {
//        return (a+b+c);
//    }
                               // 3i Method that returns values
    String name(){
        return ("festus");
    }

    public static void main(String[] args) {
        OOP dr = new OOP();
                       //way to call method that does not take parameter
    // dr.a =100;
    //dr.b =200;
    //dr.c = 300;
   // dr.sum();
                       // way to call the method that take parameter
       // dr.sum(100,200,300);


                       // way to call the method that returns values
//        dr.a = 100;
//        dr.b = 200;
//        dr.c = 300;
//        int r = dr.sum();
//        System.out.println(r);

        String name = dr.name();
        System.out.println(name);


    }
}
