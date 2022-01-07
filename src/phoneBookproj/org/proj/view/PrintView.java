package phoneBookproj.org.proj.view;

import java.util.Iterator;

import phoneBookproj.org.proj.R;
import phoneBookproj.org.proj.model.PhoneVo;

public class PrintView extends PhoneView {
	@Override
	public void display() {
		System.out.println("--------------------------PRINT-------------------------");
		if (R.phoneList == null) {
			System.out.println("저장된 목록이 없습니다!");
			return;
		}
		System.out.println("저장된 목록을 출력합니다!");

		Iterator<PhoneVo> it = R.phoneList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
