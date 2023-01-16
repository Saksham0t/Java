package com.company;
import java.util.*;
import java.io.*;

 class emp implements  Serializable{
     String name;
     String address;
}

public class file_handling {
    public static void main(String[] args) throws Exception {

                                                                  // For reading
//        FileInputStream fis = new FileInputStream("abc.txt");
////            int data = fis.read();
////            System.out.println("data: "+ (char)data);
//        int data;
//        while((data = fis.read()) != -1){
//            System.out.println(data);
//        }
//        fis.close();
                                                                 // For writing
//        FileOutputStream fos = new FileOutputStream("bbc.txt");
//        fos.write(5);
//        System.out.println("file written");
//        fos.close();
                                                                 // For copying
//        FileInputStream fis = new FileInputStream("abcd.txt");
//        FileOutputStream fos = new FileOutputStream("bbc.txt");
//        int data;
//        while(( data = fis.read()) != -1){
//            fos.write(data);
//        }
//        System.out.println("file copied");
//        fis.close();
//        fos.close();
                                                                  //Serialization
        emp ep = new emp();
        ep.name="Saksham";
        ep.address="Pathankot";
        try{
            FileOutputStream fos = new FileOutputStream("abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ep);
            oos.close();
            fos.close();
            System.out.println("Serialization is done");
        }
        catch(Exception e){
            e.printStackTrace();
        }
                                                            // Deserialization
//        emp ep2 = null;
//        try{
//            FileInputStream fis = new FileInputStream("abc.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            ep2 = (emp) ois.readObject();
//            ois.close();
//            fis.close();
//        }
//        finally{
//            System.out.println(ep2.name);
//            System.out.println(ep2.address);
//            System.out.println("Deserialization is done");
//        }
    }
}
