package com.akashdubey.contextmenudemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textview1);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.conetxt_menu,menu);
        menu.setHeaderTitle("Context Menu");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        
        switch(item.getItemId()){
            case R.id.action1:
                Toast.makeText(this, "Action1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action2:
                Toast.makeText(this, "Action2 clicked ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action3:
                Toast.makeText(this, "Action3 clicked", Toast.LENGTH_SHORT).show();
                break;
            default:

                //may be some code for default
                ;
        }
            
        return super.onContextItemSelected(item);
    }
}
