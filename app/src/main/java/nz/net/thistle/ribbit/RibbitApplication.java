package nz.net.thistle.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Scott on 27/10/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "tCYkbg9eI4CkjMO3wAUFFYvZWFF8WstgjP88Vdom", "7BBkmRPjTXLcl5L0JgqJEJ28w0EhR9cyJxhKTutu");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
