// Clase concreta Ave
class Ave extends Animal {
    @Override
    public void emitirSonido() {
        reproducirSonido("sonidos/ave.mp3");
    }
}
