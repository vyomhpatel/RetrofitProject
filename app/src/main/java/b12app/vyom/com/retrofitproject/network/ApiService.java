package b12app.vyom.com.retrofitproject.network;

import java.util.List;

import b12app.vyom.com.retrofitproject.model.Movie;
import b12app.vyom.com.retrofitproject.model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

//http://api.themoviedb.org/3/movie/top_rated?api_key=1a9fe68c812fcff9996d16b39c0a477a
    //http://rjtmobile.com/aamir/e-commerce/android-app/shop_login.php?mobile=55565454&password=7011

    @GET("shop_login.php")
    Call<List<User>> getUser(@Query("mobile") String mobileNumber, @Query("password") String password);

    @GET("top_rated")
    Call<Movie> getTopRatedMovies(@Query("api_key") String apiKey);


}
