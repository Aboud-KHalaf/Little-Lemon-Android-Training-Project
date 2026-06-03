# MenuDish

## Purpose / Responsibility
The `MenuDish` Composable represents a single row or item in the restaurant's menu list. It provides a visual summary of a dish—including its name, description, price, and image—and handles navigation to the dish's detail page.

## Input Parameters
- `navController: NavHostController?` (Optional): Used to navigate to the `DishDetails` screen when the item is clicked.
- `dish: Dish`: The data object containing information about the dish (name, description, price, and image resource).

## How it works within the UI
It is used as a repeating item inside the `LazyColumn` of the `LowerPanel`.
- **Interaction**: The entire row is made `clickable`. When tapped, it triggers navigation using the `navController`.
- **Layout**: It uses a `Row` to align the text information (on the left) and the dish image (on the right).
- **Styling**:
    - The dish name and price are **bold** to stand out.
    - The description is limited to **2 lines** (`maxLines = 2`) to maintain a clean and consistent list height.
    - The image is sized at `100.dp` and clipped with rounded corners.
- **Visual Separation**: A light gray `Divider` is placed at the bottom of each item to clearly distinguish it from the next.

## Simple Explanation
Think of this as a single "entry" in a digital menu. It gives you a quick preview: what it is, what it looks like, and how much it costs. If you want to know more, you just tap it. It's designed to look clean and organized, just like a high-quality food delivery app.
