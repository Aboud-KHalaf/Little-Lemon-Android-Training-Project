# TopAppBar

## Purpose / Responsibility
The `TopAppBar` Composable serves as the header for the application. It provides consistent branding and navigation triggers across different screens.

## Input Parameters
- `scaffoldState: ScaffoldState?` (Optional): Used to control the drawer state (e.g., opening the side menu).
- `scope: CoroutineScope?` (Optional): A coroutine scope used to launch UI-related tasks like opening the drawer.

## How it works within the UI
It is typically placed at the very top of the screen. In this project, it is used within the `HomeScreen` to provide a standard top navigation bar.

## Simple Explanation
Think of this as the "header" of a website. It contains:
1. A **Menu Icon** (Hamburger): Intended to open a side navigation drawer.
2. The **Little Lemon Logo**: Placed in the center for branding.
3. A **Cart Icon**: For future shopping cart functionality.

It uses a `Row` layout with `Arrangement.SpaceBetween` to push the icons to the sides and keep the logo centered.
