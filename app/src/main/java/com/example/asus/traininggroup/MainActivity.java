package com.example.asus.traininggroup;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.asus.traininggroup.frament.AccountFragment;
import com.example.asus.traininggroup.frament.HomeFragment;
import com.example.asus.traininggroup.frament.InformationFragment;
import com.example.asus.traininggroup.frament.InterestFragment;

public class MainActivity extends AppCompatActivity implements AHBottomNavigation.OnTabSelectedListener {
    private AHBottomNavigation bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bindView();
    }

    public void bindView(){
        bottom = (AHBottomNavigation) findViewById(R.id.bottom);
        AHBottomNavigationItem homeItem = new AHBottomNavigationItem(
                "home" , R.drawable.home ,R.color.colorAccent);
        AHBottomNavigationItem accountItem = new AHBottomNavigationItem(
                "account" , R.drawable.account ,R.color.colorAccent);
        AHBottomNavigationItem informationItem = new AHBottomNavigationItem(
                "information" , R.drawable.information ,R.color.colorAccent);
        AHBottomNavigationItem interestItem = new AHBottomNavigationItem(
                "interest" , R.drawable.interest ,R.color.colorAccent);
        bottom.addItem(homeItem);
        bottom.addItem(interestItem);
        bottom.addItem(informationItem);
        bottom.addItem(accountItem);
        bottom.setOnTabSelectedListener(this);
        bottom.setAccentColor(getResources().getColor(R.color.colorAccent));
        bottom.setCurrentItem(0);

    }

    private void replace(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_fragment , fragment);
        transaction.commit();
    }

    @Override
    public boolean onTabSelected(int position, boolean wasSelected) {
        switch (position){
            case 0:
                replace(new HomeFragment());
                break;
            case 1:
                replace(new InterestFragment());
                break;
            case 2:
                replace(new InformationFragment());
                break;
            case 3:
                replace(new AccountFragment());
                break;
            default:
                break;
        }
        return true;
    }
}
