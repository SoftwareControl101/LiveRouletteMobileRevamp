package modules.ResultAndStatistics;

import globals.TestMethod;
import pages.DealerTable;
import utilities.handlers.GetHandler;
import utilities.objects.Component;

import java.util.ArrayList;
import java.util.List;

public class ResAndStats extends TestMethod {

    protected static int[] testCaseList, divisionList;
    protected static String tableInfo;
    protected static double totalResultHistory;

    protected String[] getFirstNumberInResultPanel() {
        return GetHandler.getAttribute(DealerTable.Label.FirstNumberInResultPanel, "class")
                .replace("number_","").toUpperCase().split(" ");
    }

    protected double getPercentage(Component component) {
        double percentage;
        do percentage = GetHandler.getDouble(component);
        while (percentage == 0.0);
        return percentage;
    }

    protected static String getResultFromArray(int[] numberList, int[] counterList) {
        int capacity = (numberList.length + counterList.length) * 10;
        StringBuilder result = new StringBuilder(capacity);
        for (byte i = 0; i < numberList.length; i++) result.append('{').append(numberList[i]).append('-').append(counterList[i]).append('}');
        return result.toString();
    }

    @SuppressWarnings("all")
    protected static int[][] getArrayFromResult(String result) {
        result = result.substring(1, result.length() - 1);
        String[] parts = result.split("\\}\\{");
        List<Integer> numberList = new ArrayList<>();
        List<Integer> counterList = new ArrayList<>();
        for (String part : parts) {
            String[] tokens = part.split("-");
            if (tokens.length == 2) {
                numberList.add(Integer.parseInt(tokens[0]));
                counterList.add(Integer.parseInt(tokens[1]));
            }
        }
        int[] numbers = numberList.stream().mapToInt(Integer::intValue).toArray();
        int[] counters = counterList.stream().mapToInt(Integer::intValue).toArray();
        return new int[][] { numbers, counters };
    }

}
