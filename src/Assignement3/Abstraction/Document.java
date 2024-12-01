package Assignement3.Abstraction;

import javaAssignement3.Abstraction.Printable;

public class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Document");
    }
}
