package Array.SeparateSquaresII;
import java.util.*;

public class SeparateSquaresII {

    static class Event {
        double x, y1, y2;
        int type;
        Event(double x, double y1, double y2, int type) {
            this.x = x;
            this.y1 = y1;
            this.y2 = y2;
            this.type = type;
        }
    }

    public static double separateSquares(int[][] squares) {
        double total = unionArea(squares, Double.POSITIVE_INFINITY);
        double half = total / 2.0;

        double low = 0, high = 1e9;

        for (int i = 0; i < 70; i++) {
            double mid = (low + high) / 2.0;
            if (unionArea(squares, mid) < half) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static double unionArea(int[][] squares, double limitY) {
        List<Event> events = new ArrayList<>();

        for (int[] s : squares) {
            double x1 = s[0], y1 = s[1], l = s[2];
            double y2 = Math.min(y1 + l, limitY);
            if (y2 <= y1) continue;

            events.add(new Event(x1, y1, y2, 1));
            events.add(new Event(x1 + l, y1, y2, -1));
        }

        events.sort(Comparator.comparingDouble(e -> e.x));

        TreeMap<Double, Integer> map = new TreeMap<>();
        double prevX = 0, area = 0;

        for (Event e : events) {
            area += (e.x - prevX) * activeHeight(map);

            map.put(e.y1, map.getOrDefault(e.y1, 0) + e.type);
            map.put(e.y2, map.getOrDefault(e.y2, 0) - e.type);

            if (map.get(e.y1) == 0) map.remove(e.y1);
            if (map.get(e.y2) == 0) map.remove(e.y2);

            prevX = e.x;
        }

        return area;
    }

    private static double activeHeight(TreeMap<Double, Integer> map) {
        double height = 0, prev = 0;
        int count = 0;

        for (var e : map.entrySet()) {
            if (count > 0) {
                height += e.getKey() - prev;
            }
            count += e.getValue();
            prev = e.getKey();
        }
        return height;
    }

    public static void main(String[] args) {
        int[][] squares = {{0,0,2},{1,1,1}};
        System.out.printf("%.5f%n", separateSquares(squares));
    }
}