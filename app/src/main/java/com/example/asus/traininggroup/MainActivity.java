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

import cn.bmob.v3.Bmob;

public class MainActivity extends AppCompatActivity implements AHBottomNavigation.OnTabSelectedListener {
    private AHBottomNavigation bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        InitBmob();
        bindView();
    }

    public void InitBmob(){
        //提供以下两种方式进行初始化操作：

        //第一：默认初始化
        Bmob.initialize(this, "Your Application ID");
        // 注:自v3.5.2开始，数据sdk内部缝合了统计sdk，开发者无需额外集成，传渠道参数即可，不传默认没开启数据统计功能
        //Bmob.initialize(this, "Your Application ID","bmob");

        //第二：自v3.4.7版本开始,设置BmobConfig,允许设置请求超时时间、文件分片上传时每片的大小、文件的过期时间(单位为秒)，
        //BmobConfig config =new BmobConfig.Builder(this)
        ////设置appkey
        //.setApplicationId("Your Application ID")
        ////请求超时时间（单位为秒）：默认15s
        //.setConnectTimeout(30)
        ////文件分片上传时每片的大小（单位字节），默认512*1024
        //.setUploadBlockSize(1024*1024)
        ////文件的过期时间(单位为秒)：默认1800s
        //.setFileExpiration(2500)
        //.build();
        //Bmob.initialize(config);
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
