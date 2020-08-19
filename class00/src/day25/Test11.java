//★★ 
//종합,  이해는 되는데... 확실히 복잡하고 어렵네;
package day25;

import java.io.*;
import java.util.*;
public class Test11 {

	//출력 타겟 스트림 준비
	FileOutputStream fout = null;
	
	//출력 보조 스트림 준비
	ObjectOutputStream oout = null;
	
	//입력 타켓 스트림 준비
	FileInputStream fin =null;
	
	//입력 보조 스트림 준비
	ObjectInputStream oin =null;	
	
	TreeMap<String, TreeMap<String, Object>> map =null;
	public Test11() {
		//데이터 만들기(TreeMap으로...)
		map = getFrMap();
		
		//파일 내보내기 함수 호출
		try {
			outMap();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
		
		//파일 읽어오기 함수 호출
		try {
			inMap();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
		
		
	}
	
	//파일내보내기 처리함수
	public void outMap() throws Exception {
		//타겟 스트림 준비
		fout = new FileOutputStream("src/day25/docu/bolpalgan.cls");
		//보조 스트림 준비
		oout = new ObjectOutputStream(fout);
		
		// 데이터 쓰고 내보내고
		oout.writeObject(map);
	}
	
	//파일 읽기 함수
	public void inMap() throws Exception{
		//타겟 스트림 준비
		fin = new FileInputStream("src/day25/docu/bolpalgan.cls");
		//보조 스트림 준비
		oin = new ObjectInputStream(fin);
		//데이터 읽고
		TreeMap<String, TreeMap<String, Object>> map = (TreeMap<String, TreeMap<String, Object>>)oin.readObject();
		//출력하고
		//키들을 뽑아내자
		Set<String> set = map.keySet();
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String key = itor.next();
			System.out.println(" ### "+key+ " Data ");
			TreeMap<String, Object> subMap = map.get(key);
			
			Set<String> set2 = subMap.keySet();
			ArrayList<String> list = new ArrayList<String>(set2);
			for(String subkey : list) {
				Object o = subMap.get(subkey);
				if(o instanceof String) {
					System.out.println(subkey+"|"+ (String)o);
				}else if (o instanceof Integer) {
					System.out.println(subkey+"|"+(int)o);
				}
			}
			System.out.println();
		}
		
	}
	
	//친구들의 정보를 TreeMap에 담아서 반환해주는 함수
	public TreeMap<String, TreeMap<String, Object>> getFrMap(){
	TreeMap<String, TreeMap<String, Object>> map = new TreeMap<String, TreeMap<String, Object>>();

		//map에 채울 맵 만들기 1
		TreeMap<String, Object> m1 =new TreeMap<String, Object> ();
		m1.put("name", "안지영");
		m1.put("age", 26);
		m1.put("mail", "anjiy@increaps.com");

		map.put((String) m1.get("name"), m1);
		//map에 채울 맵 만들기 2
		m1 =new TreeMap<String, Object> ();
		m1.put("name", "우지윤");
		m1.put("age", 26);
		m1.put("mail", "woojy@increaps.com");
		
		map.put((String) m1.get("name"), m1);
		
	return map;
	}
	public static void main(String[] args) {
		new Test11();
	}

}
