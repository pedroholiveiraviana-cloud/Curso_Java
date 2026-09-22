// uma classe pode implementar várias interfaces ao mesmo tempo, separadas por vírgula
// e também pode usar herança
public  class Computer implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
     System.out.print("Computer play a musica ");
    }

    @Override
    public void pauseMusic() {
     System.out.print("Computer pause a musica ");
    }

    @Override
    public void stopMusic() {
     System.out.print("Computer stop a musica ");
    }

    @Override
    public void playVideo() {
     System.out.print("Computer play o video ");
    }

    @Override
    public void pauseVideo() {
     System.out.print("Computer pause o video ");
    }

    @Override
    public void stopVideo() {
     System.out.print("Computer stop o video ");
    }
}
