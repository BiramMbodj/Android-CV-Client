package sn.esmt.cvclientapp.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import sn.esmt.cvclientapp.entity.AppCvEntity;

public interface Api {
    @GET("/cv/all")
    Call<List<AppCvEntity>> getAllCv();

    @POST("/cv/all")
    Call<AppCvEntity> save(@Body AppCvEntity appCvEntity);
}
