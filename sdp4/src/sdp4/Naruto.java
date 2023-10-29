package sdp4;

public class Naruto implements Observer {
    @Override
    public void update() {
        System.out.println("Наруто атакует!");
        summonTechnique("Гамабунта");
    }

    private void summonTechnique(String technique) {
        System.out.println("Наруто использует технику призыва: " + technique);
    }
}
