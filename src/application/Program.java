package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Teacher;
import model.enums.Matters;
import model.enums.SchoolSeries;

public class Program {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Matters mt = null;
		List<Matters> listM = new ArrayList<>();
		listM.add(mt.MATHEMATICS);
		listM.add(mt.COMPUTING);
		SchoolSeries ss = null;
		List<SchoolSeries> listS = new ArrayList<>();
		listS.add(ss.FIFTH_GRADE);
		
		Teacher t = new Teacher("Gabriel", null, null, null, listM, listS);
		t.addMatter(mt.ENGLISH);
		//t.addMatter(mt);
		System.out.println(t);
		t.removeMatter(mt.ENGLISH);
		//t.removeMatter(mt.SCIENCE);
		System.out.println(t);
	}

}
