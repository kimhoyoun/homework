package phoneBookproj.org.proj.view;

import phoneBookproj.org.proj.R;
import phoneBookproj.org.proj.model.PhoneVo;

public class SearchView extends PhoneView {
	@Override
	public void display() {
		System.out.println("-------------------------SEARCH-------------------------");
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 >> ");
		String name = getLine();
		
		R.phoneVo = new PhoneVo(0,name, null, null);
	}
}
