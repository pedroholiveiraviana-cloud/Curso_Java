// uma classe pode implementar várias interfaces ao mesmo tempo, separadas por vírgula
// e também pode usar herança
public  class Smartphone implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
     System.out.print("celular play a musica ");
    }

    @Override
    public void pauseMusic() {
     System.out.print("celular pause a musica ");
    }

    @Override
    public void stopMusic() {
     System.out.print("celular stop a musica ");
    }

    @Override
    public void playVideo() {
     System.out.print("celular play o video ");
    }

    @Override
    public void pauseVideo() {
     System.out.print("celular pause o video ");
    }

    @Override
    public void stopVideo() {
     System.out.print("celular stop o video ");
    }
}
