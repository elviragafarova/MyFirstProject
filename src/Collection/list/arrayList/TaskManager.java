package Collection.list.arrayList;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> Tasks = new ArrayList<>();
    private Integer nextId = 1;

    public Boolean isEmpty() {
        return Tasks.isEmpty();
    }


    public void addTask(String title, String description) {
        Task task = new Task(nextId++, title, description, false);
        Tasks.add(task);
    }

    public void removeTask(Integer removeId) {
        Tasks.remove(removeId);
    }

    public void updateTask(Integer id, String newTitle, String newDescription) {
        Task task = getTaskById(id);
        if (task == null) {
            System.out.println("Invalid task ID.");
        } else {
            task.setTitle(newTitle);
            task.setDescription(newDescription);
        }
    }

    private Task getTaskById(Integer id) {
        for (Task task : Tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public void markCompleted(Integer id) {
        Task task = getTaskById(id);
        task.markAsCompleted();
    }

    public void searchTask(String keyword) {
        for (Task task : Tasks) {
            if (task.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    task.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(task);
            }
        }
    }

    public void getAllTasks() {
        for (Task task : Tasks) {
            System.out.println(task);
        }
    }

    public void clearAll() {
        Tasks.clear();
    }

    public void findById(Integer id) {
        Task task = getTaskById(id);
        System.out.println(task);

    }
}

