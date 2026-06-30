package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void shouldAddTask() {
        TaskManager manager = new TaskManager();
        Task task = new Task("Teste", "Alta", "A Fazer");

        manager.addTask(task);

        assertEquals(1, manager.getTasks().size());
    }
}