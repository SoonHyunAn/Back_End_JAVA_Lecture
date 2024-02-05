package MySQL.sec06_kcity;

public class Main {
    public static void main(String[] args){
        CityDao cityDao = new CityDao();
        City city1 = cityDao.getCityById(2340);
        City city2 = cityDao.getCityByName("수원");
        System.out.println(city1);
        System.out.println(city2);
    }
}
