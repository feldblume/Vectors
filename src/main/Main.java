package main;

import vector.LinkedListVector;
import vector.ArrayVector;
import vector.VectorContainer;
import vector.Vector;
//import java.io.*;


import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
//        ArrayVector v1 = new ArrayVector(5);
//        ArrayVector v2 = new ArrayVector(6);
//
//        double[] array1 = {4,-6,2,29,-19,12};
//        double[] array2 = {-4,-6,2,29,-19,12};
//        v1.fillFromMass(array1);
//        v2.fillFromMass(array2);
//
//        System.out.println("Initial vector: " + v2 + "\n");
//
//
//        LinkedListVector vct = new LinkedListVector();
//        vct.fillFromVector(v1);
//
//        LinkedListVector vctt = new LinkedListVector();
//        vctt.fillFromVector(v2);
//        //System.out.println("LinkedList1 vct = " + vct);
//
//
//        //////////////////////////
//        FileOutputStream out = null;
//        FileInputStream in = null;
//
//        try {
//            File file = new File("file1.txt");
//            File file2 = new File("file2.txt");
//
//            out = new FileOutputStream(file);
//            Vectors.outputVector(v2, out);
//
//            out.close();
//            //________________
//
//            in = new FileInputStream(file);
////            v2 = (ArrayVector) Vectors.inputVector(in);
//            v2.fillFromVector(Vectors.inputVector(in));
//            System.out.println("\ninputVector's result: " + v2);
//
//            in.close();
//            /***************/
//
//            Writer writer = new FileWriter(file2);
//            Vectors.writeVector(v2, writer);
//            Vectors.writeVector(v2, writer);
//
//            writer.close();
//
//            //__________________
//
//            Reader reader = new FileReader(file2);
//            v2.fillFromVector(Vectors.readVector(reader));
//
//            System.out.println("\nreadVector's result: " + v2);
//
//            reader.close();
//        }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//            //**************/
//        System.out.println("\nInitial LinkedList" + vct);
//
//        try {
//            ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream("out.txt"));
//            outObj.writeObject(vct);
//            outObj.flush();
//            outObj.close();
//
//            ObjectInputStream inObj = new ObjectInputStream(new FileInputStream("out.txt"));
//            vct = (LinkedListVector) inObj.readObject();
//            in.close();
//            System.out.println("\nObtained LinkedList" + vct);
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        //




        ArrayVector v1 = new ArrayVector(3);
        ArrayVector v2 = new ArrayVector(3);
        ArrayVector v3 = new ArrayVector(4);

        double[] array1 = {4,-6,29};
        double[] array2 = {-4,-6,2};
        double[] array3 = {1,2,3,4};
        v1.fillFromMass(array1);
        v2.fillFromMass(array2);
        v3.fillFromMass(array3);

        Vector vectors[] = {v1, v2, v3};
        Vector vectors1[] = {v1, v3};


        VectorContainer<Vector> vecCont = new VectorContainer<Vector>(vectors);
//        Vector v4 = new LinkedListVector();
//        v3.fillFromMass(new double[] {-1,-1,-1});

//        vContainer.add(v1);
//        vContainer.add(v2);
//        vContainer.add(v3);

//        vecCont.add(0, v3);
//        vecCont.add(0, v2);
//        vecCont.add(0, v1);

      //  System.out.println(vecCont);

//        System.out.println(vecCont.getSize());

//
//        VectorContainer<Vector> vecCont1 = new VectorContainer<Vector>(vectors1);
//
//        System.out.println("Initial vec cont: " + vecCont);
//        System.out.println("New vec cont: " + vecCont1);
//        vecCont.add(vecCont1);
//        System.out.println("Result initial vec cont: " + vecCont);
//
//        System.out.println(vecCont.isEmpty());

          vecCont.add(1, v1);
//        System.out.println(vecCont.getVectors());
//
//        System.out.println(vContainer.find(v4));
//        vContainer.remove(1);


   //     v3.fillFromMass(new double[] {1,1,1});

