package com.wordpress.learnmix.learnmix_hw;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;


public class Reg_activity extends Activity {

    protected EditText vr_username;
    protected EditText vr_email;
    protected EditText vr_dob;

   // protected EditText vr_password;
    protected Button vr_button;

   // int current_year = 2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
    //initialize variable
        vr_username = (EditText)findViewById(R.id.username_id);
        vr_email = (EditText)findViewById(R.id.email_id);
        vr_dob = (EditText)findViewById(R.id.dob_id);
      //  vr_password = (EditText)findViewById(R.id.pw_id);
        vr_button = (Button)findViewById(R.id.btn_id);

        //listner
        vr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

               if (vr_dob == null )
                   Toast.makeText(Reg_activity.this, "Hi!" + vr_username + "Please Enter Date Of Birth", Toast.LENGTH_LONG).show();
               else if(vr_username == null)
                   Toast.makeText(Reg_activity.this, "Hi!" + vr_username + "Please Enter User Name", Toast.LENGTH_LONG).show();
               else if(vr_email == null)
                   Toast.makeText(Reg_activity.this, "Hi!" + vr_username + "Please Enter Email Address", Toast.LENGTH_LONG).show();
                else
                {
                    Toast.makeText(Reg_activity.this, "Hi!" + vr_username + "Welcome you are Registered Successfully", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reg_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
