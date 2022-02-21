package com.example.activity__and__fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAdd, btnReplace, btnRemove;
    private FragmentTransaction fragmentTransaction;

    private void  addFragment(Fragment fragmentBlank){
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container , fragmentBlank);
        fragmentTransaction.commit();
    }
    private void replaceFragment(Fragment fragmentBlank){

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container , fragmentBlank);
        fragmentTransaction.commit();
    }
    private void removeFragment(Fragment fragmentBlank) {

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.remove(fragmentBlank);
        fragmentTransaction.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle " ,"onCreate");
        btnAdd = findViewById(R.id.btnOpen);
        btnReplace = findViewById(R.id.btnReplace);
        btnRemove = findViewById(R.id.btnRemove);

        Fragment fragment = new BlankFragment();
        Fragment fragment2 = new BlankFragment2();

        btnAdd.setOnClickListener(v-> addFragment(fragment));
        btnReplace.setOnClickListener(v-> replaceFragment(fragment2));
        btnRemove.setOnClickListener(v -> removeFragment(fragment2));
    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy");
    }

}
