package com.yavuz.landmarks;


import java.io.Serializable;

public class Landmark implements Serializable {

        String name;
        String country;
        String info;
        int image;

        public Landmark(String name, String country, String info, int image) {
            this.name = name;
            this.country = country;
            this.image = image;
            this.info = info;
        }

}


