# MenuDish

## Purpose / Responsibility
The `MenuDish` Composable represents a single row or item in the restaurant's menu list. It provides a summary of a dish and allows the user to click it to see more details.

## Input Parameters
- `navController: NavHostController?` (Optional): Used to navigate to the `DishDetails` screen when the dish is clicked.
- `dish: Dish`: The data object containing information about the dish (name, price, etc.).

## How it works within the UI
It is used inside a `LazyColumn` in the `LowerPanel`. 
- It uses a `Card` component to make the item clickable.
- When clicked, it uses the `navController` to navigate to a route like `"Menu/1"`, where `1` is the ID of the dish.
- It also includes a `Divider` at the bottom to separate it from the next item in the list.

## Simple Explanation
Think of this as a single "entry" in a menu. It shows the name and price of the food. If you like the look of it, you tap it to open a full page with more info. It's like a preview card for a specific meal.
