package com.rightside.appnodemcu;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Conexao {

    public static String getDados(String urlUsuario) {

            OkHttpClient client = new OkHttpClient();


                    Request request = new Request.Builder()
                            .url(urlUsuario)
                            .build();

                    try {
                        Response response = client.newCall(request).execute();
                        return response.body().string();

                    } catch (IOException error) {
                       return null;
                    }



        }

}