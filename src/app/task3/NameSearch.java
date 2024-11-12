package app.task3;

public class NameSearch {


    //Searching name in the list and counting the duplicates
    public String searchData(String[] strs, String name) {
        StringBuilder stringBuilder = new StringBuilder();
        int countNames = 0;
        for (String str : strs) {
            if (str.equals(name)) {
                countNames++;
            }
        }
        if (countNames > 0) {
            stringBuilder.append("Name \"").append(name).append("\" was found in the list").append("\n");
            if (countNames > 1) {
                stringBuilder.append("Count of the same names: ").append(countNames);
            }
        } else {
            System.out.println("Name \"" + name + "\" wasn't found in the list.");
        }
        return stringBuilder.toString();
    }
}