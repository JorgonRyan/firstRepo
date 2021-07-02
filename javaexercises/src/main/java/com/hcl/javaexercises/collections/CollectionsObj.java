package com.hcl.javaexercises.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class CollectionsObj {
	List<Object> list = new ArrayList<Object>();

	void printCollection(String[] colors) {
		for (int i = 0; i < colors.length; i++) {
			list.add(colors[i]);
		}
		System.out.println(list);
	}

	void iterateList(ArrayList<Object> iterateThrough) {
		while (iterateThrough.iterator().hasNext()) {
			System.out.println(iterateThrough.iterator().next());
		}
	}

	List<Object> reverseOrder(List<Object> reverseThis) {
		List<Object> reversed = reverseThis.subList(0, reverseThis.size());
		Collections.sort(reversed, Collections.reverseOrder());
		return reversed;
	}

	Set<Object> similarSet(Set<Object> set1, Set<Object> set2) {
		Set<Object> similarities = new HashSet<Object>();
		Iterator<Object> set1Value = set1.iterator(), set2Value = set2.iterator();
		while (set1Value.hasNext() && set2Value.hasNext()) {
			if (set1Value.next() == set2Value.next()) {
				similarities.add(set2Value.next());
			}
		}
		return similarities;
	}

	Set<Integer> greaterThanSeven(TreeSet<Integer> integerTree) {
		Set<Integer> lowerVals = new HashSet<Integer>();
		int currentMark = integerTree.lower(7);
		lowerVals.add(currentMark);
		while (integerTree.lower(currentMark) != null) {
			currentMark = integerTree.lower(currentMark);
			lowerVals.add(currentMark);
		}
		return lowerVals;
	}

	int numberOfMappings(Map<Object, Object> map) {
		return map.size();
	}

	void mapSetView(Map<Object, Object> map) {
		System.out.println(map.keySet());
	}

	Map<Object, Object> sortATree(TreeMap<Object, Object> treeMap) {
		treeMap.comparator();
		return treeMap;
	}
}
