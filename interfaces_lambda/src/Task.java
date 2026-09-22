// Interface funcional: tem exatamente UM método abstrato.
// É só nesse caso que o Java consegue implementar a interface com uma lambda
// expression, sem precisar de uma classe (como MusicBox, Computer, Smartphone,
// que existem porque MusicPlayer/VideoPlayer têm 3 métodos cada, não 1).
// @FunctionalInterface é opcional, mas faz o compilador avisar se alguém
// adicionar um segundo método abstrato aqui e quebrar esse contrato.
@FunctionalInterface
public interface Task {
    void run();
}
