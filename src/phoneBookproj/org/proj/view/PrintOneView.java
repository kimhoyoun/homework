package phoneBookproj.org.proj.view;

import phoneBookproj.org.proj.R;

public class PrintOneView extends PhoneView{
	@Override
	public void display() {
		System.out.println("--------------------------PRINT-------------------------");
		if(R.phoneVo==null) {
			System.out.println("해당 정보가 없습니다!");
			return;
		}
		System.out.println("검색된 사람의 정보를 출력합니다!");
		System.out.println(R.phoneVo);
			
	}
}
