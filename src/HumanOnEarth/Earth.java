package HumanOnEarth;

public class Earth {

    public static void main(String[] args) {

        Homosapien Flintsonte;

        Flintsonte = new Homosapien();

        Flintsonte.hairColor = "black";
        Flintsonte.HeightsInFeet = 7;
        Flintsonte.Name = "Fred Flintstone";
        Flintsonte.Weight = 250;

        Flintsonte.overAll();
        Flintsonte.eat();
        Flintsonte.kill();
        Flintsonte.hunt();
        Flintsonte.present();
    }
}
