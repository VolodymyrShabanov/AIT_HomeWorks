package home_work_47.teacher;

import java.util.*;

/**
 * Created by Volodymyr Sh on 13.11.2023
 * project name: AIT_HomeWorks
 */
public class Task3 {

    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");

//        directFlights.put("A", "C");
//        directFlights.put("C", "G");
//        directFlights.put("G", "H");
//        directFlights.put("H", "A");
//
//        directFlights.put("B", "D");
//        directFlights.put("D", "E");
//        directFlights.put("E", "F");
//        directFlights.put("F", "D");

//        List<String> route = findRoute(directFlights, "D", "B");

        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
        System.out.println(route);

        // Вывод: ["Boston", "Miami", "New York", "Chicago", "Denver", "Las Vegas"]
    }

    private static List<String> findRoute(Map<String, String> directFlights, String start, String finish) {
        LinkedList<String> route =new LinkedList<>();
        Set<String> previous = new HashSet<>();

        String currentCity = start;

        while (currentCity != null){
            route.add(currentCity);
            previous.add(currentCity);
            if (currentCity.equals(finish)) {break;}

            currentCity = directFlights.get(currentCity);

            if(previous.contains(currentCity)){break;}
        }

        System.out.println("raw route: " + route);

        if (route.getFirst().equals(start) && route.getLast().equals(finish)){
            return route;
        } else {
            return Collections.emptyList();
        }

    }

}
