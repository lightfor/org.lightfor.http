package org.lightfor.http;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

/**
 * OKHttp test
 * Created by Light on 2017/6/28.
 */
public class OKHttpTest {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public void test1() throws IOException {
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(JSON, "");
        Request request = new Request.Builder()
                .url("")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body());

    }
}
