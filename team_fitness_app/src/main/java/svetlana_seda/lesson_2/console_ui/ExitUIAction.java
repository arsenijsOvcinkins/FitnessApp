package svetlana_seda.lesson_2.console_ui;

public class ExitUIAction implements UIAction {
    public void execute() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}

