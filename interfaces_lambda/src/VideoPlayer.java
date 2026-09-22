// interface: é um contrato. Ela só declara os métodos (sem corpo) e obriga toda
// classe que a implementa a fornecer o corpo de cada um deles.
// os atributos de uma interface são implicitamente static/final.
public interface VideoPlayer {
    void playVideo();

    void pauseVideo();

    void stopVideo();
}
