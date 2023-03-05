package sn.esmt.cvclientapp.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private Retrofit retrofit;

    public RetrofitService(){
        initializeRetrofit();
    }
    // Cette fonction initialise le service Retrofit qui va nous permettre au client de communiquer au service via requête http
    private void initializeRetrofit(){
        retrofit = new Retrofit.Builder() //Nous créons une instance de la classe retrofit
                .baseUrl("http://192.168.1.3:8083") //Nous lui fournissons l'adresse ip et le numéro de port du serveur
                .addConverterFactory(GsonConverterFactory.create(new Gson())) //Nous créons une instance de la classe Gson afin que les données soient converties au format JSON
                .build(); //Construction de l'objet de connection
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
