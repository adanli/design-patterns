package org.egg.integration.dp.command;

import org.junit.Test;

/**
 * 命令模式
 */
public class Client {
    @Test
    public void executeCommand() {
        Receiver receiver = new Receiver();
        Invoke invoke = new Invoke();
        Command command = new ConcreteCommand(receiver);
        invoke.attach(command);
        invoke.patchExecuteCommand();
    }
}
