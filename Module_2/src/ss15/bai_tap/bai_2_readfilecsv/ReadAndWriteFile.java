package ss15.bai_tap.bai_2_readfilecsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        Country country1 = new Country(1, "AU", "Australia");
        Country country2 = new Country(2, "CN", "China");
        Country country3 = new Country(3, "AU", "Australia");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "CN", "China");
        Country country7 = new Country(7, "JP", "Japan");
        Country country8 = new Country(8, "TH", "Thailand");
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);
        countryList.add(country5);
        countryList.add(country6);
        countryList.add(country7);
        countryList.add(country8);
        writeFileCountry(countryList, "src/ss15/bai_tap/bai_2_readfilecsv\\country.csv");
        List<Country> countriesListFromFile = readFileCountry("src/ss15/bai_tap/bai_2_readfilecsv/country.csv");
        for (Country c : countriesListFromFile) {
            System.out.println(c);
        }
    }

    public static void writeFileCountry(List<Country> countryList, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < countryList.size(); i++) {
                bufferedWriter.write(countryList.get(i).getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static List<Country> readFileCountry(String path) {
        List<Country> countryList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] countryArr = line.split(",");
                Country country = new Country(Integer.parseInt(countryArr[0]), countryArr[1], countryArr[2]);
                countryList.add(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countryList;
    }
}
