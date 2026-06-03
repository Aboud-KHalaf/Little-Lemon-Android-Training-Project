# HomeScreen

## Purpose / Responsibility
The `HomeScreen` is a high-level screen Composable that acts as the container for the main landing page of the Little Lemon app. It orchestrates the layout by combining several major UI components.

## Input Parameters
- `navController: NavHostController`: The navigation controller used to handle transitions between different screens (e.g., from Home to Dish Details).

## How it works within the UI
It uses a `Column` to stack three main parts of the home page vertically:
1. `TopAppBar`: The header.
2. `UpperPanel`: The hero/welcome section.
3. `LowerPanel`: The menu list section.

## Simple Explanation
Imagine this as the "Home Page" of an app. It doesn't define much UI itself, but rather tells the app: "First show the top bar, then show the welcome section, and then show the list of food." It's like a manager delegating work to different departments.
