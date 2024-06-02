import java.util.List;

public class Контроллер {
    private ПотокСервис потокСервис;

    public Контроллер(ПотокСервис потокСервис) {
        this.потокСервис = потокСервис;
    }

    public void сортироватьПотоки(List<Поток> потоки) {
        потокСервис.сортироватьПотоки(потоки);
    }
}
