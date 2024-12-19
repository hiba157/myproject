package personnage;

public class Personnage {


        private String[] directions = {"NORD", "EST", "SUD", "OUEST"};
        private int orientation;


        public Personnage() {
            this.orientation = 0;
        }


        public String tourner(int fois) {

            this.orientation = (this.orientation + fois) % 4;
            if (this.orientation < 0) {
                this.orientation += 4;
            }
            return directions[this.orientation];
        }
    }

