package com.example.helloworld;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.*;

//hello world

@SuppressLint("ShowToast")
public class HelloWorld extends Activity {
	private Button closeButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	this.setContentView(R.layout.layout);
    	 this.closeButton = (Button)this.findViewById(R.id.button);
    	 this.closeButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				MessageBox("Hello world - from CongNghe365.com");
			}
		});        
        
    /*
    TextView text = new TextView(this);
    text.setText("Hello World!");
    setContentView(text);
    */
    }
    public void MessageBox(String message)
    {
       Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }  
    //hehe
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
