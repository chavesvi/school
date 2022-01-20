package application;

import java.util.HashMap;
import java.util.Map;

import model.entities.Teacher;
import model.enums.Matters;
import model.enums.SchoolSeries;

public class Program {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Matters mt = null;
		SchoolSeries ss = null;
		Map<SchoolSeries, Matters> map = new HashMap<>();
		map.put(ss.FIFTH_GRADE, mt.ARTS);
		map.put(ss.SEVENTH_GRADE, mt.ARTS);
		
		Teacher t = new Teacher("Gabriel", null, null, null, map);
		t.addMatter(mt.ENGLISH);
		//t.addMatter(mt);
		System.out.println(t);
		t.removeMatter(mt.ENGLISH);
		//t.removeMatter(mt.SCIENCE);
		System.out.println(t);
		t.addClass(ss.NINTH_GRADE, mt.SCIENCE);
		System.out.println(t);
		t.removeClass(ss.NINTH_GRADE);
		System.out.println(t);
	}

}
