package play.modules.gae;

import play.Logger;
import play.Play;

import com.google.apphosting.api.ApiProxy;

public class GAEInit {

    static {
        if(ApiProxy.getCurrentEnvironment() != null) {
            Logger.forceJuli = true;
            Logger.setUp("DEBUG");
            Logger.info("Play! is running in Google App Engine");
            Play.readOnlyTmp = true;
            Play.usePrecompiled = true;
        } else {
            Logger.redirectJuli = true;
        }
    }
    
}
