package phoneBookproj.org.proj;

import java.util.ArrayList;

import phoneBookproj.org.proj.model.PhoneVo;
import phoneBookproj.org.proj.view.DeleteView;
import phoneBookproj.org.proj.view.ErrorView;
import phoneBookproj.org.proj.view.InputView;
import phoneBookproj.org.proj.view.MenuView;
import phoneBookproj.org.proj.view.PhoneView;
import phoneBookproj.org.proj.view.PrintOneView;
import phoneBookproj.org.proj.view.PrintView;
import phoneBookproj.org.proj.view.SearchView;
import phoneBookproj.org.proj.view.UpdateView;

public class R {
	public static int num = 1;
	public static int no;
	public static int idx;
	public static PhoneVo phoneVo;
	public static ArrayList<PhoneVo> phoneList;
	
	
	public static final PhoneView MENU = new MenuView();
	public static final PhoneView INPUT = new InputView();
	public static final PhoneView PRINT = new PrintView();
	public static final PhoneView PRINTONE = new PrintOneView();
	public static final PhoneView SEARCH = new SearchView();
	public static final PhoneView DELETE = new DeleteView();
	public static final PhoneView UPDATE = new UpdateView();
	public static final PhoneView ERROR = new ErrorView();
	
}
