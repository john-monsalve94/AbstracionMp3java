// Clase concreta Gato
class Gato extends Animal {
    @Override
    public void emitirSonido() {
        reproducirSonido("sonidos/gato.mp3");
    }
}
