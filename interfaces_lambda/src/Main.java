public class Main {
    public static void main(String[] args) {
        // O tipo da variável é a interface (VideoPlayer), não a classe concreta.
        // Por isso o mesmo array pode guardar objetos de classes diferentes,
        // desde que todas implementem VideoPlayer. Isso é polimorfismo:
        // o método runVideo() nem precisa saber se é um Computer ou um Smartphone.

        VideoPlayer[] videoPlayers = { new Computer(), new Smartphone() };
        for (VideoPlayer videoPlayer : videoPlayers) {
            runVideo(videoPlayer);
            pauseVideo(videoPlayer);
            stopVideo(videoPlayer);
            System.out.println();
        }

        // MusicBox só sabe tocar música (implementa apenas MusicPlayer), enquanto
        // Computer e Smartphone implementam MusicPlayer e VideoPlayer ao mesmo tempo.

        MusicPlayer[] musicPlayers = { new Computer(), new Smartphone(), new MusicBox() };
        for (MusicPlayer musicPlayer : musicPlayers) {
            runMusicPlayer(musicPlayer);
            pauseMusicPlayer(musicPlayer);
            stopMusicPlayer(musicPlayer);
            System.out.println();
        }

        System.out.println();
        runLambdaExamples();
    }

    public static void runLambdaExamples() {
        MusicPlayer computer = new Computer();

        // Isto NÃO compilaria: MusicPlayer tem 3 métodos abstratos (playMusic,
        // pauseMusic, stopMusic), então o compilador não sabe qual deles a
        // lambda estaria implementando.
        // MusicPlayer invalido = () -> System.out.println("tocando");

        // Antes de existir lambda, a única forma de "guardar" uma chamada de
        // método para executar depois era com uma classe anônima implementando
        // a interface funcional inteira (nome da interface + @Override + corpo):

        Task playTaskAntigo = new Task() {
            @Override
            public void run() {
                computer.playMusic();
            }
        };

        // Lambda expression: como Task só tem UM método abstrato (run), o
        // compilador já sabe que "() -> computer.pauseMusic()" É a implementação
        // desse método. Não precisa mais escrever "new Task() { ... }".
        // Forma geral: (parâmetros) -> expressão   ou   (parâmetros) -> { comandos; }

        Task pauseTask = () -> computer.pauseMusic();

        // Method reference: quando a lambda só repassa a chamada para um método
        // que já existe, dá pra encurtar ainda mais com objeto::metodo.
        // "computer::stopMusic" é o mesmo que "() -> computer.stopMusic()".

        Task stopTask = computer::stopMusic;

        playTaskAntigo.run();
        pauseTask.run();
        stopTask.run();
        System.out.println();
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }
    public static void pauseVideo(VideoPlayer videoPlayer){
        videoPlayer.pauseVideo();
    }
    public static void stopVideo(VideoPlayer videoPlayer){
        videoPlayer.stopVideo();
    }
    public static void runMusicPlayer(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
    public static void pauseMusicPlayer(MusicPlayer musicPlayer){
        musicPlayer.pauseMusic();
    }
    public static void stopMusicPlayer(MusicPlayer musicPlayer){
        musicPlayer.stopMusic();
    }
}
