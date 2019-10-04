   package dto.Vehicle;


    public class HybridEngine extends AParts implements IEngine {

        public String id;
        private int volume;
        private String fuel;


        public HybridEngine (String id, int volume){
            this.id = id;
            this.volume = volume;

        }

        public String getId() {
            return id;
        }

        public int getVolume() {
            return volume;
        }


        public String getFuel() {
            return "Hybrid";
        }



    }
