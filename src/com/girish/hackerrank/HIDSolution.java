package com.girish.hackerrank;

import java.io.*;
import java.math.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'getRecordsByAgeGroup' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER ageStart
     *  2. INTEGER ageEnd
     *  3. INTEGER bpDiff     
     *
     *  https://jsonmock.hackerrank.com/api/medical_records
     */

    public static List<Integer> getRecordsByAgeGroup(int ageStart, int ageEnd, int bpDiff) throws MalformedURLException, IOException      {
        System.out.println(ageStart+" "+ageEnd+" "+bpDiff);
        InputStream is = new URL("https://jsonmock.hackerrank.com/api/medical_records").openStream();
        try {
          BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
          String jsonText = readAll(rd);
          System.out.println(jsonText);
          //JSONObject json = new JSONObject(jsonText);
        } finally {
          is.close();
        }
        return new ArrayList<Integer>();

    }
    
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
          sb.append((char) cp);
        }
        return sb.toString();
      }

}

public class HIDSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int ageStart = 28; //Integer.parseInt(bufferedReader.readLine().trim());

        int ageEnd = 30;//Integer.parseInt(bufferedReader.readLine().trim());

        int bpDiff = 63;//Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.getRecordsByAgeGroup(ageStart, ageEnd, bpDiff);

        /*for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();*/

        bufferedReader.close();
       // bufferedWriter.close();
    }
}