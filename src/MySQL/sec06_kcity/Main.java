package MySQL.sec06_kcity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        CityDao cityDao = new CityDao();
        City city1 = cityDao.getCityById(2340);
        City city2 = cityDao.getCityByName("수원");
        List<City> list = new ArrayList<>();
        list = cityDao.getCityListAll();
        System.out.println(city1);
        System.out.println(city2);
        System.out.println();
        for (City lis : list)
            System.out.println(lis);
    }
}
