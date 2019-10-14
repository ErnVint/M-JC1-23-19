package java.dto.Vehicle.Tyres;

import java.dto.Vehicle.AParts;

public abstract class ATyres extends AParts implements ITyres {
        private int size;
        //private String season;
        private String brand;

        public ATyres (int size, String brand) {
                this.brand = brand;
                this.size = size;
        }

        public String getBrand(){return brand;}
        public int getTyreSize(){return size;}


}
