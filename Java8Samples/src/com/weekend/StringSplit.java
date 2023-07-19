package com.weekend;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {
    public static void main(String[] args) {
        String str = "nav 776 nav 999 Test 123 Test 456 Test 789 Test 123 nav 565 nav 878";
        str = str.replaceAll("\\s+", " ");

//        String regex = "(nav(\\s*\\d+)?)|(Test\\s*\\d+)";
        String regex = "(nav(\\s*\\d+)?)|(Test(\\s*\\d+)?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        List<String> navList = new ArrayList<>();
        List<String> testList = new ArrayList<>();

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                navList.add(matcher.group(2).trim());
            } else if (matcher.group(3) != null) {
            	
            	testList.add(matcher.group(4).trim());
//                String[] parts = matcher.group(3).split("\\s");
//                if (parts.length > 1) {
//                    testList.add(parts[1].trim());
//                }
            }
        }

        System.out.println("Nav List: " + navList);
        System.out.println("Test List: " + testList);
    }
}
