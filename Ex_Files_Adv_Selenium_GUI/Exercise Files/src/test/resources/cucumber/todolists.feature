Feature: Todo Lists Management
  Basic CRUD operations for Todo Lists.

  Scenario: User can Create a Todo list
    Given a user in the todolist app
    When the user creates a todolist
    Then the todolist is displayed