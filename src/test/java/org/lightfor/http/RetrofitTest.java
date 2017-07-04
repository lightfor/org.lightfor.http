package org.lightfor.http;

import org.junit.Test;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Retrofit Test
 * Created by Light on 2017/6/28.
 */
public class RetrofitTest {

    @Test
    public void test1() throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Call<String> repos = service.listRepos("octocat");
        System.out.println(repos.execute().body());
    }
}
