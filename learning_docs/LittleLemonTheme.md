# LittleLemonTheme

## Purpose / Responsibility
`LittleLemonTheme` is the custom theme wrapper for the application. It ensures that all Composables within the app follow the Little Lemon brand guidelines for colors, typography, and shapes.

## Input Parameters
- `darkTheme: Boolean` (Optional): Determines if the dark or light color palette should be used.
- `content: @Composable () -> Unit`: The UI components that will be styled by this theme.

## How it works within the UI
It is used in `MainActivity` to wrap the entire `NavHost`. This means every screen in the app inherits the styles defined here.

## Simple Explanation
Think of this as the "Uniform" or "Dress Code" for the app. Instead of telling every piece of text what color or font to use, we wrap everything in the `LittleLemonTheme`. It sets the overall look and feel, ensuring consistency across the whole application.
