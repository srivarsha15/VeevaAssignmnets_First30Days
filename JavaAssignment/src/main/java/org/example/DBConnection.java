package org.example;

public class DBConnection {
    private static DBConnection instance=null;
    String s;
    private DBConnection(){
        s="Execution of Singleton Class";
    }
    public static DBConnection getInstance(){
        if(instance==null){
            instance=new DBConnection();
        }
        return instance;
    }

}
class Main{
    public static void main(String[] args) {
        DBConnection x=DBConnection.getInstance();
        DBConnection y=DBConnection.getInstance();
        DBConnection z=DBConnection.getInstance();
        if(x==y){
            System.out.println("X==Y");
        }
        if(z==y){
            System.out.println("Y==Z");
        }
        if(x==z){
            System.out.println("Z==X");
        }

    }
}
