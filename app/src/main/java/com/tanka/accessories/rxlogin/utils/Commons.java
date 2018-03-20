package com.tanka.accessories.rxlogin.utils;


import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.List;

import retrofit2.Call;

/**
 * Created by access-tanka on 3/20/18.
 *
 */

public class Commons {
    //Used to cancel Retrofit's call or calls
    public static void cancel(Call... calls) {
        if (calls != null) {
            for (Call call : calls) {
                if (call != null)
                    call.cancel();
            }
        }
    }

    //Use this method for showing Progress dialog with Custom message passed from view
    public static ProgressDialog showLoadingDialog(Context context, String message) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
        return progressDialog;
    }

    //Use this method for showing Progress dialog with default message
    public static ProgressDialog showLoadingDialog(Context context) {
        return showLoadingDialog(context, "Please wait...");
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && (networkInfo.isConnected());
    }

    public static boolean isEmpty(List list) {
        return list == null || list.isEmpty();
    }
}