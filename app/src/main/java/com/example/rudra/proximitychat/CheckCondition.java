package com.example.rudra.proximitychat;

public class CheckCondition {
    static int SPLASH_DONE=0;

    public static void setSplash(){
        SPLASH_DONE=1;
    }

    public static int get_Splash(){
        return SPLASH_DONE;
    }

}
