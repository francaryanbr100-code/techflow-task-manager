package org.example;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Corrigir bug de login", "Alta", "A Fazer");
        manager.addTask(task1);

        System.out.println("Tarefas cadastradas:");

        for (Task task : manager.getTasks()) {
            System.out.println(
                    task.getTitle() +
                            " | Prioridade: " +
                            task.getPriority()
            );
        }
    }
}
