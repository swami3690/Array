import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

public class IndexOfArray {


    public static void main(String[] args) {

        String[] colour = {"Red", "Yellow", "Blue", "Orange"};

        int index = 0;
        for (int i = 0; i < colour.length; i++) {

            if (colour[i] == "Orange") {
                index = i;

            }



        }
        System.out.println("index="+index);



    }
}