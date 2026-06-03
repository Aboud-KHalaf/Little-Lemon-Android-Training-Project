# LowerPanel

## Purpose / Responsibility
The `LowerPanel` displays the restaurant's menu items and highlights special offers. It handles the list of available dishes and user interaction to see more details about a specific dish.

## Input Parameters
- `navController: NavHostController`: Used to navigate to the `DishDetails` screen when a menu item is clicked.
- `dishes: List<Dish>`: The list of dish data to be displayed.

## Included Components
### WeeklySpecialCard
A simple card at the top of the list that highlights "Weekly Specials". It uses the `Card` component for a elevated look.

### MenuDish
Represents an individual item in the menu list. 
- **Interaction**: When clicked, it tells the `navController` to go to the details screen for that specific dish ID.
- **Visuals**: Displays dish information and a separator line (`Divider`) below it.

## How it works within the UI
It uses a `LazyColumn` for the menu list. `LazyColumn` is the Jetpack Compose equivalent of a "RecyclerView" – it only renders the items currently visible on the screen, making it very efficient for long lists.

## Simple Explanation
Think of this as the "Menu Card". 
- At the top, there's a label for specials.
- Below that is a scrollable list of food. 
- If you tap on a food item, the app takes you to a new screen to see more about that specific meal.
