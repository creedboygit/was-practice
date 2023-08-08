package org.example;

import java.io.IOException;

// GET /cacluate?operand1=11&operator=*&operand2=55
public class Main {

    public static void main(String[] args) throws IOException {

        new CustomWebApplicationServer(6666).start();
    }
}