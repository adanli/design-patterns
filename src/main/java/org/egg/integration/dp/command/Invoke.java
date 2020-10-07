package org.egg.integration.dp.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 实际执行command命令的类
 */
public class Invoke {
    private List<Command> commands = new ArrayList<>();

    public void attach(Command command) {
        commands.add(command);
    }

    public void patchExecuteCommand() {
        for(Command command: commands) {
            command.execute();
        }
    }

}
