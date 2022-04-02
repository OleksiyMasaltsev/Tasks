package ua.masaltsev;

import ua.masaltsev.opt.Computer;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Blaster");
        Optional<Computer> optionalComputer = Optional.of(computer);

    }
}
