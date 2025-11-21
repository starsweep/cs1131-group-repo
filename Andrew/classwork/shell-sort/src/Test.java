import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.junit.Assert.fail;

public class Test {
    @org.junit.Test
	public void checkIfWorking ( ) {
		ShellSort<Integer> shellSort = new ShellSort<Integer>( );
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        int listSize = 100000;
		for (int i = 0; i <= listSize; i++) {
            list.add(i, random.nextInt());
        }
        list = shellSort.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                fail("List did not sort!");
            }
        }
	}

	@org.junit.Test
	public void edgeCaseEmpty ( ) {
		ShellSort<Integer> shellSort = new ShellSort<Integer>( );
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = shellSort.sort(list);
        if (list != list2) {
            fail("Unexpected output!");
        }
	}

    @org.junit.Test
	public void edgeCaseLen1 ( ) {
		ShellSort<Integer> shellSort = new ShellSort<Integer>( );
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        List<Integer> list2 = shellSort.sort(list);
        if (list != list2) {
            fail("Unexpected output!");
        }
	}

    @org.junit.Test
	public void edgeCaseLen2 ( ) {
		ShellSort<Integer> shellSort = new ShellSort<Integer>( );
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list = shellSort.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                fail("List did not sort!");
            }
        }
	}
}
