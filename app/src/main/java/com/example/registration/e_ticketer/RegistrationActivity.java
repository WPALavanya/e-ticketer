package com.example.registration.e_ticketer;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegistrationActivity extends ActionBarActivity {

    EditText user_name , password , confirm_password , first_name , last_name , nic;
    String User_name , Password , Confirm_password , First_name , Last_name , Nic;
    Button register;
    Context ctx = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        user_name = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.password);
        confirm_password = (EditText) findViewById(R.id.confirm_password);
        first_name = (EditText) findViewById(R.id.first_name);
        last_name = (EditText) findViewById(R.id.last_name);
        nic = (EditText) findViewById(R.id.nic);
        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                User_name = user_name.getText().toString();
                Password = password.getText().toString();
                Confirm_password = confirm_password.getText().toString();
                First_name = first_name.getText().toString();
                Last_name = last_name.getText().toString();
                Nic = nic.getText().toString();

                if (!(Password.equals(Confirm_password))){
                    Toast.makeText(getBaseContext() , "Passwords are not matching" , Toast.LENGTH_LONG).show();
                    user_name.setText("");
                    password.setText("");
                    confirm_password.setText("");
                }else{
                    DatabaseOperations DB = new DatabaseOperations(ctx);
                    DB.putInformation(DB , User_name , First_name , Last_name , Nic, Password );
                    Toast.makeText(getBaseContext() , "Registration success" ,  Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registration, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
