package app.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        NameSearch nameSearch = new NameSearch();
        System.out.println("Enter name for searching:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        getOutput (nameSearch.searchData(dataProvider.getData(), name));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
