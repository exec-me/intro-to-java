package prac4.task4;

public class ComputerTest {
    public static void main(String[] args) {
        Processor processor = new Processor("Core 2 Duo", 3.0);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor(27.0, "1920x1080");
        Computer computer = new Computer(Brand.HP, processor, memory, monitor);
        computer.displayInfo();
    }
}
