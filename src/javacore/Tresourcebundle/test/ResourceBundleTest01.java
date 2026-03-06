package javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messagem", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        bundle = ResourceBundle.getBundle("messagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        //Locale("fr", "CA");
        //messagem_fr.CA.properties
        //messagem_fr.properties
        //messagem_pt_BR.properties
        //messagem_pt.properties
        //messagem.properties
        System.out.println(bundle.getString("hi"));
    }
}
