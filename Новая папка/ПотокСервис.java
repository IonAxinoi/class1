import java.util.Collections;
import java.util.List;

public class ПотокСервис {
    public void сортироватьПотоки(List<Поток> потоки) {
        Collections.sort(потоки, new StreamComparator());
    }
}
