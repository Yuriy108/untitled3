package com.company;

public class Single {
    static Single a;
    private Single() {
    }
    static Single make(){
        if(a==null){
            a=new Single();

        return a;}
        else return a;
    }
}
