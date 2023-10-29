package sdp4;

public class Sasuke implements Observer {
    @Override
    public void update() {
        System.out.println("Саске атакует!");
        summonTechnique("Аода");
    }

    private void summonTechnique(String technique) {
        System.out.println("Саске использует технику призыва: " + technique);
    }
}
