package sdp4;

public class Sakura implements Observer {
    @Override
    public void update() {
        System.out.println("Сакура атакует!");
        summonTechnique("Катсуя");
    }

    private void summonTechnique(String technique) {
        System.out.println("Сакура использует технику призыва: " + technique);
    }
}
