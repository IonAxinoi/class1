import java.util.Iterator;
import java.util.List;

public class Поток implements Iterable<УчебнаяГруппа> {
    private List<УчебнаяГруппа> группы;

    public Поток(List<УчебнаяГруппа> группы) {
        this.группы = группы;
    }

    public List<УчебнаяГруппа> getГруппы() {
        return группы;
    }

    @Override
    public Iterator<УчебнаяГруппа> iterator() {
        return группы.iterator();
    }
}
