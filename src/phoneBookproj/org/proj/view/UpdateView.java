package phoneBookproj.org.proj.view;

import phoneBookproj.org.proj.R;

public class UpdateView extends PhoneView {
	@Override
	public void display() {
		if (R.phoneVo == null) {
			System.out.println("해당 정보가 없습니다!");
			return;
		}
		System.out.println("--------------------------UPDATE-------------------------");
		System.out.println(R.phoneVo);

		System.out.print("이름을 수정하시겠습니까? (y/n) >> ");
		char yn = getLine().charAt(0);
		while (!(yn == 'y' || yn == 'Y' || yn == 'n' || yn == 'N')) {
			System.out.print("y 또는 n만 입력하세요! 다시 입력 >> ");
			yn = getLine().charAt(0);
		}
		
		if (yn == 'y' || yn == 'Y') {
			System.out.print("새 이름 입력 >> ");
			String name = getLine();
			R.phoneVo.setName(name);
		}
		System.out.print("전화번호를 수정하시겠습니까? (y/n) >> ");
		yn = getLine().charAt(0);
		while (!(yn == 'y' || yn == 'Y' || yn == 'n' || yn == 'N')) {
			System.out.print("y 또는 n만 입력하세요! 다시 입력 >> ");
			yn = getLine().charAt(0);
		}
		if (yn == 'y' || yn == 'Y') {
			System.out.print("새 전화번호 입력 >> ");
			String tel = getLine();
			R.phoneVo.setTel(tel);
		}
		System.out.print("이메일을 수정하시겠습니까? (y/n) >> ");
		yn = getLine().charAt(0);
		while (!(yn == 'y' || yn == 'Y' || yn == 'n' || yn == 'N')) {
			System.out.print("y 또는 n만 입력하세요! 다시 입력 >> ");
			yn = getLine().charAt(0);
		}
		if (yn == 'y' || yn == 'Y') {
			System.out.print("새 이메일 입력 >> ");
			String email = getLine();
			R.phoneVo.setEmail(email);
		}
		System.out.println("수정이 완료되었습니다!");
	}
}
