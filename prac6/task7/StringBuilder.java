package prac6.task7;

import java.util.Stack;

interface Command {
    void execute();
    void undo();
}

class AppendCommand implements Command {
    private CustomStringBuilder sb;
    private String str;

    public AppendCommand(CustomStringBuilder sb, String str) {
        this.sb = sb;
        this.str = str;
    }

    @Override
    public void execute() {
        sb.getDelegate().append(str);
    }

    @Override
    public void undo() {
        sb.getDelegate().delete(
                sb.getDelegate().length() - str.length(),
                sb.getDelegate().length()
        );
    }
}

class CustomStringBuilder {
    private StringBuilder delegate;
    private Stack<Command> commandHistory;

    public CustomStringBuilder() {
        delegate = new StringBuilder();
        commandHistory = new Stack<>();
    }

    public CustomStringBuilder append(String str) {
        Command command = new AppendCommand(this, str);
        command.execute();
        commandHistory.push(command);
        return this;
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }

    public StringBuilder getDelegate() {
        return delegate;
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}

