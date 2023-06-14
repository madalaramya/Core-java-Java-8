package com.weekend;

public class OuterClass {
    private static int outerData = 10;

    public  class    StaticNestedClass {
        private int nestedData;

        public  StaticNestedClass(int nestedData) {
            this.nestedData = nestedData;
        }

        public void display() {
            System.out.println("Outer data: " + outerData);
            System.out.println("Nested data: " + nestedData);
        }
    
     }
    public static void main(String[] args) {
        //OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass(20);
    	OuterClass oc=new OuterClass();
        
    }
}

