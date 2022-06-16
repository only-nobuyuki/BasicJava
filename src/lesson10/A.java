package lesson10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class A implements Iterable<Integer> {
	List<String> list = new ArrayList<>();
	Set<Integer> set = new LinkedHashSet<>();
	Map<Integer, String> map = new HashMap<>();
	Iterable<String> itest = new ArrayList<String>();

	void test() {
		Iterator<String> iteList = list.iterator();
		Iterator<Integer> iteSet = set.iterator();
		Iterator<String> iteList2 = itest.iterator();

	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
