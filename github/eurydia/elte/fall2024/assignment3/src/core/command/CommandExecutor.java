package core.command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    private static final List<Runnable> QUEUE = new ArrayList<>();

    public static void add(Runnable command) {
        QUEUE.add(command);
    }

    public static void execute() {
        if (!QUEUE.isEmpty()) {
            QUEUE.removeFirst().run();
        }
    }
    public static void clear() {
        QUEUE.clear();
    }
}
