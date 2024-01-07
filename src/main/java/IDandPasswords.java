import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String, String>();
    IDandPasswords(){
        logininfo.put("Bro","pizza");
        logininfo.put("Eloise","Jackfruit");
        logininfo.put("Cecca","cambridge123");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
