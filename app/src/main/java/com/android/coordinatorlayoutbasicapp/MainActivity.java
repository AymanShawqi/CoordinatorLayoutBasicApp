package com.android.coordinatorlayoutbasicapp;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout=findViewById(R.id.coordinator);

        RecyclerView recyclerView=findViewById(R.id.recycler);
        PersonAdapter adapter=new PersonAdapter(this,Person.getPersonList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void showSnackbar(View view){
        final Snackbar snackbar=Snackbar.make(coordinatorLayout,"Hello",Snackbar.LENGTH_LONG);
        snackbar.setAction("Dismiss", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

    public void sayHello(View view){
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
    }
}
