package bd.com.bangal.bangalphone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastMessage.toastMassage(MainActivity.this,"Hello!\nI'm Kabir Hassan!");
    }
}