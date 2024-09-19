package anjos;

class AngelWatcher implements Observer {
    @Override
    public void update(Anjo anjo) {
        System.out.println("Angel " + anjo.getNome() + " has performed an action.");
    }
}