package TMSTasks.Computer;

public interface Random {
    default int random(){
        return (int) (Math.random()*2); // от 0 до 1
    }
}
