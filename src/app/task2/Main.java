package app.task2;

public class Main {

    public static void main(String[] args) {
        Remover remover = new Remover();
        DataProvider dataProvider = new DataProvider();
        getOutput(remover.handleData(
                dataProvider.getData())
        );
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
