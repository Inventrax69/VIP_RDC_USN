package com.inventrax.karthikm.merlinwmscipher_vip_rdc.logout;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import com.inventrax.karthikm.merlinwmscipher_vip_rdc.interfaces.MainActivityView;
import com.inventrax.karthikm.merlinwmscipher_vip_rdc.Activities.LoginActivity;
import com.inventrax.karthikm.merlinwmscipher_vip_rdc.util.ProgressDialogUtils;
import com.inventrax.karthikm.merlinwmscipher_vip_rdc.util.SharedPreferencesUtils;


public class LogoutUtil {

    private FragmentActivity fragmentActivity;
    private SharedPreferencesUtils sharedPreferencesUtils;
    private Activity activity;
    private MainActivityView mainActivityView;



    public void setFragmentActivity(FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
    }

    public void setSharedPreferencesUtils(SharedPreferencesUtils sharedPreferencesUtils) {
        this.sharedPreferencesUtils = sharedPreferencesUtils;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
        new ProgressDialogUtils(activity);
    }



    public void setMainActivityView(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
    }











    public void doLogout(){

        try
        {
            Intent loginIntent = new Intent(activity, LoginActivity.class);
            activity.startActivity(loginIntent);
            sharedPreferencesUtils.removePreferences("url");

            //Toast.makeText(activity, "You have successfully logged out", Toast.LENGTH_LONG).show();
            activity.finish();

        }catch (Exception ex){

        }

    }


}
