package lib.help.toasterhelperlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void messageToShow (Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
