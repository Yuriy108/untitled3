package com.company;

public class Main {
    Integer []in={1,3,4,566,7,8,2};
    Double []dob={20.4,3.4,5.0,6.4};

    public static void main(String[] args) {
       One<String> s=new One<>("Hello");
       One<Integer> i=new One<>(20);
       One<Single> a=new One<>(Single.make());
       One<Double> d=new One<>(20.5);
       s.print();
       i.print();
       a.print();
       d.print();
       Main m=new Main();
       m.displey(m.in);
       m.displey(m.dob);


    }
    <T> void displey(T [] arg){
        for (T temp:arg
             ) {
            System.out.print(temp+" ");

        }
        System.out.println();
    }
}
class One<T>{
    T a;

    public One(T a) {
        this.a = a;
    }

     void print(){
         System.out.println("T is :"+a);
         System.out.println("Type T is: "+a.getClass().getName());

     }
}
