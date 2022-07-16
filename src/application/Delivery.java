package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Delivery {

  public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Client client = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1997"));

    System.out.println(client);

    sc.close();
  }
}
