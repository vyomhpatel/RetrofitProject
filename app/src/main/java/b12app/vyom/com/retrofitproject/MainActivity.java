package b12app.vyom.com.retrofitproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import b12app.vyom.com.retrofitproject.model.Movie;
import b12app.vyom.com.retrofitproject.model.User;
import b12app.vyom.com.retrofitproject.network.ApiService;
import b12app.vyom.com.retrofitproject.network.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="response tag" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiService apiService = RetrofitInstance.getRetrofitInstance().create(ApiService.class);

//        Call<List<User>> userCall = apiService.getUser("7405078484","5555");
//        userCall.enqueue(new Callback<List<User>>() {
//            @Override
//            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
//
//                Log.i(TAG, "User details: Name = "+response.body().get(0).getFirstname()+" Email = "+response.body().get(0).getEmail()
//                +" Mobile = "+response.body().get(0).getMobile());
//            }
//
//            @Override
//            public void onFailure(Call<List<User>> call, Throwable t) {
//                Log.i(TAG, "onFailure: "+t.getMessage());
//            }
//        });

        Call<Movie> movieCall = apiService.getTopRatedMovies("1a9fe68c812fcff9996d16b39c0a477a");
        movieCall.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Log.i(TAG, "Movie Response Message:"+response.body());
                Movie movie = response.body();
                Log.i(TAG, "First Movie"+movie.getResults().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Log.i(TAG, "On Movie Response Failure"+t.getMessage());
            }
        });

    }
}
