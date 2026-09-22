// uma classe pode implementar várias interfaces ao mesmo tempo, separadas por vírgula
// e também pode usar herança
public  class MusicBox implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.print("MusicBox play a musica ");
    }

    @Override
    public void pauseMusic() {
        System.out.print("MusicBox pause a musica ");
    }

    @Override
    public void stopMusic() {
        System.out.print("MusicBox stop a musica ");
    }

}
