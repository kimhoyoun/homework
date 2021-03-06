package phoneBookproj.org.proj.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class PhoneDAO {
	public static int no = 1;
	private static File file = new File("phonebook.dat");
	private static FileInputStream fis;
	private static ObjectInputStream ois;
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	private static ArrayList<PhoneVo> pList;

	{
		if (file.exists()) {
			pImport();
			if (pList.size() != 0) {
				no = pList.get(pList.size() - 1).getNo() + 1;
			}
		} else {
			pList = new ArrayList<PhoneVo>();
		}

	}

	// 입력
	public boolean input(PhoneVo vo) {
		for (int i = 0; i < pList.size(); i++) {
			if (pList.get(i).getName().equals(vo.getName())) {
				return false;
			}
		}
		vo.setNo(no++);
		return pList.add(vo);
	}

	// 삭제
	public void delete(PhoneVo vo) {
		if (vo != null) {
			int idx = pList.indexOf(vo);
			pList.remove(idx);
		}

	}

	// 검색
	public PhoneVo search(PhoneVo vo) {
		if (vo == null || pList.size() == 0) {
			return null;
		}
		
		int idx = pList.indexOf(vo);
		if (idx != -1) {
			PhoneVo p = new PhoneVo();
			p.setNo(pList.get(idx).getNo());
			p.setName(pList.get(idx).getName());
			p.setTel(pList.get(idx).getTel());
			p.setEmail(pList.get(idx).getEmail());
			return p;
		}
		return null;
	}

	// 출력
	public ArrayList<PhoneVo> print() {
		ArrayList<PhoneVo> list = new ArrayList<>();
		if (pList.size() == 0) {
			return null;
		}
		Iterator<PhoneVo> it = pList.iterator();
		while (it.hasNext()) {
			PhoneVo p = it.next();
			list.add(p);
		}

		return list;
	}

	// 수정
	public void update(PhoneVo vo) {
		if (vo == null || pList.size() == 0) {
			return;
		}
		int idx = pList.indexOf(vo);
		pList.set(idx, vo);
	}

	// 저장
	public void save() {
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(pList);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
			}
		}
	}

	// 저장된 파일 읽어오기
	public void pImport() {
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			pList = (ArrayList<PhoneVo>) ois.readObject();
		} catch (FileNotFoundException e) {
			pList = new ArrayList<PhoneVo>();
		} catch (ClassNotFoundException e) {
		} catch (IOException e) {
			return;
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
			}
		}
	}

}
