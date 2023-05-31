import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {
    Map<Integer, CheckInData> checkInMap;
    Map<String, TravelData> timeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        timeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckInData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInData checkInData = checkInMap.get(id);
        checkInMap.remove(id);

        String startStation = checkInData.stationName;
        int startTime = checkInData.time;

        String key = startStation + "," + stationName;
        timeMap.putIfAbsent(key, new TravelData(0, 0));
        TravelData travelData = timeMap.get(key);

        int totalTime = travelData.totalTime + (t - startTime);
        int tripCount = travelData.tripCount + 1;

        timeMap.put(key, new TravelData(totalTime, tripCount));
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "," + endStation;
        TravelData travelData = timeMap.get(key);
        return (double) travelData.totalTime / travelData.tripCount;
    }

    private static class CheckInData {
        String stationName;
        int time;

        public CheckInData(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    private static class TravelData {
        int totalTime;
        int tripCount;

        public TravelData(int totalTime, int tripCount) {
            this.totalTime = totalTime;
            this.tripCount = tripCount;
        }
    }
}
