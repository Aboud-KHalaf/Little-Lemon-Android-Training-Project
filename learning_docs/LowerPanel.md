# LowerPanel

## Purpose / Responsibility
The `LowerPanel` displays the restaurant's menu items. It is designed as a clean, list-based interface that allows users to browse dishes and select them for more details.

## Input Parameters
- `navController: NavHostController`: Used for navigation between screens.
- `dishes: List<Dish>`: The list of menu data to be displayed.

## Included Components
### WeeklySpecialCard
A header section that prominently displays the text "Weekly Special" to guide the user to the current highlights.

### MenuDish
A refined row component for each dish. It handles its own click interaction to navigate to the dish details.

## How it works within the UI
It uses a `LazyColumn` for efficiency. Unlike the `UpperPanel`, which is a static hero section, the `LowerPanel` is dynamic and scrollable. 

## Simple Explanation
Think of this as the **Main Menu**. 
- It starts with a clear heading.
- It then lists all the food items available.
- Each item is separated by a thin line (`Divider`) to make it easy to read, just like a modern restaurant menu app.
