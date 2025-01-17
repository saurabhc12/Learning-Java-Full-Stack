package client.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import entity.collection.Candidate;

public class Example {
	public static void main(String args[]) {
		List<Candidate> listofcandidates=new ArrayList<Candidate>();
		
		listofcandidates.add(new Candidate("Modi","Maharashtra","BJP",65,"Male"));
		listofcandidates.add(new Candidate("RGandhi","Maharashtra","Congress",65,"Male"));
		listofcandidates.add(new Candidate("Thakare","Maharashtra","Shivsena",65,"Male"));
		listofcandidates.add(new Candidate("Tilak","Maharashtra","Independant",65,"Male"));
		
		Map<Integer, List<Candidate>> puneregion= new HashMap<Integer, List<Candidate>>(); 
		
		puneregion.put(101, listofcandidates);
		puneregion.put(102, listofcandidates);
		puneregion.put(103, listofcandidates);
		puneregion.put(104, listofcandidates);
		
		Set<Integer> assembly = puneregion.keySet();
		
		System.out.println(assembly);
		
		for(Integer i:assembly) {
//			System.out.println(i);
			List<Candidate> list =puneregion.get(i);
			System.out.println(i + " --> "+list);
			
			for(Candidate c : list) {
				if(c.getPartyname().equals("BJP")) {
					System.out.println(c);
				}
			}
			
		
		}
//		System.out.println(puneregion.keySet());
		
	}

}
