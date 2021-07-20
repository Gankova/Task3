package com.company;

public class Patern {

    private static Datebase db;

    private static class Datebase{

        private static Datebase db;

        //singleton
        public static Datebase getInstance(){
            if (db == null){
                db =new Datebase("users");
            }
            return db;
        }

        private String name;

        public Datebase (String name){
            this.name = name;

        }
        public String getName(){
            return this.name;
        }
    }
    public static void main(String[] args){
        Datebase db = Datebase.getInstance();
        System.out.println(db.getName());

        Datebase db2 = Datebase.getInstance();
        System.out.println(db2.getName());

        System.out.println(db.hashCode());
        System.out.println(db2.hashCode());


    }
}
