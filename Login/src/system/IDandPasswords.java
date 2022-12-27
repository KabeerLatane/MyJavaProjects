package system;

import java.util.HashMap;

public class IDandPasswords {
HashMap<String,String> logininfo=new HashMap<String,String>();
public IDandPasswords() {
	logininfo.put("Kabeer","123" );
	logininfo.put("anjor","456" );
	logininfo.put("brocode","789p" );

}
protected HashMap getLoginInfo(){
	return logininfo;
	
}

}
