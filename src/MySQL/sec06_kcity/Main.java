package MySQL.sec06_kcity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();

        // select
        City city1 = cityDao.getCityById(2340);
        System.out.println(city1);
        System.out.println();

        City city2 = cityDao.getCityByName("수원");
        System.out.println(city2);
        System.out.println();

        List<City> list1 = cityDao.getCityListAll();
        for (City lis : list1)
            System.out.println(lis);
        System.out.println();

        List<City> list2 = cityDao.getCityByDistrict("Kyonggi");
        for (City lis : list2)
            System.out.println(lis);
        System.out.println();

        // insert
        City city3 = new City("화성", "KOR", "Kyonggi", 900000);
        cityDao.insertCity(city3);
        for (City lis : list2)
            System.out.println(lis);
        System.out.println();

        //update
        City city4 = cityDao.getCityById(2396);
        city4.setName("의왕");
        city4.setPopulation(200000);
        cityDao.updateCity(city4);
        for (City lis : list2)
            System.out.println(lis);
        System.out.println();

        //delete
        cityDao.deleteCity(2402);
        for (City lis : list2)
            System.out.println(lis);
        System.out.println();
    }
}
