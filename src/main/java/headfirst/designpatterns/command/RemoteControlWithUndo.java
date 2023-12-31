package headfirst.designpatterns.command;

public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommands;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommands = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommands = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommands = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommands.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ 리모컨 ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "]" + onCommands[i].getClass().getName()
                    + "     " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommands.getClass().getName() + "\n");

        return stringBuff.toString();
    }
}