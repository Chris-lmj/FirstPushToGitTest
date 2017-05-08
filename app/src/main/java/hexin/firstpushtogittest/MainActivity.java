package hexin.firstpushtogittest;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //找到内容
        TextView contetn = (TextView) findViewById(R.id.content);
        contetn.setText("change01");
        contetn.setText("change03");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
    }
}
