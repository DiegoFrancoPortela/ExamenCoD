package com.cod;
public class Auxiliar {
    public static String Email = "";
    String direccion_IP = "127.0.0.2";

    private static Auxiliar instance = null;

    public static Auxiliar getInstance(){
        if (instance == null){
            instance = new Auxiliar();
        }
        Email = "anonymous@danielcastelao.org";
        return instance;
    }

    public static Auxiliar getInstance(String ema){
        if (instance == null){
            instance = new Auxiliar();
        }
        Email = ema;
        return instance;
    }

    public boolean verificacion() {
        if (Email!="anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
