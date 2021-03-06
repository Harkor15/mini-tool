package harkor.mini_toolbyharkor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exit(View view){
    System.exit(0);
    }

    public void version(View view){
        Context context=getApplicationContext();
        Toast.makeText(context,"v0.01",Toast.LENGTH_SHORT).show();
    }
    public void to_muter(View view){
        Intent intent=new Intent(this,Muter.class);
        startActivity(intent);
    }
}
