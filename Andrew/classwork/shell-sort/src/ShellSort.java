import java.util.List;

public class ShellSort<E extends Comparable<E>> implements Sortable<E> {
    public List<E> sort(List<E> list) {
        if (list.size() < 2) {
            return list;
        }
        int gap = list.size() / 2;
        while (gap > 0) {
            for (int i = gap; i < list.size(); i++) {
                E temp = list.get(i);
                int j = i;
                while (j >= gap && list.get(j - gap).compareTo(temp) > 0) {
                    list.set(j, list.get(j - gap));
                    j -= gap;
                }
                list.set(j, temp);
            }
            gap /= 2;
        }
        return list;
    }
}