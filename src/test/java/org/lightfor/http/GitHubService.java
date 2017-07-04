package org.lightfor.http;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * restful interface
 * Created by Light on 2017/6/28.
 */
public interface GitHubService {
    @GET("users/{user}/repos")
    Call<String> listRepos(@Path("user") String user);
}