//
//        VectorContainer<Vector> vecCont2 = new VectorContainer<Vector>();
//        System.out.println(vecCont2.isEmpty());
//
//        System.out.println();
        System.out.println(vecCont);
//        System.out.println(v3);
//        System.out.println(vecCont.find(v3));

        vecCont.remove(3);
        System.out.println(vecCont);
//        vecCont.clear();
//        System.out.println(vecCont);
//        System.out.println(vecCont.isEmpty());

        //System.out.println(vecCont);


        LinkedListVector vct = new LinkedListVector();
        vct.fillFromVector(v1);

        LinkedListVector vctt = new LinkedListVector();
        vctt.fillFromVector(v2);

        Vector vectorsl[] = {vct, vctt};
        VectorContainer<Vector> vecContl = new VectorContainer<Vector>(vectorsl);
        System.out.println(vecContl);

        vecContl.remove(0);
        System.out.println(vecContl);

        vecContl.add(1,vctt);

        System.out.println(vecContl);




//        File file = new File("c:/newfile.txt");
//        String content = "This is the text content";
//
//        try (FileOutputStream fop = new FileOutputStream(file)) {
//
//            // if file doesn't exists, then create it
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            // get the content in bytes
//            byte[] contentInBytes = content.getBytes();
//
//            fop.write(contentInBytes);
//            fop.flush();
//            fop.close();
//
//            System.out.println("Done");
//
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }


//        System.out.println(vct.getByInd(4));
//        vct.getElement(4);
       // System.out.println("LinkedList2 = " + vctt);

        //System.out.println(vct.equal(vctt));

       // System.out.println("Vector hashCode = " + v1.hashCode());
       //System.out.println("LinkedList hashCode = " + vct.hashCode());


//        try {
//            LinkedListVector cloned = vct.clone();
//            System.out.println("Cloned1 " + cloned);
//            vct.setElement(3,4.0);
//
//            System.out.println("Cloned2 " + cloned);
//        }
//        catch(CloneNotSupportedException e) {
//            System.err.println("Cloneable is unsupported");
//        }
//
//        vct.removeElement(3);
//        System.out.println(vct);
//
//        vct.addEl(4);
//        System.out.println(vct);



//        System.out.println(v1);
//
//        System.out.println(v2);
//
//        v1.sum(v2);
//        System.out.println("v1 =" + v1);
//        vector.Vectors.sortV(v2);
//        System.out.println(v2);

        //System.out.println(v1.equals(v2));



        //////
//        System.out.println("Linked list: ");
//       LinkedListVector v = new LinkedListVector();
//       System.out.println(v);
//       v.addElement(new VectorElement(3));
//       System.out.println(v);
       //System.out.println(v.size);
//       v.addElement(new VectorElement(4));
//       v.addElement(new VectorElement(5));
//       v.addElement(new VectorElement(6));
//       v.addElement(new VectorElement(7));
//       v.addElement(new VectorElement(18));
//
////        System.out.println(v);
////
////        v.removeElement(3);
////        System.out.println(v);
////
////        v.removeElement(4);
//        System.out.println(v);
//
//
//        LinkedListVector vct = new LinkedListVector();
//        vct.fillFromVector(v);
//
//        vct.setElement(3,15);
//        System.out.println(vct);
//
//        System.out.println(vct.getSize());
//
//        double arr[] = {1.0,2.0,3.0,4.0,5.0,6.0};
//        vct.fillFromMass(arr);
//        System.out.println("vct = " + vct);
//
//        vct.fillFromVector(v);
//        System.out.println("filled " + vct);
//
//        vct.sum(v);
//        System.out.println("sum " + vct);
//
//        vct.mult(3);
//        System.out.println("mult " + vct);
//
//        vct.fillFromMass(arr);
//        LinkedListVector vct2 = new LinkedListVector();
//        vct2.fillFromMass(arr);
//
//        System.out.println("______");
//        System.out.println(vct);
//        System.out.println(vct2);
//
//
//        System.out.println(vct.equal(vct2));


    }
}
