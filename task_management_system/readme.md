Task Management System (LLD)
Problem Statement
Design and implement a Task Management System that allows users to create, assign, update, and track tasks. The system should support task priorities, statuses, comments, and user assignment.

Requirements
Task Creation: Users can create tasks with a title, description, priority, and assignee.
Task Assignment: Tasks can be assigned to users and reassigned as needed.
Task Status: Tasks can have statuses such as TODO, IN_PROGRESS, DONE, etc.
Task Priority: Tasks can have priorities such as LOW, MEDIUM, HIGH.
Comments: Users can add comments to tasks.
Task Updates: Tasks can be updated (status, priority, assignee, etc.).
Task Listing: List all tasks, or filter by status, priority, or assignee.
Extensibility: Easy to add new statuses, priorities, or features.
Core Entities
Task: Represents a task with title, description, status, priority, assignee, and comments.
User: Represents a user who can create, assign, and be assigned tasks.
Comment: Represents a comment on a task.
TaskStatus: Enum for task statuses (TODO, IN_PROGRESS, DONE, etc.).
TaskPriority: Enum for task priorities (LOW, MEDIUM, HIGH).
TaskManager: Manages the collection of tasks and provides methods for task operations.