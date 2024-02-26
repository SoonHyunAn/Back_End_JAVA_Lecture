package MySQL.sec12_Exam.Two;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();

        City city = cityDao.getCity(2340);
        System.out.println(city);
        System.out.println();

        List<City> list = cityDao.getCityList("name", "a",100,0);
        for (City lis : list)
            System.out.println(lis);
        System.out.println();

        list = cityDao.getCityList("CountryCode", "KOR",100,0);

//        city = new City("화성", "KOR", "Kyonggi", 900000);
//        cityDao.insertCity(city);
//        for (City lis : list)
//            System.out.println(lis);
//        System.out.println();
//
        city = cityDao.getCity(2396);
        city.setName("의왕");
        city.setPopulation(220000);
        cityDao.updateCity(city);
        for (City lis : list)
            System.out.println(lis);
        System.out.println();

//        cityDao.deleteCity(4084);
//        for (City lis : list)
//            System.out.println(lis);
//        System.out.println();

        cityDao.close();
    }
}
