package Assignement3.Abstraction;

import javaAssignement3.Abstraction.Document;
import javaAssignement3.Abstraction.Image;
import javaAssignement3.Abstraction.Printable;

public class Interfacecall {
    public static void main(String[] args) {
        Printable doc=new Document();
        Printable image =new Image();

        doc.print();
        image.print();
    }
}
