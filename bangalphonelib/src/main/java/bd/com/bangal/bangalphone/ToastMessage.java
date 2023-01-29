package bd.com.bangal.bangalphone;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
        public static void toastMassage(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
