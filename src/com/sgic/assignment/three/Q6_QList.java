package com.sgic.assignment.three;

import java.util.ArrayList;
import java.util.List;

public class Q6_QList {
	private static List<Q6_Mcq> qList = new ArrayList<Q6_Mcq>();

	public List<Q6_Mcq> getqList() {
		return qList;
	}

	public void addToqList(Q6_Mcq mcq) {
		qList.add(mcq);
	}	
}
