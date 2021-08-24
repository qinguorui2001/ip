public class ListCommand extends Command{
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showList(tasks, tasks.getSize());
    }

    @Override
    public boolean isExit() {
        return false;
    }
}