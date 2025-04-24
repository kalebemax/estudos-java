package UtilizandoGson;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        String json = "{\\\"nome\\\":\\\"Rodrigo\\\",\\\"idade\\\":20,\\\"cidade\\\":\\\"Brasília\\\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);
    }
}
