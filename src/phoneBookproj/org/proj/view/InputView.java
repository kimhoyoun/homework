package phoneBookproj.org.proj.view;

import phoneBookproj.org.proj.R;
import phoneBookproj.org.proj.model.PhoneVo;

public class InputView extends PhoneView {
	@Override
	public void display() {
		System.out.println("--------------------------INPUT-------------------------");
		System.out.println("이름, 전화번호, 이메일을 입력해 주세요!");
		System.out.print("이름 >> ");
		String name = getLine();
		System.out.print("전화번호 >> ");
		String tel = getLine();
		System.out.print("이메일 >> ");
		String email = getLine();
		
		R.phoneVo = new PhoneVo(0,name,tel,email);
	}
}
